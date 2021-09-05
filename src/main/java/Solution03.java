/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brian Reed
 */

import java.util.Scanner;

public class Solution03 {
    private static final Scanner scan = new Scanner(System.in);
    public static void  main(String[] args){
        //Prompt user to give a quote and save in string
        //Prompt user to give an author and save in string
        //Print out "(Author) says, (Quote)"
        String quote, author;
        System.out.print("What is the quote? ");
        quote = scan.nextLine();
        System.out.print("Who said it? ");
        author = scan.nextLine();
        System.out.print(author + " says, \"" + quote + "\"");//'(author) says, "(quote)"'
    }
}
