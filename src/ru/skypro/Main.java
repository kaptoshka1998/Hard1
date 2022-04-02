package ru.skypro;

public class Main {

    public static void main(String[] args) {
	//Задание 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.print (" Значение выражения: " + result);
        int sres = -1 * result;
        System.out.print (" Обратное значение выражения: " + sres);

    //Задание 7
        int A = 5;
        int B = 7;
        int A1 = B;
        System.out.print (" Значение a было: " + A + " Стало:" + A1);
        int B1 = A;
        System.out.print (" Значение b было: " + B + " Стало:" + B1);

        //Задание 8
        int all = 789;
        int mid = all % 100;
        int midle = mid / 10;
        System.out.print (" Первичное число: " + all + " Средняя цифра:" + midle);

    }
}
