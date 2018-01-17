package com.jst.prodution.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.jdom.xpath.XPath;
import org.xml.sax.InputSource;

import com.jst.prodution.constants.ApiConstants;

/**
 * @author 汤广海
 * 2016-10-31 XML工具类
 *
 */
public class JDomHandler {

	private Document doc;
	private Format format = Format.getPrettyFormat();
	
	private static ILogger log = new ILogger(ApiConstants.JST_FINANCE_API, JDomHandler.class);
	private XMLOutputter outputter = new XMLOutputter(this.format);
	private static final Map<Class<?>, Object> primitiveDefaults = new HashMap<Class<?>, Object>();
	
	static {
		primitiveDefaults.put(Integer.TYPE, new Integer(0));
		primitiveDefaults.put(Short.TYPE, new Short((short)0));
		primitiveDefaults.put(Byte.TYPE, new Byte((byte)0));
	    primitiveDefaults.put(Float.TYPE, new Float(0.0F));
	    primitiveDefaults.put(Double.TYPE, new Double(0.0D));
	    primitiveDefaults.put(Long.TYPE, new Long(0L));
	    primitiveDefaults.put(Boolean.TYPE, Boolean.FALSE);
	    primitiveDefaults.put(Character.TYPE, new Character('\000'));
	}

	public JDomHandler() {
		setEncoding(ApiConstants.ENCODE);
	}
	
	/**
	 * 设置编码格式
	 */
	public void setEncoding(String encoding){
		this.format.setEncoding(encoding);
	}
	
	/**
	 * function:向指定路径添加子节点,若指定路径不存在,则先生成指定路径再添加
	 * @param parentElementPath 指定路径
	 * @param element 子节点
	 * @return Document
	 * @throws JDOMException
	 */
	public Document addNode(String parentElementPath, Element element) throws JDOMException{
		Element parentElement = null;
		if((parentElementPath == null) || ("".equals(parentElementPath))){
			log.warn("XML操作|添加节点值异常：父节点输入不能为空，或者不能为null");
			return this.doc;
		}
		if(!hasNode(parentElementPath)){
			checkPathNodes(parentElementPath);
		}
		parentElement = (Element) XPath.selectSingleNode(this.doc, parentElementPath);
		parentElement.addContent(element);
		return this.doc;
	}
	
	/**
	 * 向指定路径添加数组节点,若路径存在则产生新的路径(如下:)
	 * <extDate>
     *		<value>v1</value>
     *		<key>k1</key>
  	 *  	</extDate>
     * <extDate>
     *		<value>v1</value>
     *		<key>k1</key>
  	 * </extDate>
	 * @param path
	 * @param nodes
	 * @return
	 * @throws JDOMException
	 */
	public Document addArrayNodes(String path, Map<String, String> nodes) throws JDOMException{
		int lastIndex = path.lastIndexOf("/");
		String parentElementPath = path.substring(0, lastIndex);
		String elementName = path.substring(lastIndex + 1, path.length());
		Element parentElement = new Element(elementName);
		for (Entry<String, String> map : nodes.entrySet()) {
			Element child = new Element(map.getKey());
			child.setText(map.getValue());
			parentElement.addContent(child);
		}
		return addNode(parentElementPath, parentElement);
	}
	
	/**
	 * function:向父节点添加子节点,若父节点路径下对应的子节点已存在,则不添加,父节点路径不存在也不添加
	 * @param parenElementPath 父节点的路径
	 * @param elementName 添加子节点的名称
	 * @return Document
	 */
	public Document addNode(String parenElementPath, String elementName){
		Element parentElement = null;
		if((parenElementPath == null) || ("".equals(parenElementPath))){
			log.warn("XML操作|添加节点值异常：父节点输入不能为空，或者不能为null");
			return this.doc;
		}
		if((elementName == null) || "".equals(elementName)){
			log.warn("XML操作|添加节点值异常：设置的节点输入不能为空，或者不能为null");
			return this.doc;
		}
		if(!hasNode(parenElementPath + "/" + elementName)){
			try {
				parentElement = (Element) XPath.selectSingleNode(this.doc, parenElementPath);
			} catch (JDOMException e) {
				log.warn("XML操作|根据路径查找节点出错", e);
			}
			if(parentElement != null){
				parentElement.addContent(new Element(elementName));
			}else{
				log.warn("XML操作|缺少父节点");
			}
		}
		return this.doc;
	}
	
