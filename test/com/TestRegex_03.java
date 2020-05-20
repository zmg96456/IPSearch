package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tledu.aaa.util.RegexUtil;

/**
 * 测试RegexUtil中的IP
 * Pattern 和 Matcher
 * Pattern : java中正则表达式引擎
 *Matcher : 匹配器
 */
public class TestRegex_03 {
	public static void main(String[] args) {
	
	String ip = "123.124.152.252";
		System.out.println(RegexUtil.isValidIP(ip));
	}
	
	
}
