/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3.Bank;

import practical3.Bank.GeneralBank;

/**
 *
 * @author Dell
 */
public class ICICIBank extends GeneralBank{
    @Override
    double getSavingsInterestRate() {
        return 4;
    }
    @Override
    double getFixedDepositInterestRate() {
        return 8.5;
    }
}
