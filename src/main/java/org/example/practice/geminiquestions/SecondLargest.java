package src.main.java.org.example.practice.geminiquestions;

public class SecondLargest {

    public static void main(String[] args) {
        int[] inputList = {20, 10, 30};

        System.out.println("Efficient Approach -> " + secondLargest(inputList));
    }

    private static int secondLargest(int[] inputArray) {
        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length; i++) {
            if(firstLargest < inputArray[i]) {
                secondLargest = firstLargest;
                firstLargest = inputArray[i];
            } else if(inputArray[i] > secondLargest && inputArray[i] != firstLargest) {
                secondLargest = inputArray[i];
            }
        }
        return secondLargest;
    }
}
