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
public class Pekerja extends Person{
    public static void main(final String[] args) {
    
        Person data = new Person();
        data.inperson();

        final Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Work Address: ");
        final String workaddress = scan.nextLine();
        System.out.print("Company: ");
        final String company = scan.nextLine();
        System.out.print("Company Phone: ");
        final String companyphone = scan.nextLine();
        System.out.print("Position: ");
        final String position = scan.nextLine();
        System.out.print("NPWP: ");
        final String npwp = scan.nextLine();
        
        System.out.println();
        System.out.println("OUTPUT DATA");
        data.outperson();
        System.out.println("Work Address: " + workaddress);
        System.out.println("Company: " + company);
        System.out.println("Company Phone: " + companyphone);
        System.out.println("Position: " + position);
        System.out.println("NPWP: " + npwp);
    }
}
