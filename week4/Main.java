package week4;

public class Main 
{
	public static void main(String[] args) 
	{
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