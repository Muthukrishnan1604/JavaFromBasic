package src.main.java.org.example.interestingfacts.iee754;

/*
Don't use Double and float in case of decimal value calculations are required in your field
 */
public class DoubleDataType {

    public static void main(String[] args) {
        float floatVar = 0.7f;
        System.out.println((double) floatVar); // This will not return the float value as it is due to IEEE754

        /* Behind the scenes below steps will happen
            Float is 4 byte data type so behind the scenes it is 32 bits out of 32 bits
            1 bit is for deciding plus (+) or minus (-)
            8 bit is for exponential
            23 bit for significant
         */
        /* Step 1 convert to binary ->
            1 --> .7 * 2 = 1.4 -> 1
            2 --> .4 * 2 = 0.8 -> 0
            3 --> .8 * 2 = 1.6 -> 1
            4 --> .6 * 2 = 1.2 -> 1
            5 --> .2 * 2 = 0.4 -> 0
            6 --> .4 * 2 = 0.8 -> 0
            7 --> .8 * 2 = 1.6 -> 1
            If you notice it will show the same pattern is repeating from 6

            above will be represented in 0.1011 001100...

        2. Convert to exponential -> if you move any value from left to right we need to consider each move with positive value, alternate way should be negative

        1 e ^

         */
    }

}
