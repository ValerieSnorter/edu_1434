package com.company;

import java.util.Scanner; // программа сравнивает каждый элемент массива  и выводит в консоль сообщение об этом равное колличеству
// элементов этого массива. я не понимаю как писать условие что бы происходило сравнение элементов а вывод в консольне относился к циклу
//т.е не повторялся столько же раз сколько итераций.

public class Main {
    public static void main(String[] args) {
        int numbers[] = {43, 3, 0, 5, 8, 4, 2};

        for (int i = 0; i < numbers.length; i++) {
            {if (numbers[i] != 5 )
                System.out.println("нет совпадений");
            if (numbers[i] ==5)
                    System.out.println("совпадение");
                    {
                   }
                    }
                }
}}
