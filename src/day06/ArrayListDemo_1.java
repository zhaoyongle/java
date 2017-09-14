/*
   ArrayList 集合中的方法
   
   add(参数) 向集合中添加元素,数据存储进去
   方法中的参数类型,定义集合对象时候的类型是一致
   
   ArrayList<Integer> array = new ArrayList<Integer>();
   array.add(3);
   
   get(int index) 取出集合中的元素,get方法的参数,写入索引
   
   size() 返回集合的长度, 集合存储元素的个数
*/

import java.util.ArrayList;

class ArrayList_1{
	public static void main(String[] args){
		//定义集合存储字符串元素
		ArrayList<String> array = new ArrayList<String>();
		//调用集合方法添加元素
		array.add("a, b, c");
		array.add("this");
		array.add("java");
		array.add("haha");
		//输出集合的长度，用size方法，返回值为 int
		int size = array.size();
		System.out.println(size);
		
		//获取集合中的一个元素，用索引
		//集合中的方法为get, 获取元素返回类型值
		String st = array.get(1);
		System.out.println(st);
		
	}
}
