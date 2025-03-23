package src.main.java.org.example.basics.controlflow;

/*
Switch will be similar like If else statement

switch(value) {
    case x :
        // code for value x
        break;
    case y :
        // code for value y
        break;
    defaul:
        code for value not equal to x or y
}

If we need to perform same operation for multiple statements we can write statement like

    case 2: case 3: case 4:
            // code for the condition

switch won't support all the data type: It will support byte, short, int, char, String and enum

If we didn't include the break statement once after condition satified it won't check the other cases
but, it will perform logic inside other cases

yield should be used inside the block if we have return statement outside
 */

public class Switch {

    public static void main(String[] args) {
        switchMethod(1);
        switchMethod(2);
        switchMethod(3);
        switchMethod(1L);
        newSwitchStatement(1);
        newSwitchStatement(3);
        newSwitchStatement(7);
        System.out.println("It's in " + getQuaterUsingNewSwitch("January") + " quater");
        System.out.println("It's in " + getQuaterUsingOldSwitch("February") + " quater");
        System.out.println("It's in " + getQuaterUsingOldSwitch("Feb") + " quater");
        System.out.println("It's in " + getQuaterUsingNewSwitch("Feb") + " quater");
    }


    private static void newSwitchStatement(int value) {
        switch (value) {
            case 1 -> System.out.println("Value was 1 from new switch statement");
            case 2 -> System.out.println("Value was 2 from new switch statement");
            case 3, 4, 5 -> {
                System.out.println("Value was 3, 4, 5 from new switch statement");
                System.out.println("Multiple line code from new switch statement");
            }
            default -> System.out.println("Default value from new switch statement");
        }
    }

    private static void switchMethod(int value) {
        switch (value) {
            case 1:
                System.out.println("Value was 1");
                System.out.println("We can write multiple lines of code");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("Actual value is " + value);
                break;
            default:
                System.out.println("Not 1 and 2");
        }
    }

    private static void switchMethod(long value){
        System.out.println("Switch won't support long, float and double data types " + value);
            /*
            switch(value) {
                case 1 :
                    System.out.println("Switch won't support long, float and double data types");
                    break;
                default:
                    System.out.println("Not 1 and 2");
            }*/
    }

    private static String getQuaterUsingOldSwitch(String month) {
        switch (month) {
            case "January": case "February": case "March":
                return "1st";
            case "April": case "May": case "June":
                return "2 nd";
            case "July": case "August": case "September":
                return "3 rd";
            case "October": case "November": case "December":
                return "4 th";
            default :
                return "invalid";
        }
    }

    private static String getQuaterUsingNewSwitch(String month) {
       return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2 nd";
            case "July", "August", "September" -> "3 rd";
            case "October", "November", "December" -> "4 th";
            default -> {
                String response = month + " is invalid month";
                yield response;
            }
        };
    }
}