	/**
	 * function:向父节点添加子节点及赋值
	 * @param parentElementPath 父节点
	 * @param elementName 子节点名称
	 * @param value 子节点值
	 * @return Document
	 */
	public Document addNodeValue(String parentElementPath,String elementName,String value){
		Element parentElement = null;
		if((parentElementPath == null) || ("".equals(parentElementPath))){
			log.warn("XML操作|添加节点值异常：父节点输入不能为空，或者不能为null");
			return this.doc;
		}
		if((elementName == null) || ("".equals(elementName))){
			log.warn("XML操作|添加节点值异常：设置的节点输入不能为空，或者不能为null");
			return this.doc;
		}
		if(value == null){
			value = "";
		}
		try {
			/*获取父节点*/
			parentElement = (Element) XPath.selectSingleNode(this.doc, parentElementPath);
		} catch (JDOMException e) {
			log.warn("XML操作|根据路径查询节点出错",e);
			return this.doc;
		}
		/*对父节点添加子节点*/
		parentElement.addContent(new Element(elementName).setText(value));
		return this.doc;
	}
	
	/**
	 * function:给指定路径下的节点赋值(若路径不存在则补全路径,若存在则覆盖)
	 * @param path 路径
	 * @param value 值
	 * @return Document
	 */
	public Document addNodeValue(String path, String value){
		if(!hasNode(path)){
			checkPathNodes(path);
		}
		String parentElementPath = "";
		String elementName = "";
		int lastIndex = path.lastIndexOf("/");
		parentElementPath = path.substring(0, lastIndex);
		elementName = path.substring(lastIndex + 1, path.length());
		Element parentElement = null;
		if((parentElementPath == null) || ("".equals(parentElementPath))){
			log.warn("XML操作|添加节点值异常：父节点输入不能为空，或者不能为null");
			return this.doc;
		}
		if((elementName == null) || ("".equals(elementName))){
			log.warn("XML操作|添加节点值异常：设置的节点输入不能为空，或者不能为null");
			return this.doc;
		}
		if(value == null){
			value = "";
		}
		try {
			parentElement = (Element) XPath.selectSingleNode(this.doc, path);
		} catch (JDOMException e) {
			log.warn("XML操作|根据路径查找节点出错",e);
			return this.doc;
		}
		parentElement.setText(value);
		return this.doc;
	}
	
	/**
	 * function:纠查报文路径,若报文路径不存在,则逐级补全路径
	 * @param path
	 */
	public void checkPathNodes(String path){
		String[] pathNames = path.split("/");
		String headPath = "";
		String tailName = "";
		for (int i = 0; i < pathNames.length - 1; i++) {
			if( i == 0){
				headPath = pathNames[i];
			}else{
				headPath = headPath + "/" + pathNames[i];
			}
			tailName = pathNames[i + 1];
			if(!hasNode(headPath + "/" + tailName)){
				addNode(headPath, tailName);
			}
		}
	}
	
	/**
	 * function:获取节点属性对应的值
	 * @param path 节点路径
	 * @param attribute 节点属性
	 * @return 节点属性值
	 */
	public String getNodeAttribute(String path, String attribute){
		Element visitElement = null;
		String attributeStr = "";
		try {
			visitElement = (Element) XPath.selectSingleNode(this.doc, path);
		} catch (JDOMException e) {
			log.warn("XML操作|根据路径查找节点出错", e);
			return null;
		}
		if(visitElement != null){
			Attribute attr = visitElement.getAttribute(attribute);
			if(attr == null){
				log.warn("XML操作|获取xml节点属性异常：当前报文节点不存在当前属性");
				return null;
			}
			attributeStr = attr.getValue();
		}else{
			log.warn("XML操作|获取xml节点属性异常：不存在当前报文节点");
			return null;
		}
		return attributeStr;
	}
	
