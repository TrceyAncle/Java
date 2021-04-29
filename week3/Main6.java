package week3;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main6 {
	public static boolean isMondayToFriday(){
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		if(dayOfWeek!=DayOfWeek.SATURDAY && dayOfWeek!=DayOfWeek.SUNDAY)
			return true;
		return false;
	}

	public static void main(String[] args) 
	{
		if (isMondayToFriday()) 
		{
			System.out.println("������  ������201621123023");
		}
		else
		{
			System.out.println("��Ϣ  ������201621123023");
		}
		
	}
}
