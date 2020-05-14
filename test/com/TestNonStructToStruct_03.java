package com;

import java.io.IOException;
import java.util.List;

import com.tledu.aaa.manger.DataProcessManager;
import com.tledu.aaa.pojo.IPAndLocationPojo;

/**
 * 测试5
 *数据结构化 把数据保存到对象中
 *测试DataProcessManager
 */
public class TestNonStructToStruct_03 {
	public static void main(String[] args) throws IOException {
		String filePath="ip_location_relation.txt";
		String encoding ="utf-8";
		List<IPAndLocationPojo> ipAndLocationPojos = DataProcessManager.getPojoList(filePath, encoding);
		for (IPAndLocationPojo ipAndLocationPojo : ipAndLocationPojos) {
			System.out.println(ipAndLocationPojo);
		}
	}
}
