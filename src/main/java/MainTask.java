/*


Реализовать следующие программы:


1.     Приветствовать любого пользователя при вводе его имени через командную строку.
2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
5.     Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainTask {
    public static void getName() throws IOException {
       try {
           System.out.println("Напиши имя:");
           String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
           System.out.println("Hello " + name + " !");
       }
       catch (Exception e){
           e.printStackTrace();
           System.out.print("Ошибка выбора 1");
       }
    }

    public static void printArgs(String[] args) {
        try {
            System.out.println("Аргументы командной строки в обратном порядке: ");
            for (int i = args.length-1; i >= 0; i--) {
                System.out.print(args[i] + ", ");
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Ошибка выбора 2");
        }
    }

    public static void printDigi() throws NumberFormatException, IOException{
        System.out.println("Введите число");
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        try{
            int uc = Integer.parseInt(str);
            for (int i = 0; i < uc; i++) {
                System.out.print("Число №"+i + (int)(Math.random() * 1000));
                if(i%2==0) System.out.println();
                else System.out.print(" ");
            }
            System.out.println();
            }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка форматирования");
            printDigi();
        }

    }

    public static void sumArgs(String[] args) throws NumberFormatException{
        int sum = 0;
        for (int i = 0; i < args.length ; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Ошибка в аргументах программы. Установите целочисленные.");
                return;
            }
        }
        System.out.println("Сумма аргументов командной строки = " + sum);
    }

    public static void tipaCalendar() throws NumberFormatException, IOException{
        System.out.println("Введите число от 1 до 12");

        try {
            int m = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

            if (m == 1) System.out.print("Январь");
            else if (m == 2)    System.out.print("Февраль");
            else if (m == 3)    System.out.print("Март");
            else if (m == 4)    System.out.print("Апрель");
            else if (m == 5)    System.out.print("Май");
            else if (m == 6)    System.out.print("Июнь");
            else if (m == 7)    System.out.print("Июль");
            else if (m == 8)    System.out.print("Август");
            else if (m == 9)    System.out.print("Сентябрь");
            else if (m == 10)   System.out.print("Октябрь");
            else if (m == 11)   System.out.print("Ноябрь");
            else if (m == 12)   System.out.print("Декабрь");
            else  System.out.print("Ошибка ввода числа");
            System.out.println();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Проверьте ввод.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Проверьте ввод.");
        }

    }


}

