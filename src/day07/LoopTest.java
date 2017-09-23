package day07;

/*
   要求:
     计算1-100之间的所有的奇数和
	 1+3+5+7...+99
	 
	 有1个数据,从0变到100  循环 int =0  <= 100  ++
	 从0-100,范围内,找到奇数  数%2==1 奇数
	 所有的奇数求和计算
	 需要变量,保存奇数的求和
	 
	 实现步骤:
	   1. 程序可以使用到的数据,预先定义好变量
	     需要奇数和
	   2. 利用循环,让变量从0变化到100
	   3. 判断变量的变化情况是不是奇数
	   4. 如果是奇数,和预先定义好的变量,求和
*/
public class LoopTest{
	public static void main(String[] args){
		// 定义变量,保存求和
		int sum = 0;
		// for循环,循环中的变量, 0-100
		for(int i = 0 ; i <= 100 ; i++){
			//对循环的变量,进行奇数的判断, %2==1
			if(i % 2 == 1){
				//对奇数求和
				sum  += i;
			}
		}
		System.out.println(sum);
		
		//sum = 0;
		
		 /*for(int i=1 ; i <=100; i+=2) {
			 sum +=i;
		 }
		System.out.println(sum);*/
	}
}


