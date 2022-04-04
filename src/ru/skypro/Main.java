package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // Задача 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);


        // Задача 2

        String fullNames = "Ivanov Ivan Ivanovich";
        String upperFullName = fullNames.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + upperFullName);

        // Задача 3

        String fullName1 = "Ivanov Ivan Ivanovich";
        String result = fullName1.replace( " ", "; ");
        System.out.println(result);

        // Задача 4

        String fullName2 = "Иванов Семён Семёнович";
        String[] StringArrey = fullName2.split( " ");
        for (int i = 0; i < StringArrey.length; i++) {
            if (StringArrey[i].contains("ё")) {
                StringArrey[i] = StringArrey[i].replace( "ё", "е");

            }
        }
        String result1 = String.join( " ", StringArrey);
        System.out.println("Данные ФИО сотрудника — " + result1);

    }

}
