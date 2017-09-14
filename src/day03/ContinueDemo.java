package day03;

/*
 * continue 鍏抽敭瀛�
 * 浣滅敤锛氬湪寰幆涓紝缁堟鏈寰幆锛屽紑濮嬩笅涓�涓�娆″惊鐜�
 */

public class ContinueDemo {
	public static void main(String[] args){
		for(int i = 0; i < 10; i++){
			if(i%2==0){
				continue;
			}
			System.out.println(i);
		}
	}

}
