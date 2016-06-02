/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.check;
import java.util.Scanner;
/**
 *
 * @author itcomputer
 */
public class Program {
    

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) {
 char vowel;
        Scanner sc = new Scanner(System.in);     
        System.out.print("Enter a word: " );
    String str = sc.next(); 
    char[] myChar = str.toCharArray(); 

    for (char c : myChar) { 
        switch (c) {
            case 'a':     
            case 'A':     
            case 'e':     
            case 'E':     
            case 'i':     
            case 'I':     
            case 'o':     
            case 'O':     
            case 'u':     
            case 'U':   
                System.out.println(c + " - Vowel");
                break;
            default:
                System.out.println(c + "- Consonant");
                break;
        }
    }
} 
}
