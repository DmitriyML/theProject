package org.example;


import java.util.*;

import org.example.Convolution;

/**
 * Hello world!
 */
public class App {
    static char[] p = "Larionov".toCharArray();//{0x0001, 0x0001, 0x0001};////
    static char[] q = "Alex".toCharArray();//{0x0001, 0x0001, 0x0001, 0x0001};////

    public static void main(String[] args) {
        //Convolution.convert(p,q);
        char[] pswrd = {'Q', 'f', '5', 'J', '8', 'z', '*', 't', '#', 'z', '1', '*', 't', '#' };

        SymbolGroup lowerCase = new SymbolGroup("abcdefghejklmnopqrstuvxwyz".toCharArray());
        SymbolGroup upperCase = new SymbolGroup("ABCDEFGHEJKLMNOPQRSTUVwXYZ".toCharArray());
        SymbolGroup digits = new SymbolGroup("0123456789".toCharArray());
        SymbolGroup special = new SymbolGroup("@#$%&{}/<>?_".toCharArray());

        List<SymbolGroup> symbolGroupList = new ArrayList<>();
        symbolGroupList.add(lowerCase);
        symbolGroupList.add(upperCase);
        symbolGroupList.add(digits);
        symbolGroupList.add(special);
        
        lowerCase.getNextSymbol();
        lowerCase.getNextSymbol();
        digits.getNextSymbol();
        digits.getNextSymbol();
        digits.getNextSymbol();
        upperCase.getNextSymbol();

        int x = symbolGroupList.get(1).size;


    }

}
