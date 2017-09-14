package day06;

/*
   闆嗗悎鐨勯亶鍘�
   瀹炵幇鎬濇兂涔熸槸绱㈠紩鎬濇兂
   闆嗗悎鐨勭储寮曚粠0寮�濮�,鍒� size()-1
   鏂规硶get(int index)
*/

import java.util.ArrayList;

class ArrayListDemo_02{
	public static void main(String[] args){
		//鍒涘缓涓�涓暣鏁伴泦鍚堬紝Inteage
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(12);
		array.add(123);
		array.add(34);
		array.add(3434);
		array.add(343454);
		
		/**
		閬嶅巻闆嗗悎
		鐢╯ize鏂规硶
		*/
		for(int a = 0; array.size()>a; a++){
			int arr = array.get(a);
			System.out.println(arr);
		}
		
	}
}
