package codingwizards;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a date: ");
        String s = sc.nextLine();
        String []s1 = s.split(" ");
        int day= Integer.parseInt(s1[0]);
        String month= s1[1];
        int year= Integer.parseInt(s1[2]);
        int inc_date= 0;
        int date=day;
        if ((year% 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            inc_date=29;
        }
        else{
            inc_date=28;
        }
        switch(month){
        case "February":
            date += 31;
            break;
        case "March":
            date += 31+inc_date;
            break;
        case "April":
            date += 31+inc_date+31;
            break;
        case "May":
            date += 31+inc_date+31+30;
            break;
        case "June":
            date += 31+inc_date+31+30+31;
            break;
        case "July":
            date += 31+inc_date+31+30+31+30;
            break;            
        case "August":
            date += 31+inc_date+31+30+31+30+31;
            break;
        case "September":
            date += 31+inc_date+31+30+31+30+31+31;
            break;
        case "October":
            date += 31+inc_date+31+30+31+30+31+31+30;            
            break;            
        case "November":
            date += 31+inc_date+31+30+31+30+31+31+30+31;            
            break;                        
        case "December":
            date += 31+inc_date+31+30+31+30+31+31+30+31+30;            
            break;               
        }
        System.out.println(date);
    }
}