package src.main.java.org.example.immutableandmutable.constructors.enumconstructor;

import java.util.Arrays;

public class EnumConstructorMain {

    public static void main(String[] args) {
        Generation g = Generation.BABY_BOOMER;

        Generation z = Generation.GENZ;

        System.out.println("-".repeat(20));

        for(var gen : Generation.values()) {
            System.out.println(gen);
        }

    }

}
