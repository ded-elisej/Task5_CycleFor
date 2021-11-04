import java.util.Scanner;

public class CycleForWithExceptions {
    //in this task i'm direct cycle "for" in the right direction
    public static void main(String[] args) {
        System.out.print("Input same number: ");
        int number = new Scanner(System.in).nextInt();
        int summaOfNumber = 0;
        for (int i = 0; i <= Math.abs(number); i++){
            if (number < 0){
                summaOfNumber = summaOfNumber - i;
            } else summaOfNumber = summaOfNumber +i;
        }
        System.out.println("Summa of numbers = " + summaOfNumber);

    }
}
