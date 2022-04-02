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
        System.out.println (" Значение выражения: " + result);
        int sres = -1 * result;
        System.out.println (" Обратное значение выражения: " + sres);

    //Задание 7
        int A = 5;
        int B = 7;
        System.out.println (" Значение a было: " + A);
        System.out.println (" Значение b было: " + B);
        A = A * B / A;
        B = A - 2;
        System.out.println (" Значение a стало: " + A);
        System.out.println (" Значение b стало: " + B);

        //Задание 8
        int all = 789;
        int mid = all % 100;
        int midle = mid / 10;
        System.out.println (" Первичное число: " + all + " Средняя цифра:" + midle);

    }
}