	/**
	 * function:获取节点属性集
	 * @param path 节点路径
	 * @return List<Attribute>
	 */
	public List<Attribute> getNodeAttributes(String path){
		Element visitElement = null;
		try {
			visitElement = (Element) XPath.selectSingleNode(this.doc, path);
			if(visitElement != null){
				List<Attribute> attributes = visitElement.getAttributes();
				return attributes;
			}else{
				log.warn("XML操作|获取xml节点属性异常：不存在当前报文节点");
				return null;
			}
		} catch (JDOMException e) {
			log.warn("XML操作|根据路径查找节点出错", e);
		}
		return null;
	}
	
	/**
	 * function:给加节点属性并赋值
	 * @param path 节点路径
	 * @param attributeName 属性名称
	 * @param value 属性值
	 */
	public void addNodeAttribute(String path, String attributeName, String value){
		Element visitElement = null;
		try {
			visitElement = (Element) XPath.selectSingleNode(this.doc, path);
		} catch (JDOMException e) {
			log.warn("XML操作|根据路径查找节点出错");
		}
		if(visitElement != null){
			visitElement.setAttribute(attributeName, value);
		}else{
			log.warn("XML操作|获取xml节点属性异常：不存在当前报文节点");
		}
	}
	
	/**
	 * function:给节点添加属性集
	 * @param path 节点路径
	 * @param attributeMap 属性集
	 */
	public void addNodeAttribute(String path, Map<String, String> attributeMap){
		Element visitElement = null;
		try {
			visitElement = (Element) XPath.selectSingleNode(this.doc, path);
		} catch (JDOMException e) {
			log.warn("XML操作|根据路径查找节点出错", e);
			return;
		}
		if(visitElement != null){
			for (Map.Entry<String, String> entry : attributeMap.entrySet()) {
				visitElement.setAttribute(entry.getKey(), entry.getValue());
			}
		}else{
			log.warn("XML操作|获取xml节点属性异常：不存在当前报文节点");
		}
	}
	 
	/**
	 * function:获取节点值
	 * @param path 路径
	 * @return 节点值
	 */
	public String getNodeValue(String path){
		Element visitElement = null;
		String value = "";
		try {
			visitElement = (Element) XPath.selectSingleNode(this.doc, path);
		} catch (JDOMException e) {
			log.warn("XML操作|根据路径查找节点出错", e);
			return "";
		}
		if(visitElement != null){
			value = visitElement.getValue();
		}else{
			log.warn("XML操作|获取报文节点的值出错：当前节点不存在，节点路径为[" + path + "]");
			return "";
		}
		return value;
	}
	
	/**
	 * function:获取相同节点值的集合
	 * @param path 路径
	 * @return List<String>
	 */
	public List<String> getSameNodeValues(String path){
		List<?> nodes = null;
		List<String> valueList = new ArrayList<String>();
		try {
			nodes = XPath.selectNodes(this.doc, path);
			for (Object e : nodes) {
				Element element = (Element) e;
				valueList.add(element.getText());
			}
		} catch (JDOMException e) {
			log.warn("XML根据路径查找节点出错", e);
		}
		return valueList;
	}
	
	/**
	 * function:获取单节点
	 * @param path 路径
	 * @return Element
	 * @throws JDOMException
	 */
	public Element getNode(String path) throws JDOMException{
		Element visitElement = null;
		visitElement = (Element) XPath.selectSingleNode(this.doc, path);
		return visitElement;
	}
	
	/**
	 * function:获取多个相同路径节点
	 * @param path 路径
	 * @return List<Element>
	 * @throws JDOMException
	 */
	public List<Element> getNodes(String path) throws JDOMException{
		List<Element> list = null;
		list = XPath.selectNodes(this.doc, path);
		return list;
	}
	
	/**
	 * function:检查当前路径节点是否存在
	 * @param path 节点路径
	 * @return boolean
	 */
	public boolean hasNode(String path){
		Element element = null;
		try {
			element = (Element) XPath.selectSingleNode(this.doc, path);
		} catch (JDOMException e) {
			log.warn("XML操作|根据路局查找节点出错", e);
		}
		return (element != null);
	}
	
