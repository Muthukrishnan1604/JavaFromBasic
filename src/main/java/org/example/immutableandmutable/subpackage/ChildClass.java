package src.main.java.org.example.immutableandmutable.subpackage;

import src.main.java.org.example.immutableandmutable.Baseclass;

public class ChildClass extends Baseclass {

    /*@Override
        public void recommendedMethod() {
            System.out.println("[Child.baseClassMethod]: I'll do things my way");
            optionalMethod();
        }
    */

    @Override
    protected void optionalMethod() {
        System.out.println("Child.OptionalMethod]: Extra implementation");
        super.optionalMethod();
    }

    public static void recommendedStatic() {
        System.out.println("[Child class.recommended static]: Best Way to do it");
        optionalStatic();
        //mandatoryStatic();
    }
}
