import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class StudInit {

    public static ArrayList<Student> addStud(ArrayList<Student> sl) {


        Student s1 = new Student("Ivanov", "Petr", "Petrovich", new GregorianCalendar(2000,
                1, 02), "Tver", 8800, "bestfaculty2", 5, "group3");
        Student s2 = new Student("Petrov", "Max", "Petrovich", new GregorianCalendar(1993,
                1, 02), "Tver", 8800, "bestfaculty1", 1, "group2");
        Student s3 = new Student("Sidorov", "Ivan", "Petrovich", new GregorianCalendar(1990,
                1, 02), "Moskow", 8800, "bestfaculty2", 3, "group1");

        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        return sl;
    }

//Вывести список студентов заданного факультета
    public static void printStudFac(ArrayList<Student> sl ){
        System.out.println("Введите номер факультета");
        int i = 0;
        while ( i < sl.size() ) {
           System.out.println("#" + i + " " + sl.get(i).getFaculty());
           i++;
        }
        try {
            String choise = new BufferedReader(new InputStreamReader(System.in)).readLine();
            i = Integer.parseInt(choise);
            System.out.println("Студенты факультета " +  sl.get(i).getFaculty());
            for (int j = 0, num =0; j < sl.size() ; j++) {
                if(sl.get(j).getFaculty() == sl.get(i).getFaculty()) {
                    System.out.println(++num + ". " + sl.get(j).getFname() + " " + sl.get(j).getMname()
                            + " " + sl.get(j).getLname());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    //Вывести списки студентов для каждого факультета и курса;
    public static void printStud(ArrayList<Student> sl ) {
        ArrayList<String> flist = new ArrayList();
        ArrayList<Integer> clist = new ArrayList();
        System.out.println("Вывод студентов факультетов");
        for (int i = 0; i < sl.size() ; i++)
            if (!flist.contains(sl.get(i).getFaculty())){
                flist.add(sl.get(i).getFaculty());
                System.out.println(sl.get(i).getFaculty()+ "-->" + sl.get(i).getFname() + " "
                        + sl.get(i).getMname() + " " + sl.get(i).getLname());
            }

        System.out.println("Вывод студентов групп");
        for (int i = 0; i < sl.size() ; i++)
            if (!clist.contains(sl.get(i).getCource())){
                clist.add(sl.get(i).getCource());
                System.out.println(sl.get(i).getCource() + "-->" + sl.get(i).getFname() + " "
                        + sl.get(i).getMname() + " " + sl.get(i).getLname());
            }
    }
// список студентов, родившихся после заданного года;
    public static void checkYear(ArrayList<Student> sl )  {
        try {
            System.out.println("Введите год рождения");
            String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
            int m = Integer.parseInt(str);

            for (int i = 0; i < sl.size() ; i++){
                if(sl.get(i).getDate().get(Calendar.YEAR) > m)
                    System.out.println(sl.get(i).getDate().get(Calendar.YEAR) + "-->" + sl.get(i).getFname() + " "
                            + sl.get(i).getMname() + " " + sl.get(i).getLname());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//d) список учебной группы.
    public static void checkGroup(ArrayList<Student> sl )  {

        ArrayList<String> list = new ArrayList();

        System.out.println("Введите номер группы ");
        int i = 0;
        while (i < sl.size()) {
            if (!list.contains(sl.get(i).getGroup())) {
                list.add(sl.get(i).getGroup());
                System.out.println("#" + i + " " + sl.get(i).getGroup());
            }
            i++;
        }


        try {
            String choise = new BufferedReader(new InputStreamReader(System.in)).readLine();
            i = Integer.parseInt(choise);
            System.out.println("Студенты " + sl.get(i).getGroup());
            for (int j = 0, num = 0; j < sl.size(); j++) {
                if (sl.get(j).getGroup() == sl.get(i).getGroup()) {
                    System.out.println(++num + ". " + sl.get(j).getFname() + " " + sl.get(j).getMname()
                            + " " + sl.get(j).getLname());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

}
