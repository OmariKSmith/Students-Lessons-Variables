package com.variables;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _07DecimalTypes {

//-                                             DECIMAL TYPES


//-                     In Java there are 3 common varaiable types used to represent decimal numbers
//-
//`                                             1. float
//`                                             2. double
//`                                             3. BigDecimal


//-                                     FLOATING POINT TYPES float and double


//-                     Floating point numbers are used in operations where the number
//-                     of decimal places necessary for the operation result are unknown.



//-                                      FIXED POINT TYPE BigDecimal
//-              Fixed point types are decimal numbers with a fixed amount of decimal places


        public static void main(String[] args) {

                float goldBar1 = 45.552464f;
                double goldBar2 = 45.552456464564564f;
                double totalWeight = goldBar1 + goldBar2;

                //`How many decimal places will totalWeight have?
                System.out.println("totalWeight " + totalWeight);

                //`Fix the decimal places for totalWeight at 2, rounding down
                BigDecimal roundedWeight = new BigDecimal(totalWeight);
                System.out.println("totalWeight " + roundedWeight.setScale(2, RoundingMode.DOWN));
        }
}


















    /* 1st Convert the whole number

`           45                  Remainder read bottom to top
            •  45 / 2 = 22      1
            •  22 / 2 = 11      0
            •  11 / 2 =  5      1
            •  5 / 2  =  2      1
            •  2 / 2  =  1      0
            •  1 / 2  =  0      1      1/2 is of course 0.5 but Java rounds up the float type to 1

`           0   0   1   0   1   1   0   1



            // Then convert the fraction

`           .45                  Whole Number read top to bottom
            •  0.45 × 2 =  0.9   0
            •  0.9  × 2 =  1.8   1
            •  0.8  × 2 =  1.6   1 repeating forever irrational
            •  0.6  × 2 =  1.2   1
            •  0.2  × 2 =  0.4   0
            •  0.4  × 2 =  0.8   0
            •  0.8  × 2 =  1.6   1

`           0   1   1   1   1   0   0


            45                            .45
            0   0   1   0   1   1   0   1  . 0    1   1   1   0   0

*
`           Convert into 32 bit IEEE 754 float storage standard


    [0] signed_bit (1 bit)
    [0 0 0 0 0 0 0 0] exponent (8 bits)
    [0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0] mantissa (23 bits)

`     45.45
`     0 0 1 0 1 1 0 1 . 0 1 1 1 0 0   with 1100 repeating

*
     *Convert to scientific notation*
     0 0 1 .0 1 1 0 1 0 1 1 1 0 0 * 2^5

`    * Find the exponent *
     *
     * The exponent is found by adding the number of decimal places
     *  moved to make the scientific notation 5 to the bias number 127
        5 + 127 = 132


`    * Then find the binary version of 132

     •  132 / 2 = 66      0
     •  66 / 2  = 33      0
     •  33 / 2  = 16      1
     •  16 / 2  =  8      0
     •  8 / 2   =  4      0
     •  4 / 2   =  2      0
     •  2 / 2   =  1      0
     •  1 / 2   =  0      1

`    * This gives us  1 0 0 0 0 1 0 0  for our exponent

     *Set the signed bit*

`    [0] 45.45 is positive so the sign bit is 0

     * Now combine the signed bit, exponent,and the mantissa an any repeating values
     *  until you run out of bits

`    [0][1 0 0 0 0 1 0 0][0 0 1 1 0 1 0 1 1 1 0 0 1 1 0 0 1 1 0 0 1 1 0 0]
        This is the true 32 bit binary representation of 45.45 in IEEE 754 standard

`    * Find the exponent
     [ 1    0    0    0    0   1   0   0]
      128 + 64 + 32 + 16 + 8 + 4 + 2 + 1   = 128 + 4 = 132
     132 - 127 = 5



`    * Find the mantissa
        [0 0 1 1 0 1 0 1 1 1 0 0 1 1 0 0 1 1 0 0 1 1 0 0]
`       Move decimal 5 places to the right
        0 0 1 1 0. 1 0 1 1 1 0 0 1 1 0 0 1 1 0 0 1 1 0 0
`       Drop all but the first
        0 1 1 0 1. 0 1 1 1 0 0 1

        [0   1   1   0   1]
        16 + 8 + 4 + 2 + 1 = 8+4 + 1 +

   */






