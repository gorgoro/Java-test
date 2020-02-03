/*
Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и
вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.

Создать массив объектов. Вывести:

a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
 */

import java.text.ParseException;
import java.util.Calendar;


public class Student {

    public int id = 0;
    public int phone, cource;
    public String fname, mname, lname,  adress,  faculty,  group ;
    public Calendar date;

    public Student(String lname, String fname, String mname, Calendar date, String adress, int phone,
                   String faculty, int course, String group) {
        this.id = id + 1;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.date = date;
        this.adress = adress;
        this.phone = phone;
        this.faculty = faculty;
        this.cource = course;
        this.group = group;
    }

    // getters/setters
    public void setID (int s){
        this.id = s;
    }

    public void setFname (String s){
       this.fname = s;
    }

    public void setMname (String s){
        this.mname = s;
    }

    public void setLname (String s){
        this.lname = s;
    }

    public void setData (Calendar date) throws ParseException{
 /*       SimpleDateFormat str = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date y = str.parse(date);
            this.date = y;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */
        this.date = date;
    }

    public void setAdress (String s){
        this.adress = s;
    }

    public void setPhone (int s){
        this.phone = s;
    }

    public void setFaculty (String s){
        this.faculty = s;
    }

    public void setCource (int s){
        this.cource = s;
    }

    public void setGroup (String s){
        this.group = s;
    }


    public Calendar getDate() {
        return date;
    }

    public int getCource() {
        return cource;
    }

    public int getId() {
        return id;
    }

    public int getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFname() {
        return fname;
    }

    public String getGroup() {
        return group;
    }

    public String getLname() {
        return lname;
    }

    public String getMname() {
        return mname;
    }
}