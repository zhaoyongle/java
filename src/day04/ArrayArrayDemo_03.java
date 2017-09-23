/*
 *  二维数组的遍历求和
    第一小组销售额为{11, 12}万元    
    第二小组销售额为{21, 22, 23}万元
    第三小组销售额为{31, 32, 33, 34}万元。
	每个小组就是一个数组, 三个数组存储到一个数组中,形成二维数组
	求和:
	  每个小组求和
	  所有元素求和
 */
package day04;

public class ArrayArrayDemo_03 {
	public static void main(String[] args){
		//定义一个二维数组，存储公司所有的销售额
		int[][] arr = { {11, 12} , {21, 22, 23} , {31, 32, 33, 34} };
		//定义两个变量，分别存储小组销售额和公司销售总额
		int sum = 0;
		int groupsum = 0;
		//遍历二维数组，在遍历过程中求和
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j < arr[i].length; j++){
				groupsum = arr[i][j] + groupsum;
//				groupsum += arr[i][j];
			}
			System.out.println(groupsum);
//			sum = sum + groupsum;
			sum +=groupsum;
			groupsum = 0;
		}
		System.out.println("==============");
		System.out.println(sum);
	}

}
