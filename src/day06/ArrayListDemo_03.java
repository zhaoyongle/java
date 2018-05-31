package day06;

/*
   集合ArrayList方法的补充
   
     add(int 索引,存储的元素) 将元素添加到指定的索引上
	 set(int 索引,修改后的元素) 将指定索引的元素,进行修改
	 remove(int 索引) 删除指定索引上的元素
	 clear() 清空集合中的所有元素
*/

import java.util.ArrayList;

class ArrayListDemo_03{
	public static void main(String[] args){
		//创建一个整数集合
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(32);
		array.add(12);
		array.add(13);
		array.add(1324);
		array.add(13232);
		array.add(13212);
		array.add(13212);
		
		//在索引2上添加99
		array.add(2, 99);
		
		//删除7索引上的元素
		array.remove(7);
		
		//修改0索引上的元素
		array.set(0, 66);
		
		/*遍历集合*/
		for( int a = 0; a<array.size(); a++){
			int arr = array.get(a);
			System.out.println(arr);
		}
		System.out.println("================");
		
		/*清空所有元素*/
		array.clear();
		System.out.println(array.size());
		
	}
}
