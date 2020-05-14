package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tledu.aaa.manger.DataProcessManager;
import com.tledu.aaa.pojo.IPAndLocationPojo;

/**
 * 测试6
 *	List结构化对象 转 array
 */
public class TestListToArray_01 {
	
	public static void main(String[] args) throws IOException{
				//		List转数组
		List<String> sList =new ArrayList<String>();
		sList.add("1c");
		sList.add("2a");
		sList.add("3b");
		String[] strArray = new String[sList.size()];
		//   strArray = (String[]) sList.toArray();
		sList.toArray(strArray);
		for (String string : strArray) {
			System.out.println(string);
		}
		
		
		
		// List结构化对象 转 array
		
		String filePath = "ip_location_relation.txt";
		String encoding = "utf-8";
		List<IPAndLocationPojo> ipAndLocationPojos =DataProcessManager.getPojoList(filePath, encoding);
		IPAndLocationPojo[] iPojosArray=new IPAndLocationPojo[ipAndLocationPojos.size()];
		ipAndLocationPojos.toArray(iPojosArray);
		for (IPAndLocationPojo ipAndLocationPojo : iPojosArray) {
			System.out.println(ipAndLocationPojo);
		}
	}
	

}
