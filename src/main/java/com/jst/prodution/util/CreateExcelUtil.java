package com.jst.prodution.util;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;

import com.alibaba.fastjson.JSONObject;

public class CreateExcelUtil{
	//导出的文件名
	private String fileName;
	//显示的导出表的标题  
    private String title;  
    //导出表的列名  
    private Object[] rowsName ;  
    //导出表的列宽
    private int[] colWidth;
    
      
    private List<Object[]>  dataList = new ArrayList<Object[]>();  
      
    public static final Integer EXPORT_EXCEL_SHEET_COUNT = 60000;    //设置每个sheet数量
    
    //构造方法，传入要导出的数据  
    public CreateExcelUtil(String fileName,String title,int[] colWidth, List<Object[]>  dataList){  
        this.dataList = dataList;  
        this.colWidth = colWidth;
        this.fileName = fileName;
        this.title = title; 
    }  
              
    /* 
     * 导出数据 
     * */  
    @SuppressWarnings("static-access")
	public HSSFWorkbook export() throws Exception{  
        HSSFWorkbook workbook = new HSSFWorkbook();                     // 创建工作簿对象  
        try{  
            HSSFSheet sheet = workbook.createSheet(title+1);                  // 创建工作表  
            HSSFCellStyle columnTopStyle = this.getColumnTopStyle(workbook);//获取列头样式对象  
            HSSFCellStyle style = this.getStyle(workbook);   //单元格样式对象     
            HSSFCellStyle titleStyle = this.getTitleStyle(workbook);   //单元格样式对象     

            setSheetColumn(sheet);//设置工作薄列宽  
            int sheetNum = 1;
            int bodyRowCount = 0;//正文内容行号  
            int currentRowCount = 0;//当前的行号 
            
            //将查询出的数据设置到sheet对应的单元格中  
            for(int i=0;i<dataList.size();i++){  
                Object[] obj = dataList.get(i);//遍历每个对象  
                HSSFRow row = sheet.createRow(bodyRowCount);//创建所需的行数  
                if(i==2){
                    writeTitleContent(sheet,columnTopStyle, obj);//创建标题
                }else{
                    for(int j=0; j<obj.length; j++){
                    	Boolean isNum = false;//data是否为数值型
                    	 if (obj[j] != null || "".equals(obj[j])) {
                    		 if(obj[j].getClass().getName().equals("java.math.BigDecimal")){
                    			 //判断data是否为数值型
                                 isNum = obj[j].toString().trim().matches("^(-?\\d+)(\\.\\d+)?$");
                    		 }
                         }
                        HSSFCell  cell = row.createCell(j);   //设置单元格的数据类型  
                        if (isNum) {
                            HSSFDataFormat df = workbook.createDataFormat(); // 此处设置数据格式
                            titleStyle.setDataFormat(df.getBuiltinFormat("0.00"));//保留两位小数点
                            cell.setCellStyle(titleStyle);
                            cell.setCellValue(Double.parseDouble(obj[j].toString().trim()));
                        } else {
                        	if(i<2){
                            	cell.setCellStyle(style);
                        	} else {
                            	cell.setCellStyle(titleStyle);
                        	}
                            // 设置单元格内容为字符型
                        	if(!"".equals(obj[j]) && obj[j] != null){
                        		System.out.println("输入数据:"+obj[j].toString().trim());
                        		cell.setCellValue(obj[j].toString().trim());
                        	}
                        }
                    }
                }

  	           currentRowCount++;
                if(currentRowCount % this.EXPORT_EXCEL_SHEET_COUNT == 0){  
	                sheet=null;  
	                sheetNum++;//工作薄编号递增1  
	                sheet = workbook.createSheet(title+sheetNum);//创建一个新的工作薄  
	                setSheetColumn(sheet);//设置工作薄列宽  
	                bodyRowCount = 0;//正文内容行号置位为0  
	                writeTitleContent(sheet,columnTopStyle,dataList.get(2));//写入标题            
	            } 
               bodyRowCount++;
            }  
            if(workbook ==null){
            	System.out.println("workbook为空");
            } 
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        return workbook;
    }  
    
    /**
     * 
    * @Title: setSheetColumn 
    * @Description: TODO(设置列宽) 
    * @param @param sheet     
    * @return void    
    * @throws
     */
    public void setSheetColumn(HSSFSheet sheet){
		for (int i = 0; i < colWidth.length; i++) {  
            sheet.setColumnWidth(i, 32 * colWidth[i]);  
        } 
	}
    
    /**
     * 
    * @Title: writeTitleContent 
    * @Description: TODO(创建标题栏) 
    * @param @param sheet
    * @param @param columnTopStyle     
    * @return void    
    * @throws
     */
    public void writeTitleContent(HSSFSheet sheet,HSSFCellStyle columnTopStyle,Object[] rows){//写入标题
    	int columnNum = rows.length;
    	HSSFRow rowRowName = sheet.createRow(2);//在索引2的位置创建行
    	rowRowName.setHeightInPoints((short)25);//设置行高
        // 将列头设置到sheet的单元格中  
        for(int n=0;n<columnNum;n++){  
            HSSFCell  cellRowName = rowRowName.createCell(n);//创建列头对应个数的单元格  
            cellRowName.setCellType(HSSFCell.CELL_TYPE_STRING);//设置列头单元格的数据类型  
            HSSFRichTextString text = new HSSFRichTextString(rows[n].toString());  
            cellRowName.setCellValue(text);//设置列头单元格的值  
            cellRowName.setCellStyle(columnTopStyle);//设置列头单元格样式  
        }
    }
    
    /*  
     * 列头单元格样式 
     */      
    public HSSFCellStyle getColumnTopStyle(HSSFWorkbook workbook) {    
          // 设置字体  
          HSSFFont font = workbook.createFont();  
          //设置字体大小  
          font.setFontHeightInPoints((short)9);  
          //字体加粗  
          font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);  
          //设置字体名字   
          font.setFontName("微软雅黑");
          //设置样式;   
          HSSFCellStyle style = workbook.createCellStyle();  
          //设置背景颜色
          style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
    	  style.setFillPattern(CellStyle.SOLID_FOREGROUND);
          //设置底边框;   
          style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
          //设置底边框颜色;    
          style.setBottomBorderColor(HSSFColor.BLACK.index);  
          //设置左边框;     
          style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
          //设置左边框颜色;   
          style.setLeftBorderColor(HSSFColor.BLACK.index);  
          //设置右边框;   
          style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
          //设置右边框颜色;   
          style.setRightBorderColor(HSSFColor.BLACK.index);  
          //设置顶边框;   
          style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
          //设置顶边框颜色;    
          style.setTopBorderColor(HSSFColor.BLACK.index);  
          //在样式用应用设置的字体;    
          style.setFont(font);  
          //设置自动换行;   
          style.setWrapText(false);  
          //设置水平对齐的样式为居中对齐;    
          style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
          //设置垂直对齐的样式为居中对齐;   
          style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
          return style;      
    }  
      
