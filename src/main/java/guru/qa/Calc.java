package guru.qa;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int nm1;
        int nm2;
        int sum;
        char po;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        nm1 = reader.nextInt();
        nm2 = reader.nextInt();
        System.out.print("Введите оператор (+, *): ");
        po = reader.next().charAt(0);
        switch(po) {
            case '+': sum = nm1 + nm2;
                break;
            case '*': sum = nm1 * nm2;
                break;
            default:  System.out.printf("Ошибка! Введите правильный оператор");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(nm1 + " " + po + " " + nm2 + " = " + sum);
    }
}
