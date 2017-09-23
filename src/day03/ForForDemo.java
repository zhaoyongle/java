package day03;

/*
 * 嵌套循环：循环里面还有循环，for形式多
 * 	格式：
 * 	for(){
 * 		for(){
 * 
 * }
 * }
 * 总的循环次数 = 内循环次数 *外循环次数
 * 内循环，是外循环的循环体
 * 内循环：控制的是行数
 * 外循环：控制的是每行的个数
 */

public class ForForDemo {
	public static void main(String[] args){
		for(int i = 1; i < 5; i ++){
			for(int j = 1; j < i + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
