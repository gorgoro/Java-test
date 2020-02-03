import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Menu {
    public static void main (String[] args) throws IOException {
        while (true) {
            System.out.println("***MENU***");
            System.out.println(
                            "1.     Java foundamentals" + "\n" +
                            "2.    Classes." + "\n");
            System.out.println("########");
            System.out.print("->");

            String choise = new BufferedReader(new InputStreamReader(System.in)).readLine();

            switch (Integer.parseInt(choise)) {
                case 1:
                    jfMenu(args);
                    break;
                case 2:
                    classesMenu();
                    break;

                default:
                    return;
            }
        }
    }

    public static void jfMenu(String[] args) throws IOException{
        while (true) {
            System.out.println("***MENU***");
            System.out.println(
                    "1.     Приветствовать любого пользователя при вводе его имени через командную строку." + "\n" +
                            "2.     Отобразить в окне консоли аргументы командной строки в обратном порядке." + "\n" +
                            "3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку" + "\n" +
                            "4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль." + "\n" +
                            "5.     Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
            System.out.println("########");
            System.out.print("->");
            String choise = new BufferedReader(new InputStreamReader(System.in)).readLine();

            switch (Integer.parseInt(choise)) {
                case 1:
                    MainTask.getName();
                    break;
                case 2:
                    MainTask.printArgs(args);
                    break;
                case 3:
                    MainTask.printDigi();
                    break;
                case 4:
                    MainTask.sumArgs(args);
                    break;
                case 5:
                    MainTask.tipaCalendar();
                    break;
                default:
                    break;
            }
        }
    }

    public static void classesMenu() throws IOException{
        ArrayList<Student> sl = new ArrayList();
        sl = StudInit.addStud(sl);
        System.out.println("Студенты зачислены.");

        while (true) {
            System.out.println("***MENU***");
            System.out.println("1) Вывести список студентов заданного факультета;");
            System.out.println("2) Вывести списки студентов для каждого факультета и курса;");
            System.out.println("3) Вывести список студентов, родившихся после заданного года;");
            System.out.println("4) Вывести список учебной группы.");
            System.out.print("->");

            String choise = new BufferedReader(new InputStreamReader(System.in)).readLine();

            switch (Integer.parseInt(choise)) {
                case 1:
                    StudInit.printStudFac(sl);
                    break;
                case 2:
                    StudInit.printStud(sl);
                    break;
                case 3:
                    StudInit.checkYear(sl);
                    break;
                case 4:
                    StudInit.checkGroup(sl);
                    break;

                default:
                    return;
            }
        }
    }
}
