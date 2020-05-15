package com;

import java.io.IOException;
import java.util.List;

import com.tledu.aaa.manger.DataProcessManager;
import com.tledu.aaa.pojo.IPAndLocationPojo;

/**
 * 测试12
 * 加载项放静态代码段后的时间测试
 *
 */
public class TestBinrarySearch_03 {
	public static void main(String[] args) throws IOException {
		long startMS = System.currentTimeMillis();	
		String aidIP = "123.123.123.123";
		String location =DataProcessManager.getLocation(aidIP);
		long endMS = System.currentTimeMillis();
		System.out.println(location);
		System.out.println("第一次用时 : " + (endMS - startMS));
	}
}
