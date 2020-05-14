package com;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
//测试1
public class TestFileIO_01 {
	/**
	 * 1定义文件路径 
	 * 2节点流获取文件
	 * 3转化为字符流
	 * 4添加缓冲流
	 * 5读取
	 * 6关闭流       先开启的后关闭,关闭最外层的流,会自动关闭内部流
	 */
	public static void main(String[] args) {
		
		try {
			String ipLibarayPath ="ip_location_relation.txt";
			String encoding ="utf-8";
			FileInputStream fis = new FileInputStream(ipLibarayPath);
			Reader reader = new InputStreamReader(fis, encoding);
			BufferedReader br = new BufferedReader(reader);
			String temp = null;
			while ((temp=br.readLine())!=null) {
				System.out.println(temp);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