	/**
	 * function:设置节点值,若节点不存在,则添加新节点
	 * @param path 节点路径
	 * @param nodValue 节点值
	 * @return
	 */
	public Document setNodeValue(String path, Object nodValue){
		String value = ((nodValue == null) ? "" : nodValue.toString());
		/*如果path已经存在,则修改节点值,否则添加一个新节点*/
		if(hasNode(path)){
			try {
				modifyNodeValue(path, value);
			} catch (JDOMException e) {
			}
		}else{
			addNodeValue(path, value);
		}
		return this.doc;
	}
	
	/**
	 * function:修改节点值
	 * @param path 节点路径
	 * @param value 节点值
	 * @return
	 * @throws JDOMException
	 */
	private Document modifyNodeValue(String path, String value) throws JDOMException{
		Element element = (Element) XPath.selectSingleNode(this.doc, path);
		element.setText(value);
		return this.doc;
	}
	
	/**
	 * function:删除指定路径下的所有子节点
	 * @param path 路径
	 * @param doc XML报文
	 * @return Document
	 * @throws JDOMException
	 */
	public Document removeSubNodes(String path, Document doc) throws JDOMException{
		this.doc = doc;
		List<Element> nodes = getNodes(path);
		for (Element element : nodes) {
			element.removeContent();
		}
		return doc;
	}
	
	/**
	 * function:删除当前节点
	 * @param removeNodeName 当前节点路径
	 * @return Document
	 * @throws JDOMException
	 */
	public Document removeNode(String removeNodeName) throws JDOMException{
		Element visitElement = null;
		visitElement = (Element) XPath.selectSingleNode(this.doc, removeNodeName);
		if(visitElement != null){
			visitElement.getParent().removeContent(visitElement);
		}
		return this.doc;
	}
	
	public Document getDoc(){
		return this.doc;
	}
	
	public void setDoc(Document doc){
		this.doc = doc;
	}
	
	/**
	 * function:通过指定的XML文件路径加载一个Document
	 * @param path
	 * @return Document
	 * @throws JDOMException
	 * @throws IOException
	 */
	public Document loadXmlByPath(String path) throws JDOMException, IOException{
		SAXBuilder builder = new SAXBuilder(false);
		InputStream resourceAsStream = ClassLoader.class.getResourceAsStream(path);
		this.doc = builder.build(resourceAsStream);
		return doc;
	}
	
	/**
	 * function
	 * @param xml
	 * @return
	 * @throws JDOMException
	 * @throws IOException
	 */
	public Document loadXmlByString(String xml) throws JDOMException, IOException{
		StringReader read = new StringReader(xml);
		InputSource source = new InputSource(read);
		SAXBuilder sb = new SAXBuilder();
		this.doc = sb.build(source);
		return this.doc;
	}
	
	/**
	 * function:通过File形式加载一个Document
	 * @param file
	 * @return Document
	 * @throws IOException 
	 * @throws JDOMException 
	 */
	public Document loadXmlByFile(File file) throws JDOMException, IOException{
		SAXBuilder builder = new SAXBuilder(false);
		this.doc = builder.build(file);
		return this.doc;
	}
	
	/**
	 * function:通过输入流加载一个XML报文
	 * @param input
	 * @return Document
	 * @throws IOException
	 */
	public Document loadXmlByStream(InputStream input) throws IOException{
		try {
			SAXBuilder builder = new SAXBuilder(false);
			this.doc = builder.build(input);
		} catch (Exception e) {
		}finally {
			input.close();
		}
		return this.doc;
	}
	
	/**
	 * function:将XML报文保存到文件里
	 * @param file 文件
	 * @param doc XML报文
	 * @return boolean true-成功,false-失败
	 */
	public boolean saveXmlToFile(File file, Document doc){
		FileOutputStream fileOutput;
		try {
			fileOutput = new FileOutputStream(file);
			this.outputter.output(doc, fileOutput);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString(){
		String xml = "";
		if(this.doc != null){
			xml = this.outputter.outputString(this.doc);
		}
		return xml;
	}
	
	public String toString(String path) throws JDOMException{
		Element element = getNode(path);
		if(element == null){
			throw new JDOMException("节点：" + path + "不存在!");
		}
		return this.outputter.outputString(element);
	}
}
