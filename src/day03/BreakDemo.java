package day03;

/*
 * break鍏抽敭瀛�
 * 浣滅敤浜庡惊鐜腑锛岀粓姝㈠惊鐜綔鐢�
 */

public class BreakDemo {
	public static void main(String[] args){
		int i = 1;
		while(i < 200){
			if(i == 3){
				break;
			}else{
				System.out.println(i);
			}
			i++;
		}
	}

}
