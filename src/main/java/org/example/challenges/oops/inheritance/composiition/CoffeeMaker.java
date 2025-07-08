package src.main.java.org.example.challenges.oops.inheritance.composiition;

public class CoffeeMaker extends HasWorkToDo{

   /*
    public CoffeeMaker() {

    }

    public CoffeeMaker(boolean hasWorkToDo) {
        super.setHasWorkToDo(hasWorkToDo);
    }
   */

    public void brewCoffee() {
        if(super.isHasWorkToDo()) {
            System.out.println("Make coffee");
            super.setHasWorkToDo(false);
        }
    }

}
