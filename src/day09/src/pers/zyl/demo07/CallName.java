package pers.zyl.demo07;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
	public static void main(String[] args) {
		//定义集合Arraylist，存储Student类型
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		printStudent(array);
		randomStudent(array);
		
	}
	
	//随机数产生学信息
	public static void randomStudent(ArrayList<Student> array) {
		Random rm = new Random();
		int index = rm.nextInt(array.size());
//		Student s = new Student();
		Student s = array.get(index);
		System.out.println(s.getName());
	}
	
	/*
	 * 总览学生信息，遍历集合
	 */
	public static void printStudent(ArrayList<Student> array) {
		for(int a = 0; a < array.size(); a++) {
			Student s = array.get(a);
			System.out.println(s.getName() + "........" + s.getAge());
		}
		
	}
	
	/*
	 * 定义对象，存储Student对象到集合中
	 */
	public static void addStudent(ArrayList<Student> array) {
		Student s1 = new Student();
		s1.setAge(12);
		s1.setName("张三");
		
		Student s2 = new Student();
		s2.setAge(23);
		s2.setName("李四");
		
		Student s3 = new Student();
		s3.setAge(33);
		s3.setName("王五");
		
		Student s4 = new Student();
		s4.setAge(56);
		s4.setName("钱六");
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
	}

}
