package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//��½
		//������Ʒ��������Ƴ����ﳵ
	}
}

class Login
{
	private User user;
    public void Verify(String Username,String Password)
    {
    	//��֤����
    }
}

class User
{
	private String username;
    private String password;
    //�ܱ��������Ϣ
}

class Goods
{
	private String name;
	private double price;
	private String goodsumber;
	private String pdicture;//ͼƬ����·�� 
	public void Addtocart()
	{
		//���빺�ﳵ
	}
}

class Search
{
	private String searchname;
	public void Search(String searchname)
	{
		//������Ʒ	
	}
	
}

class shoppingCart
{
	private Goods goods;
	private int number;
	private double totalprice;
	ArrayList<shoppingCart> shoppingcart = new ArrayList<shoppingCart>();
	public void Add() 
	{
		//�����Ʒ
	}
	public void Delete()
	{
		//ɾ����Ʒ
	}
	public void Total()
	{
		//�����ܼ�
	}
	public void payment()
	{
		//����
	}
}