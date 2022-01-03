package day4;

import java.util.Scanner;

public class Exe_Palindrome {
    public static void main (String [] args) {
        Palindrome ();
    };
    public static void Palindrome () {
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
        if (nstr.equals(str))
            {
                System.out.println("Palindrome");
            }
        else
            {
                System.out.println("Not Palindrome");
            };
    };
}
