//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество элементов массива: ");
//        int n = scanner.nextInt();
//
//        int[] array = new int[n];
//
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += array[i];
//        }
//
//        double average = (double) sum / n;
//
//        System.out.println("Сумма элементов: " + sum);
//        System.out.println("Среднее арифметическое: " + average);
//
//        scanner.close();
//    }
//}
//
//
//
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество элементов массива: ");
//        int n = scanner.nextInt();
//
//        int[] array = new int[n];
//
//        System.out.println("Введите элементы массива:");
//        int i = 0;
//        while (i < n) {
//            array[i] = scanner.nextInt();
//            i++;
//        }
//
//        int sum = 0;
//        int j = 0;
//        do {
//            sum += array[j];
//            j++;
//        } while (j < n);
//
//        int max = array[0];
//        int min = array[0];
//        int k = 1;
//        while (k < n) {
//            if (array[k] > max) {
//                max = array[k];
//            }
//            if (array[k] < min) {
//                min = array[k];
//            }
//            k++;
//        }
//
//        System.out.println("Сумма элементов: " + sum);
//        System.out.println("Максимальный элемент: " + max);
//        System.out.println("Минимальный элемент: " + min);
//
//        scanner.close();
//    }
//}
//
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Количество аргументов: " + args.length);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//    }
//}
//
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Первые 10 чисел гармонического ряда:");
//
//        // Форматированный вывод: %-5d - номер, %.4f - число с 4 знаками после запятой
//        for (int i = 1; i <= 10; i++) {
//            double value = 1.0 / i;
//            System.out.printf("Член %-2d: %.4f%n", i, value);
//        }
//    }
//}


public class Main {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println(number + "! = " + result);
    }
}

