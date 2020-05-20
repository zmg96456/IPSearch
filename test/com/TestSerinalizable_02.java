package com;

import java.io.IOException;

import com.tledu.aaa.util.SerDeUtil;

public class TestSerinalizable_02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String objFilePath = "ipObj.data";
		/**
		 * 写出
		 */
		Student student = new Student("张三", 18);
		SerDeUtil.saveObj(student, objFilePath);
		System.out.println("写出完成");
		
		/**
		 * 读取
		 */
		Object object  = SerDeUtil.getObj(objFilePath);
		System.out.println(object);
	}
}
