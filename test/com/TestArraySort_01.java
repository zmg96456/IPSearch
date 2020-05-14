package com;

import java.util.Arrays;

/**
 * 测试7
 *排序
 */
public class TestArraySort_01 {
	public static void main(String[] args) {
		/**
		 * int类型排序
		 * Integer String Date 都能排序 因为 都实现了 Comparable接口
		 * 数字 从小到大
		 * String 每位的ASCII码
		 * 日期 : 自然日期 (昨天,今天,明天)
		 */
		
		int[] intArray={15,20,11,6,40,22};
		Arrays.sort(intArray);
		for (int i : intArray) {
			System.out.println(i);
		}
		
		
		user u1 =new user(10, "aaa");
		user u2=new user(15, "bbb");
		user u3=new user(1, "aca");
		user[] useArray = {u1,u2,u3};
		Arrays.sort(useArray);
		for (user user : useArray) {
			System.out.println(user);
		}
	}
}

class user implements Comparable<user>{
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user [age=" + age + ", name=" + name + "]";
	}

	public user() {
		super();
	}

	public user(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(user o) {
		return this.age-o.age;
	}
}