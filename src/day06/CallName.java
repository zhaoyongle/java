/*
   随机点名器,集合改进 (学生的姓名和年龄)
   现实中有学生这个事物,使用定义类的形式,描述学生事物
   属性: 姓名,年龄
   
   姓名存储了数组, 将容器换成是集合
   String[] s = {"",""};
   集合中,存储的是学生的姓名吗?  应该存储Student类型
   
   存储学生:
      学生类型,存储到集合中
   总览: 遍历集合
   随机: 随机数,作为索引,到集合中找到元素
   三个功能,共享的数据,集合容器,
   定义三个方法,必须参数传递集合
*/

import java.util.ArrayList;
import java.util.Random;

class ClallName{
	public static void main(String[] args){
		//定义集合，存储的是student类型的变量
		ArrayList<StudentName> array = new ArrayList<StudentName>();
		add(array);
		printArrayList(array);
		randomStudentName(array);
		

	}
	/**
	随机数，相当于集合的索引，在集合中找到元素
	*/
	public static void randomStudentName(ArrayList<StudentName> array){
		Random ra = new Random();
		int index = ra.nextInt(array.size())ssss;
		StudentName s = array.get(index);
		System.out.println("================");
		System.out.println(s.name + " " + s.age);
	}
	
	
	/**
	总览学生信息，遍历集合
	*/
	public static void printArrayList(ArrayList<StudentName> array){
		for( int a = 0; a < array.size(); a++){
			StudentName s = array.get(a);
			System.out.println(s.name + " " + s.age);
		}
	
	}
	
	/**
	定义方法，实现存储学生的年龄和姓名
	创建studentname变量，存贮到集合中
	*/
	public static void add(ArrayList<StudentName> array){
		//创建studentname类型变量
		StudentName sn1 = new StudentName();
		StudentName sn2 = new StudentName();
		StudentName sn3 = new StudentName();
		StudentName sn4 = new StudentName();
		StudentName sn5 = new StudentName();
		StudentName sn6 = new StudentName();
		
		sn1.name = "zhagnsan";
		sn1.age = 12;
		
		sn2.name = "ceshi";
		sn2.age = 33;
		
		sn3.name = "tom";
		sn3.age = 56;
		
		sn4.name = "hehe";
		sn4.age = 76;
		
		sn5.name = "zhaoge";
		sn5.age = 66;
		
		sn6.name = "cjiej";
		sn6.age = 567;
		
		//将studentname存储到集合中
		array.add(sn1);
		array.add(sn2);
		array.add(sn3);
		array.add(sn4);
		array.add(sn5);
		array.add(sn6);
	
	}
	
}
