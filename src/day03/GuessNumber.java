package day03;

/*
 * 实现猜数字的小游戏
 * 	随机一个数字，让用户猜
 * 	结果三种情况：
 * 		中了， 大了， 小了
 * 随机数：Random
 * 键盘输入：Scanner
 * 猜到的数字和随机数进行比较if判断
 * 知道猜中为止，反复去猜，循环while
 */
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
	public static void main(String[] args){
		//创建Random类变量
		Random ran = new Random();
		//变量，使用ran.Random()获取随机数1-100之间的随机数
		int ranNum = ran.nextInt(100) + 1;
		System.out.println("猜谜游戏开始");
		System.out.println("请输入1-100之间的整数");
		//创建Scanner变量
		Scanner sc = new Scanner(System.in);
		
		while(true){
			//获取键盘输入
			int number = sc.nextInt();
			//随机数，和用户输入的数据，比较
			if(number > ranNum){
				System.out.println("猜大了");
			}else if(number < ranNum){
				System.out.println("猜小了");
			}else{
				System.out.println("猜中了");
				break;
			}
		}
		
	}

}
