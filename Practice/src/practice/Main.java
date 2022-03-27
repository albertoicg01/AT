package practice;

import java.util.Scanner;
//Date is a library about to be deleted by new Java Versions
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		
//		Scanner scanner=new Scanner(System.in);
		Date date=new Date();
		
		System.out.println("Today is "+date);
		
		//SimpleDateFormat is a class where you can pass 
		//the format you'll want to show the date
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
		
		System.out.println("Today is: "+dateFormat.format(date));
		

		
		
	
		
		
		
		
		
	}
	
	
	
	public static void getBirthday() {
		//You type your birthday and it gives the date you born 
		
		
	}
}
