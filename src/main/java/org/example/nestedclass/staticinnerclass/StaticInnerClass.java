package src.main.java.org.example.nestedclass.staticinnerclass;

/*
In static inner class we can access the instance variable of the outer class we can access only the static variable
of outer class and instance variable, static variable of inner class
 */
public class StaticInnerClass {

    private int outerValue;

    private static int value = 0;

    static class InnerClass {
        private int innerClassVariable;

        public InnerClass(int innerClassVariable) {
            this.innerClassVariable = innerClassVariable;
        }

        public String getValueFromOuterClass() {
            return String.valueOf(value++) + String.valueOf(innerClassVariable);
        }

        /*
            If want to access the outer class instance variable we need to pass the object of
            outer class as an input parameter and modify the outer
         */
    }

}
