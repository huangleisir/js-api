/*
* Copyright (c) 2015-2018 SHENZHEN GUIYI SCIENCE AND TECHNOLOGY DEVELOP CO., LTD. All rights reserved.
*
* 注意：本内容仅限于深圳市捷顺金科研发有限公司内部传阅，禁止外泄以及用于其他的商业目的 
*/
package com.jst.prodution.util;

public class SnowflakeIdWorkerThread extends Thread{
        public void run () {
            while(true) {
                
                System.out.println(this.getName()  +  "    " +  SnowflakeIdUtil.generate(16));
                
                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
}