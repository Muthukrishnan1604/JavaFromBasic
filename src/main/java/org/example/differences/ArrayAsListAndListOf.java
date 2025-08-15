package src.main.java.org.example.differences;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListAndListOf {

    public static void main(String[] args) {
        List<String> stringList = List.of("Muthu", "Divya", "Krishna", "Hema");
        //List<String> stringList = List.of("Muthu", "Divya", null);

        // If we try to add nulll value to List.of it will throw null pointer exception.
        // We can't modify the list.of object
        // below operation will throw unsupported operation
         /*
         stringList.add("Hema");
         stringList.set(0, "Lyn");
         stringList.remove("Lyn");
          */
        System.out.println(stringList);

        List<String> arrayList = Arrays.asList("Muthu", "Divya", "Krishna", null); // Arrays.asList will allow null value
        /* below operation will throw unsupported operation

         arrayList.add("Hema");
         arrayList.remove("Krishna");

         */

         arrayList.set(0, "Lyn");

        System.out.println(arrayList);

    }

}
