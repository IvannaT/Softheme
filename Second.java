import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        //long count = 1, k = 0, i;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = input.nextInt();

        for ( int i = 1; i <= num; i ++ )
        {
            if (num % i == 0)  // если делится без остатка
            {
                System.out.println("" + i); // вывод делителя
            }
        }

    }
}