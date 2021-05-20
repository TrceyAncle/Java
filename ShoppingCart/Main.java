package ShoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("�������˺ź�����:");
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
				System.out.println("�̳���Ʒ���£�");
				for (Goods e : good) 
				{
					System.out.printf("���:%d  ��Ʒ��:%s  �۸�:%.1f",e.getNumber(),e.getName(),e.getPrice());
					System.out.println();
				}
				int a=1;
				while(true)
				{
					System.out.print("1.����  2.ɾ��  3.����");
					System.out.println();
					System.out.print("������ѡ��:");
					String aaa = in.next();
					switch (aaa) 
					{
						case "1":
							System.out.print("���蹺����������Ʒ��ż�����������");
							int aa = in.nextInt();
							good[aa].setSum(in.nextInt());
							user.shopping.Add(good[aa]);
							break;
						case "2":
							System.out.print("����ɾ����������Ʒ��ţ�");
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
			System.out.println("�˺Ż��������!");
	}
}

class User
{
	private String username;
    private String password;
    shoppingCart shopping;
    //������Ϣ
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
			System.out.println("��Ʒ���ڹ��ﳵ��!");
	}
	public void Delete(Goods goods)
	{
		if(shoppingcart.contains(goods))
			shoppingcart.remove(goods);
		else
			System.out.println("δѡ������Ʒ!");
	}
	public void Total()
	{
		double a=0;
		for (Goods e : shoppingcart) 
		{
			a=a+e.getPrice()*e.getSum();
		}
		System.out.print("�ܼ�:");
		System.out.printf("%.1f",a);
	}
	public void Showcart()
	{
		if(shoppingcart.size()==0)
			System.out.println("δ�����Ʒ��");
		else
		{
			System.out.println("���ﳵ����Ʒ���£�");
			for (Goods e : shoppingcart) 
			{
				System.out.printf("��Ʒ��:%s  �۸�:%.1f  ������:%d",e.getName(),e.getPrice(),e.getSum());
				System.out.println();
			}
		}
	}
}