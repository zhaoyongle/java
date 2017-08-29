/**
    实现库存管理案例:
	  1. 存储商品信息
	    存储商品类型变量
		将商品类型的变量,存储到集合中
		
      2. 查看库存清单
	    将集合进行遍历, 获取出集合中存储的Goods类型变量
		输出每一个Goods类型的属性
		计算求和: 总库存,总金额
		
     3. 修改商品的库存
	    集合遍历 ,获取出集合中存储的Goods类型变量
		变量调用Goods类的属性count,值进行修改 (键盘输入)
*/

import java.util.ArrayList;
import java.util.Scanner;

class Shop{
	
	/**
		创建arraylist集合，存储Goods类型数据
		用while进行循环
	*/
	public static void main(String[] args){
		//创建arraylist集合，存储Goods类型数据
		ArrayList<Goods> array = new ArrayList<Goods>();
		//调用添加集合的方法
		addGoods(array);
		
		while(true){
			//调用选择功能的方法，获取到用户输入功能的序号
			int number = chooseFunction();
			//对序号进行判断，1为查看库存清单，2,为修改商品库存数， 3为退出
			switch(number){
			case 1:
				printStore(array);
				break;
			case 2:
				update(array);
				break;
			case 3:
				return ;
			default:
				System.out.println("没有这个选项");
			}
		}
	}
	
	/**
		方法定义，修改库存
		键盘的输入，将goods中的属性值修改
	*/
	public static void update(ArrayList<Goods> array){
		Scanner index = new Scanner(System.in);
		//遍历集合获取元素中的每个元素
		for( int a = 0; a < array.size(); a++){
			//集合的方法是用get获取集合元素，元素类型是Goods
			Goods g = array.get(a);
			System.out.println("请输入\"" + g.brand + "\"元素的库存数：");
			g.count = index.nextInt();
		}
	}

	/**
		定义方法,实现选择菜单,用户根据功能选择菜单
	*/
	public static int chooseFunction(){
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
	/**
		查看库存清单，遍历集合
	*/
	public static void printStore(ArrayList<Goods> array){
		//输出表头
		System.out.println("=====输出库存清单=====");
		System.out.println("价格	尺寸	价格	库存");
		int totalCount = 0;
		double totalMoney = 0;
		for( int a = 0; a < array.size(); a++){
			Goods g = array.get(a);
			System.out.println(g.brand + " " + g.size + " " + g.price + " " + g.count);
			totalCount =totalCount + g.count;
			totalMoney = totalMoney + g.price * g.count;
		}
		System.out.println("totalCount = " + totalCount);
		System.out.println("totalMoney = " + totalMoney);
	}
	
	/**
	定义方法，将所有的信息存储到集合中
	集合是所有方法的共享数据，传递数据
	*/
	public static void addGoods(ArrayList<Goods> array){
		Goods sn1 = new Goods();
		Goods sn2 = new Goods();
		
		sn1.brand = "MacBook";
		sn1.size = 13.9;
		sn1.price = 6000;
		sn1.count = 1;
		
		sn2.brand = "Thinkpad";
		sn2.size = 14.9;
		sn2.price = 4000;
		sn2.count = 2;
		
		//将变量存储到集合中
		array.add(sn1);
		array.add(sn2);
	}
	
}
