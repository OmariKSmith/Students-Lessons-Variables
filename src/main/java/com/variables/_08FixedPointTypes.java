package com.variables;

import java.math.BigDecimal;
import java.math.RoundingMode;

//-                                      FIXED POINT NUMBERS
//-              Fixed point types are decimal numbers with a fixed amount of decimal places


public class _08FixedPointTypes {

    public static void main(String[] args) {
        BigDecimal deposit = new BigDecimal("2000.11214554");

        System.out.println(deposit.setScale(2,RoundingMode.UP));
    }
}

