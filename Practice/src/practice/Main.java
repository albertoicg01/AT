package practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
//Date is a library about to be deprecated in new Java Versions
//The advice for new programs is not use it
import java.util.Date;
import java.text.SimpleDateFormat;
/*===============================================================
 *AUTHOR :ALBERTO
 *DATE	 :20222803
 *DESC 	 :This program works with two methods. These
 *		  methods are dedicated to learn and get practice 
 *		  about Data and Calendar classes
 *REFERENCES : https://www.geeksforgeeks.org/find-the-duration-of-difference-between-two-dates-in-java/
 *===============================================================		
 * */
public class Main {
	public static void main(String[] args) {
		
		//For getting the current date
		Date date=new Date();
		
		//SimpleDateFormat is a class where you can pass 
		//the format you'll want to show the date object
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-DD");
		System.out.println("Today is: "+dateFormat.format(date));
		
		//Program instructions
		System.out.println("====================================================");
		System.out.println("Choose an option (type only a number) ");
		System.out.println("1.- It tells you what is your born's date");
		System.out.println("2.- It provides you information about your birthday");
		
		
		Scanner scanner =new Scanner(System.in);
		int option=0;
		
		try {
			option=scanner.nextInt();			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	
		Boolean flag=false;
		//I have to fix this menu for all cases
		while(flag==false){
			if(option==1) {
				getBornDate();
				flag=true;
			}else if(option==2){
				getBirthDay();	
				flag=true;
			}else if(option==3){
				System.out.println("Good Bye");
				flag=true;
				
			}else {
				System.out.println("Option not valid");
			}
		}
			
	}
	
	
	
	public static void getBornDate()  {
		//You type your birthday and it gives the date you born 
		
		Scanner scanner=new Scanner(System.in);	
		System.out.println("------------------------------------");		
		System.out.println("------------------------------------");		
		
		//We get how old her/he is		
		System.out.println("How old are you");
		Integer auxiliarAge=scanner.nextInt();
		
		//We get month------>
		System.out.println("Type your birthday's month");
		String auxiliarMonth=scanner.next();
		//We get Day------>
		System.out.println("Type your birtday's day");
		String auxiliarDay=scanner.next();
		//We get Current Date------>
		Calendar cal =Calendar.getInstance();
		
		//We check info provided------>
		String auxiliar=cal.getWeekYear()+"-"+auxiliarMonth+"-"+auxiliarDay;
		
		//This magic line solves everything
		cal.add(Calendar.YEAR, -auxiliarAge);
		
		System.out.println("You borned on "+cal.getWeekYear()+"-"+
						   auxiliarMonth+"-"+auxiliarDay);
		
		scanner.close();
	}
	
	public static void getBirthDay(){
		//Type your born's date and this method shows your born's date
		Scanner scanner=new Scanner(System.in);
		System.out.println("Type your birthday "
				+ "using this format: dd-MM-yyyy HH:mm:ss");
		
		//At this point, we'll use scanner for getting user's input
//		String data=scanner.nextLine();

		//For case 1
//		String data="07-05-2022 00:00:00";
		//For case 2
		String data="12-01-2022 00:00:00";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		try {
			//Birthday's date - date 2
			Date birthdayDate =sdf.parse(data);
			//Today's date - date 1
			Date currentDate = new Date();
			
			//Now we get the difference between date 2 and date 1
			long dateDiff=birthdayDate.getTime()-currentDate.getTime();

			
			//Months
			long monthsDifference=(TimeUnit.MILLISECONDS.toDays(dateDiff))/30;
			//Days
			long daysDifference=TimeUnit.MILLISECONDS.toDays(dateDiff);
			//Hours
			long hoursDifference=TimeUnit.MILLISECONDS.toHours(dateDiff);
			//Minutes
			long minutesDifference=TimeUnit.MILLISECONDS.toMinutes(dateDiff);
			//Seconds
			long secondsDifference=TimeUnit.MILLISECONDS.toSeconds(dateDiff);
			
			
			if(dateDiff>0) {
				System.out.println("It has to pass: "
							+monthsDifference+" months, "
							+daysDifference+" days, "
							+hoursDifference+" hours, "
							+minutesDifference+" minutes and "
							+secondsDifference+" seconds FOR YOUR BIRTHDAY!!!"
						);				
			}else if(dateDiff<0) {
				System.out.println("Your birhday was: "
						+monthsDifference+" months, "
						+daysDifference+" days, "
						+hoursDifference+" hours, "
						+minutesDifference+" minutes and "
						+secondsDifference+" seconds AGO, See you on next year!!!"
					);
			}else if(dateDiff==0) {
				System.out.println("Your birthday is today!!!");
			}
//			//We want to know the user's input first
//			System.out.println("*****For debugging*****");
//			SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//			
//			System.out.println(formatter.format(birthdayDate));
//			System.out.println(formatter.format(currentDate));
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();
		
		
	}
	
	    
	
		
}
