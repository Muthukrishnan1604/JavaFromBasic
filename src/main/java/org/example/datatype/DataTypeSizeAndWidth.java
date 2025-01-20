package src.main.java.org.example.datatype;

/*
    Each data type have different size in memory based on that it will hold the value within that range

    run the below code to see the range and size of each primitive data types
*/

public class DataTypeSizeAndWidth {

    public static void main(String[] args) {

        System.out.println("int size in bits " + Integer.SIZE);

        System.out.println("int size in byte " + Integer.BYTES);

        System.out.println("int range from minimum " + Integer.MIN_VALUE + " to maximum " + Integer.MAX_VALUE );

        System.out.println("long size in bits " + Long.SIZE);

        System.out.println("long size in byte " + Long.BYTES);

        System.out.println("long range from minimum " + Long.MIN_VALUE + " to maximum " + Long.MAX_VALUE );

        System.out.println("short size in bits " + Short.SIZE);

        System.out.println("short size in byte " + Short.BYTES);

        System.out.println("short range from minimum " + Short.MIN_VALUE + " to maximum " + Short.MAX_VALUE );

        System.out.println("byte size in bits " + Byte.SIZE);

        System.out.println("byte size in byte " + Byte.BYTES);

        System.out.println("byte range from minimum " + Byte.MIN_VALUE + " to maximum " + Byte.MAX_VALUE );

        System.out.println("float size in bits " + Float.SIZE);

        System.out.println("float size in byte " + Float.BYTES);

        System.out.println("float range from minimum " + Float.MIN_VALUE + " to maximum " + Float.MAX_VALUE );

        System.out.println("double size in bits " + Double.SIZE);

        System.out.println("double size in byte " + Double.BYTES);

        System.out.println("double range from minimum " + Double.MIN_VALUE + " to maximum " + Double.MAX_VALUE );

        System.out.println("boolean has only two values " + true + " and " + false );

        System.out.println("boolean size in bits is 1");
    }

}
