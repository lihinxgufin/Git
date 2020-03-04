package javaapplication1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Person {
    
    String name;
    String hp;
    String gender;
    String dob;
    String address;
    
    public void inperson(){
        final Scanner scan = new Scanner(System.in);

        System.out.println("INPUT DATA");
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("HP: ");
        hp = scan.nextLine();
        System.out.print("Gender: ");
        gender = scan.nextLine();
        System.out.print("Date of Birth: ");
        dob = scan.nextLine();
        System.out.print("Address: ");
        address = scan.nextLine();
    }
    
    public void outperson(){
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Gender: " + gender);
        System.out.println("Date Of Birth: " + dob);
        System.out.println("Address: " + address);
    }
}
