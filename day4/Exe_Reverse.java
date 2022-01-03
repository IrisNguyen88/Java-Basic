package day4;

import java.util.Scanner;

public class Exe_Reverse {
    public static void main (String[] args) {
        afterReverse ();
    };
    public static void afterReverse () {
        Scanner myObj = new Scanner(System.in);
        String str;
        String nstr = "";
        char ch;
        System.out.println("Enter a string");
        str = myObj.nextLine();
        for (int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            nstr = ch + nstr;
        };
        System.out.println("String after reverse: " + nstr);
    }

}
