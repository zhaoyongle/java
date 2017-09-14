package day06;

/*
   闆嗗悎ArrayList鏂规硶鐨勮ˉ鍏�
   
     add(int 绱㈠紩,瀛樺偍鐨勫厓绱�) 灏嗗厓绱犳坊鍔犲埌鎸囧畾鐨勭储寮曚笂
	 set(int 绱㈠紩,淇敼鍚庣殑鍏冪礌) 灏嗘寚瀹氱储寮曠殑鍏冪礌,杩涜淇敼
	 remove(int 绱㈠紩) 鍒犻櫎鎸囧畾绱㈠紩涓婄殑鍏冪礌
	 clear() 娓呯┖闆嗗悎涓殑鎵�鏈夊厓绱�
*/

import java.util.ArrayList;

class ArrayListDemo_03{
	public static void main(String[] args){
		//鍒涘缓涓�涓暣鏁伴泦鍚�
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(32);
		array.add(12);
		array.add(13);
		array.add(1324);
		array.add(13232);
		array.add(13212);
		array.add(13212);
		
		//鍦ㄧ储寮�2涓婃坊鍔�99
		array.add(2, 99);
		
		//鍒犻櫎7绱㈠紩涓婄殑鍏冪礌
		array.remove(7);
		
		//淇敼0绱㈠紩涓婄殑鍏冪礌
		array.set(0, 66);
		
		/*閬嶅巻闆嗗悎*/
		for( int a = 0; a<array.size(); a++){
			int arr = array.get(a);
			System.out.println(arr);
		}
		System.out.println("================");
		
		/*娓呯┖鎵�鏈夊厓绱�*/
		array.clear();
		System.out.println(array.size());
		
	}
}
