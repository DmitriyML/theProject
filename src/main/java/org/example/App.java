package org.example;


import java.util.Hashtable;
import org.example.Convolution;

/**
 * Hello world!
 */
public class App {
    static char[] p = "Larionov".toCharArray();//{0x0001, 0x0001, 0x0001};////
    static char[] q = "Alex".toCharArray();//{0x0001, 0x0001, 0x0001, 0x0001};////

    public static void main(String[] args) {
        Convolution.convert(p,q);



    }


}
