package com.client.forEach;

import java.util.ArrayList;
import java.util.List;

import com.model.forEach.Student;



public class ClientTest
{
	
	public static void main(String args[])
	{
		List<Student> sl = new ArrayList<>();
		sl.add(new Student("avneesh",28));
		sl.add(new Student("sandeep",27));
		sl.add(new Student("loku",29));
		
		sl.forEach((s)->System.out.println(s));
		
	}
	

}
