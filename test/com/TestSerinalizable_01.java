package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerinalizable_01 {
public static void main(String[] args) throws IOException {
	String objFilePath = "ipObj.data";
	/**
	 * 写出
	 */
	Student student =new Student("aaa", 10);
	FileOutputStream fos = new FileOutputStream(objFilePath);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(student);
	oos.close();
	System.out.println("写出完毕");
	
	/**
	 * 读取
	 */
	FileInputStream fis =new FileInputStream(objFilePath);
	ObjectInputStream ois =new ObjectInputStream(fis);
	Object object =  new Object();
	ois.close();
	System.out.println(object);
}
	
	
}


class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

}