package employee;

import java.util.ArrayList;
import java.util.Iterator;

public class StringList {

    ArrayList<String> list =
        new ArrayList<String>();

    // Add strings
    public void add(String str) {

        list.add(str);
    }

    // Print all elements using Iterator
    public void printAll() {

        Iterator<String> iterator =
            list.iterator();

        while (iterator.hasNext()) {

            String str =
                iterator.next();

            System.out.println(str);
        }
    }

    public static void main(
        String[] args
    ) {

        StringList obj =
            new StringList();

        obj.add("URK23CS1114");
        obj.add("Java");
        obj.add("Python");
        obj.add("C");
        obj.add("JavaScript");

        obj.printAll();
    }
}
