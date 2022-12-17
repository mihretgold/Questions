import java.util.Scanner;
import java.lang.Math;

// Write a program that simulates a simple slot machine in which three numbers between 0 and 9 are randomly selected and printed side by side. Print an appropriate statement if all three of the numbers are the same or if any two of the numbers are the same. Continue playing until the user chooses to stop.
public class Three {
    public static void main(String[] args) {
        int max = 9, min = 0;
        int range = max - min + 1;
        int x;
        int[] arr = new int[3];
        char c;
        Scanner s = new Scanner(System.in);
        System.out.print("Do You want to play game(y/n): ");
        c = s.next().charAt(0);
        while (c == 'y' || c == 'Y') {
            int i = 0;
            while (i < 3) {
                x = (int) (Math.random() * range) + min;
                arr[i] = x;
                i++;
            }
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
            if (arr[0] == arr[1] && arr[0] == arr[2]) {
                System.out.println("All numbers are the same!!!");
            } else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
                System.out.println("Two of the Numbers are the same!!!");
            } else {
                System.out.println("None are the same!!!");
            }
            System.out.println("Do You want to try again(y/n)");
            c = s.next().charAt(0);
        }

    }
}
