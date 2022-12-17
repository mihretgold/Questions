import java.util.ArrayList;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        char c;

        do {
            System.out.print("Enter a number: ");
            arr.add(s.nextInt());
            System.out.print("Would you like to enter another number: ");
            c = s.next().charAt(0);
        } while (c == 'y' || c == 'Y');
        int count1 = 1, count2 = 1;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                count1++;
            } else if (arr.get(i) > arr.get(i + 1)) {
                count2++;
            }
        }
        if (count1 == arr.size() || count2 == arr.size()) {
            System.out.println("The List is sorted !!!");
        } else {
            System.out.println("The List is not sorted !!!");
        }
    }
}
