package com;

import java.io.IOException;
import java.util.List;

import com.tledu.aaa.manger.DataProcessManager;
import com.tledu.aaa.pojo.IPAndLocationPojo;

/**
 * 测试9
 * @author 96456
 *
 */
public class TestArraySort_03 {
	public static void main(String[] args) throws IOException {
		String filePath ="ip_location_relation.txt";
		String encoding="utf-8";
		List<IPAndLocationPojo> ipAndLocationPojos = DataProcessManager.getPojoList(filePath, encoding);
		IPAndLocationPojo[] iPojos =DataProcessManager.convertListToArrayAndSort(ipAndLocationPojos);
		System.out.println(iPojos[0]);
		System.out.println(iPojos[iPojos.length-1]);
	}
}
