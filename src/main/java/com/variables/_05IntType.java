package com.variables;

public class _05IntType {

//-                                         PRIMITIVE TYPE int



//-                     The int variable type is the Java representation of a signed integer.
//-                     Int variables are used to store whole numbers


//!     TYPE          NAME        ASSIGNMENT OPERATOR           LITERAL
        int           quantity             =                    -2147483648;


//!      BITS  32               POSSIBLE STATES                 LITERAL RANGE

//`     1111 1111 1111 1111     2^32 = 4,294,967,295            -2147483648 TO 2147483647
//`     1111 1111 1111 1111



//`                                       CHECKPOINT


    public static void main(String[] args) {
        int i = 1 ;
        System.out.println(i); //output : 1

        int j = 2;
        System.out.println(i); //output : 2

        int k = i + j;
        System.out.println(k); //output : 3

        int l = i + j + k; //` what is the value of l

    }

}
