import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task one");
        int [] arraySpendToMonth = new int[5];
        arraySpendToMonth[0] = 100000;
        arraySpendToMonth[1] = 120000;
        arraySpendToMonth[2] = 110000;
        arraySpendToMonth[3] = 105000;
        arraySpendToMonth[4] = 140000;
        int sum = 0;
        for (int element : arraySpendToMonth) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task two");
        int [] arraySpendToWeek = new int[5];
        arraySpendToWeek[0] = 11000;
        arraySpendToWeek[1] = 12500;
        arraySpendToWeek[2] = 8000;
        arraySpendToWeek[3] = 14000;
        arraySpendToWeek[4] = 10200;
        int minSum = arraySpendToWeek[0];
        int maxSum = arraySpendToWeek[0];
        for (int current : arraySpendToWeek) {
            if (current > maxSum) {
                maxSum = current;
            }
            if (current < minSum) {
                minSum = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxSum + " рублей.");

        System.out.println("Task three");
        double [] arrayExpendToWeek = new double[5];
        arrayExpendToWeek[0] = 11000.0;
        arrayExpendToWeek[1] = 12507.0;
        arrayExpendToWeek[2] = 8001.0;
        arrayExpendToWeek[3] = 14004.0;
        arrayExpendToWeek[4] = 10200.0;
        /*double average;*/
        double sumExpand = 0;
        for (double current : arrayExpendToWeek) {
            sumExpand += current;
        }
        double average = sumExpand / arrayExpendToWeek.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        System.out.println("Task four");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char word;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            word = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = word;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}