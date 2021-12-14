import java.util.InputMismatchException;
import java.util.Scanner;

public class LAB4 {
    public static void main(String args[]) {
        try {
            int enta;
            int r;
            float sm=0;
            Scanner in = new Scanner(System.in);
            System.out.println("Задайте количество элементов массива ");
            r = in.nextInt();
            System.out.println("Задайте элементы массива ");
            float[] array = new float[r];
            for (int i = 0; i < r; i++) {
                array[i] = in.nextFloat();
            }
            System.out.println("Введите порядковый номер нужного элемента для его замены(нумерация начинается с 0): ");
            enta = in.nextInt();
            in.close();
            for (int i = 0; i < enta; i++) {
                sm = sm + array[i];
            }
            sm = sm / (enta);
            System.out.print("Изначальный массив: ");
            for (int i = 0; i < r; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            if ((enta <= array.length) & (enta > 0)) {
                array[enta] = sm;
                System.out.print("Получившийся массив: ");
                for (int i = 0; i < r; i++) {
                    System.out.print(array[i] + " ");
                }
            } else {
                System.out.println("Введён элемент, который не соответветсвует диапазону массива или была произведена попытка замены первого элемента.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Из-за некорректно введеных данных программе требуется перезапуск программы.");
        }
    }
}