    /*   
     * 列数据信息单元格样式 
     */    
    public HSSFCellStyle getStyle(HSSFWorkbook workbook) {  
          // 设置字体  
          HSSFFont font = workbook.createFont();  
          //设置字体大小  
          font.setFontHeightInPoints((short)9);  
          //设置字体名字   
          font.setFontName("微软雅黑");  
          //设置样式;   
          HSSFCellStyle style = workbook.createCellStyle();  
          //设置底边框;   
//          style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
          //设置底边框颜色;    
//          style.setBottomBorderColor(HSSFColor.BLACK.index);  
          //设置左边框;     
//          style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
          //设置左边框颜色;   
//          style.setLeftBorderColor(HSSFColor.BLACK.index);  
          //设置右边框;   
//          style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
          //设置右边框颜色;   
//          style.setRightBorderColor(HSSFColor.BLACK.index);  
          //设置顶边框;   
//          style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
          //设置顶边框颜色;    
          style.setTopBorderColor(HSSFColor.BLACK.index);  
          //在样式用应用设置的字体;    
          style.setFont(font);  
          //设置自动换行;   
          style.setWrapText(false);  
          //设置水平对齐的样式为居中对齐;    
          style.setAlignment(HSSFCellStyle.ALIGN_LEFT);  
          //设置垂直对齐的样式为居中对齐;   
          style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
          return style;  
    }
    
    /*   
     * 列数据信息单元格样式 
     */    
    public HSSFCellStyle getTitleStyle(HSSFWorkbook workbook) {  
          // 设置字体  
          HSSFFont font = workbook.createFont();  
          //设置字体大小  
          font.setFontHeightInPoints((short)9);  
          //设置字体名字   
          font.setFontName("微软雅黑");  
          //设置样式;   
          HSSFCellStyle style = workbook.createCellStyle();  
          //设置底边框;   
          style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
          //设置底边框颜色;    
          style.setBottomBorderColor(HSSFColor.BLACK.index);  
          //设置左边框;     
          style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
          //设置左边框颜色;   
          style.setLeftBorderColor(HSSFColor.BLACK.index);  
          //设置右边框;   
          style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
          //设置右边框颜色;   
          style.setRightBorderColor(HSSFColor.BLACK.index);  
          //设置顶边框;   
          style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
          //设置顶边框颜色;    
          style.setTopBorderColor(HSSFColor.BLACK.index);  
          //在样式用应用设置的字体;    
          style.setFont(font);  
          //设置自动换行;   
          style.setWrapText(false);  
          //设置水平对齐的样式为居中对齐;    
          style.setAlignment(HSSFCellStyle.ALIGN_LEFT);  
          //设置垂直对齐的样式为居中对齐;   
          style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
          return style;  
    }
    
}