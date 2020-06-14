package practical3.Bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import practical3.Bank.GeneralBank;

/**
 *
 * @author Dell
 */
public class KotMBank extends GeneralBank{

    @Override
    double getSavingsInterestRate() {
        return 6;
    }
    @Override
    double getFixedDepositInterestRate() {
        return 9;
    }
}
