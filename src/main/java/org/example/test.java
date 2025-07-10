package demo;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		int dayOfWeek = sc.nextInt();
		dayFind(dayOfWeek);
			
		
	}
	
	public static void dayFind(int day) {
		if(day<31)
			day=day%7;
		
		switch(day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Enter the valid day");
				break;
			
		}
	}
	

}
