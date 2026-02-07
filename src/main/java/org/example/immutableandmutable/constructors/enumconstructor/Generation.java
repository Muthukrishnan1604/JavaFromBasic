package src.main.java.org.example.immutableandmutable.constructors.enumconstructor;

import java.time.LocalDate;

public enum Generation {

    GENZ {
        static {
            System.out.println("Static Block");
        }
        {
            System.out.println("Testing");
        }
    },

    MILLENNIAL(1981, 2000),

    GENX(1965, 1980),

    BABY_BOOMER(1946, 1964),

    SILENT_GEN(1927, 1945),

    GREATEST_GENERATION(1901, 1926);

    private final int startYear;

    private final int endYear;

    Generation(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
        System.out.println(this + " " + startYear + " - " + endYear);
    }

    Generation() {
        System.out.println("No Arg constructor");
       this(2001, LocalDate.now().getYear());
    }


    @Override
    public String toString() {
        return "Generation{" +
                "Name=" + this.name() +
                "startYear=" + startYear +
                ", endYear=" + endYear +
                "} ";
    }
}
