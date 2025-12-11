import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();  // read each number into the array
        }


        int largest = numbers[0];


        for (int i = 1; i < 5; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];   // update largest
            }
        }

        System.out.println("The largest number is: " + largest);

    }
}

