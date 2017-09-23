package day03;

/*
 * break终止指定的循环
 */

public class BreakDemo_01 {
	public static void main(String[] args){
		a:for(int i = 0; i < 2; i++){
			for(int j = 0; j < 5; j ++){
				System.out.println("j="+j);
				break a;
			}
			System.out.println("i=" + i);
		}
	}

}
