/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Caleg extends Person{
        public static void main(final String[] args) {
    
        Person data = new Person();
        data.inperson();

        final Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("Partai: ");
        final String partai = scan.nextLine();
        System.out.print("No Urut: ");
        final String nourut = scan.nextLine();
        System.out.print("Dapil: ");
        final String dapil = scan.nextLine();
        System.out.print("Istri: ");
        final String istri = scan.nextLine();
        System.out.print("Anak 1: ");
        final String anak1 = scan.nextLine();
        System.out.print("Anak 2: ");
        final String anak2 = scan.nextLine();
        System.out.print("Anak 3: ");
        final String anak3 = scan.nextLine();

        System.out.println();
        System.out.println("OUTPUT DATA");
        data.outperson();
        System.out.println("Partai: " + partai);
        System.out.println("No Urut: " + nourut);
        System.out.println("Dapil: " + dapil);
        System.out.println("Istri: " + istri);
        System.out.println("Anak 1: " + anak1);
        System.out.println("Anak 1: " + anak2);
        System.out.println("Anak 1: " + anak3);
    }
}
