package com;

import java.io.IOException;
import java.util.List;
//测试2
import com.tledu.aaa.util.FileOperatorUtil;

/**
 * 测试工具类FileOperatorUtil
 */
public class TestFileIO_02 {
	public static void main(String[] args) throws IOException {
		String ipLibarayPath="ip_location_relation.txt";
		String encoding="utf-8";
		List<String> list = FileOperatorUtil.getLineList(ipLibarayPath, encoding);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
