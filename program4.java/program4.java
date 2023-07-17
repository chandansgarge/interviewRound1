import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter the numbers: as x,y,z ");
        String numbersInput = sr.nextLine();

        String[] numbersArray = numbersInput.split(",");
        int[] numbers = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i].trim());
        }

        int[] counts = new int[10];

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    counts[i]++;
                }
            }
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
