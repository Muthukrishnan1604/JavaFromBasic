package src.main.java.org.example.challenges.oops.inheritance.composiition;

public class Refrigerator extends HasWorkToDo {

/*
    public Refrigerator() {

    }

    public Refrigerator(boolean hasWorkToDo) {
        super.setHasWorkToDo(hasWorkToDo);
    }

 */

    public void orderFood() {
        if(super.isHasWorkToDo()) {
            System.out.println("Makes ice cubes");
            super.setHasWorkToDo(false);
        }
    }
}
