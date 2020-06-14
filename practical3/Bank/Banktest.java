/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.Bank;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Banktest{
    public static void main(String x[]) throws IOException{
    Scanner s=new Scanner(System.in);
    System.out.println("Please enter details: ");
    System.out.println("Bank Name: ");
    String bank=s.nextLine();
    if(bank.equals("ICICI")){
        ICICIBank i=new ICICIBank();
        System.out.println("Enter Account type: ");
        String type=s.nextLine();
        if(type.equals("Savings"))
            System.out.println("Rate of interest is "+i.getSavingsInterestRate()+"%");
        else if(type.equals("Fixed"))
            System.out.println("Rate of interest is "+i.getFixedDepositInterestRate()+"%");
        else
            throw new IOException("Wrong input");
    } 
    else if(bank.equals("Kotak")){
        KotMBank i=new KotMBank();
        System.out.println("Enter Account type: ");
        String type=s.nextLine();
        if(type.equals("Savings"))
            System.out.println("Rate of interest is "+i.getSavingsInterestRate()+"%");
        else if(type.equals("Fixed"))
            System.out.println("Rate of interest is "+i.getFixedDepositInterestRate()+"%");
        else
            throw new IOException("Wrong input");
    }
    else
        throw new IOException("Wrong input");
    }
}
