package com;

import java.io.IOException;
import java.util.List;

import com.tledu.aaa.manger.DataProcessManager;
import com.tledu.aaa.pojo.IPAndLocationPojo;

/**
 * 测试11
 * 二分法 管理类测试
 *
 */
public class TestBinrarySearch_02 {
	public static void main(String[] args) throws IOException {
		String ipFile ="ip_location_relation.txt";
		String encoding="utf-8";
		List<IPAndLocationPojo> ipList = DataProcessManager.getPojoList(ipFile, encoding);
		IPAndLocationPojo[] iPojosArray = DataProcessManager.convertListToArrayAndSort(ipList);
		String aidIP = "123.123.123.123";
		int startIndex = 0;
		int endIndex = iPojosArray.length - 1;
		int resultIndex = DataProcessManager.binaraySearchIpPojo(iPojosArray, aidIP, startIndex, endIndex);
		System.out.println(iPojosArray[resultIndex]);
	}
}
