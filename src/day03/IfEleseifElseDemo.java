package day03;

/*
 * if else fi else
 * 
 * 语句结构：
 * 	if(条件){
 * 		if执行体
 * }
 * 	else if(条件){
 * 		else if执行体
 * }
 * 	else{
 * 		else执行体
 * }
 * if语句条件为true，执行if执行体
 * if语句条件为false，执行else执行体
 * 一个语句中，包含多个if语句，只要有一个成立，其余语句都不执行
 */

public class IfEleseifElseDemo {
	public static void main(String[] args){
		//判断成绩执行，大于80优，大于70良，大于60及格，小于60差
		int gread = 73;
		
		if(gread>80){
			System.out.println(gread+" 您的成绩为优");
		}else if(gread>70){
			System.out.println(gread+" 您的成绩为良");
		}else if(gread>60){
			System.out.println(gread+" 您的成绩为及格");
		}else{
			System.out.println(gread+" 您的成绩为差");
		}
	}

}