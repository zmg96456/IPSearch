package com;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.tledu.aaa.manger.DataProcessManager;
import com.tledu.aaa.pojo.IPAndLocationPojo;

/**
 * 测试8
 *测试对象排序
 */
public class TestArraySort_02 {
	public static void main(String[] args) throws IOException {
		String filePath ="ip_location_relation.txt";
		String encoding="utf-8";
		List<IPAndLocationPojo> ipAndLocationPojos = DataProcessManager.getPojoList(filePath, encoding);
		IPAndLocationPojo[] iPojosArray = new IPAndLocationPojo[ipAndLocationPojos.size()];
		// 转换数组
		ipAndLocationPojos.toArray(iPojosArray);
		//排序
		Arrays.sort(iPojosArray);
		System.out.println(iPojosArray[0]);
		System.out.println(iPojosArray[iPojosArray.length-1]);
	}
}
