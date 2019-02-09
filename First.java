import java.util.*;

public class First {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ch;
        int counter = 0; //счетчик единиц

        System.out.println("Enter your string: ");

        ch = input.nextLine();
        char[] charr = ch.toCharArray();


        int one[] = new int [50]; // элементы массива будет равнятся количеству единиц от одного нуля до другого
        int j = 0;
        for (int i = 0; i < charr.length; i++)
        {
            if (charr[i] == '1')
                counter++;
            else
            {
                one[j] = counter;
                counter = 0;
                j++;
            }
        }

        int max = one[0];
        for (int i = 0; i < j; i++)
        {
            if (one[i] > max)
                max = one[i];
        }

        System.out.println(max);
    }
}
