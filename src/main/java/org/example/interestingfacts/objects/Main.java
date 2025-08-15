package src.main.java.org.example.interestingfacts.objects;

public class Main {

    public static void main(String[] args) {
        Parent childObject = new Child();
        /*
         Note -> If we create Object
         with the parent class name and if we try to call the variable it will call the parent class variable
         */
        System.out.println(childObject.var);

        /*
         Note -> If we create Object
         with the parent class name and if we try to call the method it will call the child class method
         */
        System.out.println(childObject.getVar());

    }

}
