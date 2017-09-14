/*
 * 引用数据类型，介绍一个类，Scanner
 * java中已经存在了，sun公司为我做好的类，使用它
 * 定义应用数据类型变量，和基本类型的区别
 * 	int a = 1;
 * 	格式：
 * 		类型	变量名 = new 类型（）；
 * 	举例：创建出Scanner类的变量
 * 		Scanner sc = new Scanner();
 * 每个引用类型，都有自己的功能，如何使用功能
 * 公式：
 * 	变量.功能名字（）;
 * 
 * 	Scanner类，作用，让我们在命令行中，接受键盘的输入
 * 使用Scanner类步骤：
 * 1、导入包，指明类所在的文件夹，关键字：import
 * 	java文件夹-util文件夹
 * 2、公式，创建出Scanner类型变量
 * 3、变量.使用Scanner类中的功能完成键盘输入
 */
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		
		String e = sc.next();
		System.out.println(e);
	}

}
