package com.tledu.aaa.controller;

import com.tledu.aaa.manger.DataProcessManager;
/**
 *	给main函数的arg[] 传参数  Run--Run Configurations-Arguments
 */
public class SystemController {
	public static void main(String[] args) {
		if (args ==null||args.length==0) {
			System.err.println("传入参数不正确,请传入要查询的IP地址!!");
			System.exit(-1);
		}
		String ip = args[0];
		long startMS = System.currentTimeMillis();
		String location = DataProcessManager.getLocation(ip);
		long endMS = System.currentTimeMillis();
		System.out.println(location);
		System.out.println(endMS - startMS);
	}
}
