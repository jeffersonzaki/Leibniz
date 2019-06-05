import javax.swing.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Formatter;



//calculating pi using Leibniz algorithm
public class Leibniz {

public static String output = "";

public static double leibniz(long limit) {

    double pi = 0; long denom = 1; int sign = 1;


    while(denom <= limit) {
        pi = pi + sign * (1.0 / denom);
        denom = denom + 2;
        sign = -sign;
    }
    return pi * 4;
}



    // * Main Method * //
    public static void main(String[] args) {

        //changes how many decimal places are added into the value of pi
        long Limit = 1000000000;

        output += "\nThe value of pi using Leibniz series up to " + Limit + " = " + leibniz(Limit);
        JOptionPane.showMessageDialog(null, output);

    }
}
