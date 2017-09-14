/*
 * 利用for循环，计算1加到100的结果
 * 1 + 2 + 3 、、、、+100 = 5050
 */

public class ForDemo_01{
	public static void main(String[] args){
		int sum = 0;
		for(int a=1; a<101; a++){
			sum = sum + a;
			
			System.out.println(sum);
		}
	}

}