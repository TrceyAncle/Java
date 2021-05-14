package week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		//登陆
		//搜索商品、加入或移除购物车
	}
}

class Login
{
	private User user;
    public void Verify(String Username,String Password)
    {
    	//验证过程
    }
}

class User
{
	private String username;
    private String password;
    //密保问题等信息
}

class Goods
{
	private String name;
	private double price;
	private String goodsumber;
	private String pdicture;//图片保存路径 
	public void Addtocart()
	{
		//加入购物车
	}
}

class Search
{
	private String searchname;
	public void Search(String searchname)
	{
		//查找商品	
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
		//添加商品
	}
	public void Delete()
	{
		//删除商品
	}
	public void Total()
	{
		//计算总价
	}
	public void payment()
	{
		//付款
	}
}