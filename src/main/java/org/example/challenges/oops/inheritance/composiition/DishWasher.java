package src.main.java.org.example.challenges.oops.inheritance.composiition;

public class DishWasher extends HasWorkToDo {
/*
    public DishWasher() {

    }

    public DishWasher(boolean hasWorkToDo) {
        super.setHasWorkToDo(hasWorkToDo);
    }

 */

    public void doDishes() {
        if(super.isHasWorkToDo()) {
            System.out.println("Wash the plates");
            super.setHasWorkToDo(false);
        }
    }

}
