package com.variables;

public class _04CharType {

//-                                         PRIMITIVE TYPE char



//-                     The char variable type is the Java representation of a ASCII or Unicode character



//!     TYPE          NAME        ASSIGNMENT OPERATOR           LITERAL
        char          letterA           =                        'A';      //single character, single quotes



//!     BITS  16                  POSSIBLE STATES               LITERAL RANGE

//`     1111 1111 1111 1111 =     2^16 = 65,535                 most unicode or ascii characters


//`                                       CHECKPOINT

    public static void main(String[] args) {
        char ch = 'a' ;
        System.out.println(ch); //output : a

        int i = ch;
        System.out.println(i); //output : 97

        char c = (char) (i);
        System.out.println(c); //output : a

        char charMath = 'a' + 1;
        System.out.println(charMath); //`what is the value of charMath?

    }
}
