package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tledu.aaa.util.RegexUtil;

/**
 * 测试RegexUtil
 * Pattern 和 Matcher
 * Pattern : java中正则表达式引擎
 *Matcher : 匹配器
 */
public class TestRegex_02 {
	public static void main(String[] args) {
	String	regexTel = "我的电话是(\\d{11})";
	String	tel="我的电话是11234567890";
		System.out.println(RegexUtil.isVaid(regexTel, tel));
		System.out.println(RegexUtil.getMatchContent(regexTel, tel, 1));
	}
	
	
}
