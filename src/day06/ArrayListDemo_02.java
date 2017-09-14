/*
   集合的遍历
   实现思想也是索引思想
   集合的索引从0开始,到 size()-1
   方法get(int index)
*/

import java.util.ArrayList;

class ArrayListDemo_02{
	public static void main(String[] args){
		//创建一个整数集合，Inteage
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(12);
		array.add(123);
		array.add(34);
		array.add(3434);
		array.add(343454);
		
		/**
		遍历集合
		用size方法
		*/
		for(int a = 0; array.size()>a; a++){
			int arr = array.get(a);
			System.out.println(arr);
		}
		
	}
}
