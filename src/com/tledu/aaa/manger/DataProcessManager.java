package com.tledu.aaa.manger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tledu.aaa.pojo.IPAndLocationPojo;
import com.tledu.aaa.util.FileOperatorUtil;

/**
 * 该类为项目数据处理管理类,衔接各个模块的输入输出 进行有机组合
 * 
 */
public class DataProcessManager {
	public static List<IPAndLocationPojo> getPojoList(String filePath,String encoding) throws IOException{
		List<String> lineList =FileOperatorUtil.getLineList(filePath, encoding);
		List<IPAndLocationPojo> ipAndLocationPojos = new ArrayList<IPAndLocationPojo>();
		for (String	line : lineList) {
			if (line==null || line.trim().equals("")) {
				continue;
			}
			String[] columArray = line.split("\t");
			String startIP =columArray[0];
			String endIP=columArray[1];
			String location = columArray[2];
			IPAndLocationPojo ipAndLocationPojo =new IPAndLocationPojo(startIP, endIP, location);
			ipAndLocationPojos.add(ipAndLocationPojo);
		}
		return ipAndLocationPojos;
	}
	
	//将对象的集合形式 转换为 数组形式 并 进行排序
	public static IPAndLocationPojo[] convertListToArrayAndSort(List<IPAndLocationPojo> pojos) {
		IPAndLocationPojo[] ipAndLocationPojos =new IPAndLocationPojo[pojos.size()];
		pojos.toArray(ipAndLocationPojos);
		Arrays.sort(ipAndLocationPojos);
		return ipAndLocationPojos;
		
	}
}
