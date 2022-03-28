package practice;

import java.util.Scanner;
//Date is a library about to be deleted by new Java Versions
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		
//		Scanner scanner=new Scanner(System.in);
		Date date=new Date();
		
		//SimpleDateFormat is a class where you can pass 
		//the format you'll want to show the date object
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
		
		System.out.println("Today is: "+dateFormat.format(date));
		
		
		System.out.println("====================================================");
		System.out.println("Choose an option (type only a number) ");
		System.out.println("1.- Do you know his/her birthdays's date?");
		System.out.println("2.- Do you know when is the date when that person born?");
		
		
		Scanner scanner =new Scanner(System.in);
		int option=0;
		
		try {
			option=scanner.nextInt();			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	
		
		if(option==1) {
			getBornDate(date,dateFormat);
		}else if(option==2){
			System.out.println("2 was chosen");
		}else {
			System.out.println("Option not valid");
		}
			
	}
	
	
	
	public static void getBornDate(Date currentDate, SimpleDateFormat dateFormat)  {
		//You type your birthday and it gives the date you born 
		Scanner scanner=new Scanner(System.in);	
		System.out.println("------------------------------------");		
		System.out.println("Type his/her birthday's ");
		
		System.out.println("Type his/her month");
		String auxiliarMonth=scanner.next();
		
		System.out.println("Type his/her day");
		String auxiliarDay=scanner.next();
		
		System.out.println("We recieved MONTH: "+auxiliarMonth);
		System.out.println("We recieved DAY: "+auxiliarDay);
		
		
		//We get current year
		System.out.println("TODAY IS: "+dateFormat.format(currentDate));
		
		//We know the 
//		System.out.println("Your birthday is on "+birthdayDate);
		
		
		
		System.out.println("------------------------------------");
		
	}
	
	public static void getBirthDate(){
		//Type your born's date and this method shows your born's date
		
	}
}
