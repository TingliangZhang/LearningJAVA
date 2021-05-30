package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!"); // Prints the string to the console.
        String name = "Tina";
        System.out.println(name.toUpperCase());
        String exclaim = addExclamationPoint(name);
        System.out.println(exclaim);

        Tina a = new Tina();
        String t = a.iAmTina();
        System.out.println(t);


    }

    public static String addExclamationPoint(String s){
        System.out.println(s + "!");
        return s + "!";
    }

}
