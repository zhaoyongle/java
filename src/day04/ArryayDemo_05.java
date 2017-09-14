/*
 * 计算数组中的最大值
 * 数组{3， 1， 4， 6}做比较
 */
package day04;

public class ArryayDemo_05 {
	public static void main(String[] args){
		//定义数组，int类型
		int[] arr = {3, 1, 4, 8};
		//定义变量，记录0索引上的元素
		int max = arr[0];
		
		//遍历数组，获取所有的元素，好变量max比较
		for(int i = 1; i < arr.length; i++){
			//变量max，和数组中的每个元素进行比较
			//如果max，小于了数组中的一个元素
			if(max < arr[i]){
				//较大的数组元素赋值给max
				max = arr[i];
			}
		}
		//遍历完成，变量max就是数组最大值
		System.out.println(max);
	}

}
