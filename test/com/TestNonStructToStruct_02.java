package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.tledu.aaa.pojo.IPAndLocationPojo;
import com.tledu.aaa.util.FileOperatorUtil;

/**
 * 测试4
 * 数据结构化 把数据保存到对象中
 *
 */
public class TestNonStructToStruct_02 {
	public static void main(String[] args) throws IOException {

		String txtFilePath = "ip_location_relation.txt";
		String encoding = "utf-8";
		List<String> lineList = FileOperatorUtil.getLineList(txtFilePath, encoding);
		List<IPAndLocationPojo> ipAndLocationPojos =new ArrayList<IPAndLocationPojo>();
		for (String line : lineList) {
			if (line == null || line.trim().equals("")) {
				continue;
			}
			String[] columArray = line.split("\t");
			String startIP=columArray[0];
			String endIP = columArray[1];
			String location = columArray[2];
			IPAndLocationPojo ipAndLocationPojo = new IPAndLocationPojo(startIP, endIP, location);
			ipAndLocationPojos.add(ipAndLocationPojo);
		}
		for (IPAndLocationPojo ipAndLocationPojo : ipAndLocationPojos) {
			System.out.println(ipAndLocationPojo);
		}
	}
}
