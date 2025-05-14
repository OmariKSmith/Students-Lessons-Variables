package com.variables;

public class _12VariableTypes {

//-                                             VARIABLE TYPES
//-
//-                             Variables in Java fall into 2 general categories
//`                                             1. Primitive type
//`                                             2. Object type




//-                                             PRIMITIVE TYPES

//`                                             1. boolean
//`                                             2. char
//`                                             3. int
//`                                             4. long
//`                                             5. byte
//`                                             6. short
//`                                             7. float
//`                                             8. double


//-                     The boolean variable type is the Java representation of a single bit


//!     TYPE          NAME        ASSIGNMENT OPERATOR           LITERAL
        boolean       lightSwitch           =                    true;



//!     BITS         STATES 2^1                                 LITERAL RANGE
//`       1             2                                       true, false





//-                   The char variable type is the Java representation of a chararater


//!     TYPE          NAME        ASSIGNMENT OPERATOR           LITERAL
        char          letterA             =                       'A';



//!     BITS  16                  POSSIBLE STATES               LITERAL RANGE

//`     1111 1111 1111 1111 =     2^16 = 65,535                 0 TO 65535






//-                  The int variable type is the Java representation of a signed integer


//!    TYPE          NAME        ASSIGNMENT OPERATOR            LITERAL
       int           quantity             =                    -2147483648;


//!      BITS  32               POSSIBLE STATES                 LITERAL RANGE

//`     1111 1111 1111 1111     2^32 = 4,294,967,295            -2147483648 TO 2147483647
//`     1111 1111 1111 1111






//-                The long variable type is the Java representation of a 64 bit signed integer


//!     TYPE          NAME       ASSIGNMENT OPERATOR             LITERAL
        long          bigNumber             =                    9223372036854775807L;


//!      BITS  64               POSSIBLE STATES                        LITERAL RANGE

/*`     1111 1111 1111 1111     2^64 = 18,446,744,073,709,551,616      -9223372036854775808 TO 9223372036854775807
`       1111 1111 1111 1111
`       1111 1111 1111 1111
`       1111 1111 1111 1111
`*/


//-                              SMALL int types (generally used for small devices)


//`     8 bits
        byte            aByte                   =                      127; // -128 - 127


//`     16 bits
        short           aShort                  =                      32767; // -32768 - 32767



//-                                             OBJECT TYPES

//-                         Object types are composed of primitive types and other objects, but
//-                         are still considered and used as variables.


//!     TYPE          NAME       ASSIGNMENT OPERATOR             LITERAL
        String        stringObject           =                 "a sentence ";

        Object        object                 =                  new Object();

        int[]         inArray                =                  new  int[10];

 //`    Object types can be the built in Java objects, or object made by other programmers
}

