package week2;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner; 
public class Main5 { 
	public static void main(String[] args) { 
		
	List<String> strList = new ArrayList<String>(); 
	Scanner in = new Scanner(System.in);
	String str=in.next();
	while(!str.equals("!!end!!")) {
		strList.add(str);
		str=in.next();
	}
	strList.add(0, "begin");
	strList.add(strList.size(), "end");
	System.out.println(strList);
	str=in.next();
	System.out.println(strList.contains(str));
	System.out.println(strList.indexOf(str));
	if(strList.indexOf(str)==-1) {
		System.out.println(-1);
	}
	else {
		System.out.println(strList.size()-2-strList.indexOf(str));
	}
	System.out.println(strList.remove(0));
	System.out.println(strList);
	str=in.next();
	strList.set(1, str);
	System.out.println(strList);
	str=in.next();
	List<String> strList1 = new ArrayList<String>(); 
	for (String e:strList) {
		if(e.indexOf(str)!=-1) {
			strList1.add(e);
		}
	}
	System.out.println(strList1);
	strList.remove(strList.contains(str));
	System.out.println(strList);
	strList.clear();
    System.out.println(strList+" "+strList.size()+","+strList.isEmpty());
	
	} 
}