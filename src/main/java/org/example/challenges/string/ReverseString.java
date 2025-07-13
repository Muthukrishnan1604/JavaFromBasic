package src.main.java.org.example.challenges.string;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Java";
        System.out.println(reverse(input));
    }

    public static String reverse(String input) {
      String result = "";
      if(input != null && !input.isEmpty()) {
          for (int i = input.length() - 1; i >= 0; i--) {
              result += input.charAt(i);
          }
      }
      return result;
    }
}
