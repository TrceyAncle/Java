package ShoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("请输入账号和密码:");
		User[] use =new User[3];		
		use[0] = new User("a","a");
		use[1] = new User("b","b");
		use[2] = new User("c","c");
		User user = new User(in.next(),in.next());
		int b=0;
		for (int i = 0; i < use.length; i++) 
		{
			if(user.getUsername().equals(use[i].getUsername())&&user.getPassword().equals(use[i].getPassword()))
			{
				Goods[] good=new Goods[3];
				good[0] = new Goods(0,"aaa",1.1);
				good[1] = new Goods(1,"bbb",2.2);
				good[2] = new Goods(2,"ccc",3.3);
				System.out.println("商城商品如下：");
				for (Goods e : good) 
				{
					System.out.printf("编号:%d  商品名:%s  价格:%.1f",e.getNumber(),e.getName(),e.getPrice());
					System.out.println();
				}
				int a=1;
				while(true)
				{
					System.out.print("1.购买  2.删除  3.结算");
					System.out.println();
					System.out.print("请输入选择:");
					String aaa = in.next();
					switch (aaa) 
					{
						case "1":
							System.out.print("如需购买请输入商品编号及购买数量：");
							int aa = in.nextInt();
							good[aa].setSum(in.nextInt());
							user.shopping.Add(good[aa]);
							break;
						case "2":
							System.out.print("如需删除请输入商品编号：");
							int bb = in.nextInt();
							user.shopping.Delete(good[bb]);
							break;
						case "3":
							a=2;
							break;
						default:
							break;
					}
					if (a==2)
						break;
					
				}
				user.shopping.Showcart();
				user.shopping.Total();
			}
			else
				b++;
		}
		if (b==use.length)
			System.out.println("账号或密码错误!");
	}
}

class User
{
	private String username;
    private String password;
    shoppingCart shopping;
    //其他信息
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public User(String username, String password) 
	{
		super();
		this.username = username;
		this.password = password;
		this.shopping = new shoppingCart();
	}
    
}

class Goods
{
	private String name;
	private double price;
	private int number;
	private int sum;
	public Goods(int number, String name, double price) 
	{
		super();
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) 
	{
		this.number = number;
	}
}

class shoppingCart
{
	ArrayList<Goods> shoppingcart = new ArrayList<Goods>();
	public void Add(Goods goods) 
	{
		if(!shoppingcart.contains(goods))
			shoppingcart.add(goods);
		else
			System.out.println("商品已在购物车中!");
	}
	public void Delete(Goods goods)
	{
		if(shoppingcart.contains(goods))
			shoppingcart.remove(goods);
		else
			System.out.println("未选购此商品!");
	}
	public void Total()
	{
		double a=0;
		for (Goods e : shoppingcart) 
		{
			a=a+e.getPrice()*e.getSum();
		}
		System.out.print("总价:");
		System.out.printf("%.1f",a);
	}
	public void Showcart()
	{
		if(shoppingcart.size()==0)
			System.out.println("未添加商品！");
		else
		{
			System.out.println("购物车内商品如下：");
			for (Goods e : shoppingcart) 
			{
				System.out.printf("商品名:%s  价格:%.1f  购买数:%d",e.getName(),e.getPrice(),e.getSum());
				System.out.println();
			}
		}
	}
}