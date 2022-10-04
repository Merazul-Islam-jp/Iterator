import java.io.*;
import java.util.*;

public class array_listOne {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner user = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String name = user.nextLine();

            al.add(name);
        }
        Iterator iterator = (Iterator) al.iterator();

        System.out.println("Iterator item:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
