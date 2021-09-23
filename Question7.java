package day2;

import java.util.*;
class Question7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Input seconds: ");
        int seconds = in.nextInt();
        int second = seconds % 60;
        int hour = seconds / 60;
        int minutes = seconds % 60;
        hour = hour / 60;
        System.out.println( "Result of input:  ");
        System.out.println(hour + "Hours   " + minutes + "Min  " + second + "Sec  ");
    }
}