package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Tasks {
    public void Tasks(){
        this.changeTask();
    }

    private void afterTask(){
        int number;
        System.out.println("1. Вернуться в меню \n");
        System.out.println("2. Выход \n");
        number = scanner.nextInt();

        switch (number){
            case 1:
                Tasks();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Недопустимое значение. Попробуйте еще раз.\n");
                scanner.nextLine();
                afterTask();
                break;
        }
    }

    Scanner scanner = new Scanner(System.in);
       private void changeTask(){
           int number;
           System.out.println("Выберите задачу: \n");
           System.out.println("1. Расчет расстояния до места удара молнии\n");
           System.out.println("2. Переворот строки \n");
           System.out.println("3. Найти победителя\n");
           System.out.println("4. Число - палиндром? \n");
           System.out.println("5. Часы минуты секунды в сутках \n");
           System.out.println("6. Выход \n");
           number = scanner.nextInt();
           scanner.nextLine();
           switch (number){
               case 1:
                   this.firstTask();
                   break;
               case 2:
                   String string;
                   this.secondTask();
                   break;
               case 3:
                   this.thirdTask();
                   break;
               case 4:
                   this.fourthTask();
                   break;
               case 5:
                   this.fifthTask();
                   break;
               case 6:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Недопустимое значение. Попробуйте еще раз. Для продолжения нажмите Enter \n");
                   scanner.nextLine();
                   Tasks();
                   break;
           }
       }

       private void firstTask(){
           float resultInFt = 0;
           float interval = 0;
           int number = 0;
           System.out.println("Введите интервал между вспышкой и звуком молнии: ");
           interval = scanner.nextFloat();
           scanner.nextLine();
           resultInFt = interval * 1100;
           System.out.println("Расстояние до молнии: " + resultInFt + " фт");
           this.afterTask();
       }
    public static String reverseString(String inputString) {
        String rightPart;
        String leftPart;

        int length = inputString.length();

        // заканчиваем рекурсивный обход
        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);

        rightPart = inputString.substring(length / 2, length);

        // рекурсивно переворачиваем левую и правую часть входной строки
        return reverseString(rightPart) + reverseString(leftPart);
    }

       private void secondTask(){
           System.out.println("Введите строку: \n");
           String string;
           string = scanner.nextLine();
           System.out.println(reverseString(string));
           this.afterTask();
       }

       private void thirdTask(){
           String[] names = {"Вася", "Петр", "Александр", "Сергей", "Павел"};
           int[] times = {341, 273, 278, 329, 445};
           int min = times[0];
           String minName = "";
           for (int i = 0; i < names.length - 1; i++) {
               if(min > times[i]){
                   min = times[i];
                   minName = names[i];
               }
           }
           System.out.println("Лучший результат у " + minName + " со временем: " + min);
           this.afterTask();
       }

       private void fourthTask(){
           System.out.println("Введите число для проверки");
           int i = scanner.nextInt();
           if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())){
               System.out.println("Число палиндром");
           }
           else{
               System.out.println("число не палиндром");
           }
           this.afterTask();
       }

       private void fifthTask(){
           float daysCount;
           System.out.println("Введите количество суток(целое или десятичное): ");
           daysCount = scanner.nextFloat();
           System.out.println("Количество часов: " + 24*daysCount + ";\nКоличество минут: " + 24*60 * daysCount
            + ";\nКоличество секунд: " + 24*60*60*daysCount);
           this.afterTask();
       }

    private static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
