package org.itstep;

import java.util.Random;
import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        //Кузнечик прыгает на 1 см, затем на 2, на 3 и т.д. Через сколько прыжков он взберется на травинку высотой 50 см?
       /* { int a=0;
        int l=0;
        for (int i=0; i<100; i++){
            System.out.print(i+" ");
            i+=a;
            a++;
            l +=2-i;
            System.out.println(" " +l+", ");
        }}

        */
        {double j=0;
        double dis = 0;
        int count =0;
        while (dis<50){
            dis+= j;
            System.out.println(dis);
            j++;
            count++;
        }
        }
        //Вводить натуральные числа с клавиатуры. Признаком окончания ввода будет число -1
        /*{ Scanner scanner = new Scanner(System.in);
        int i=0;
        while (true){
            System.out.println("Enter the number");
            i= scanner.nextInt();
            //System.out.println(i);
        }}*/


        //Кот перемещается короткими бросками (по 5-7 шагов) по лесной тропинке.
        //За сколько перебежек он преодолеет расстояние в 50 шагов?
        {int l = 50;
        int dist=0;
        int count=0;
        Random random = new Random();
        while (dist < l){
            int forward = random.nextInt(2)+5;
            dist +=forward;
            count++;
            System.out.println(dist);
        }
        System.out.println("count"+ count);}


        //Кот перемещается короткими бросками (по 5-7 шагов) по лесной тропинке.
        //Время от времени, почувствовав опасность, он отскакивает на 2-3 шага назад.
        //За сколько перебежек он преодолеет расстояние в 50 шагов?
        {int l = 50;
            int dist=0;
            int count=0;
        Random random = new Random();
        while (dist < l){
            int forward = random.nextInt(3)+5;
            int bacward = random.nextInt(2)+2;
            dist +=forward;
            count++;
            System.out.println(dist);
            int prob = random.nextInt(3)+2;
            if (prob == 3){
                dist -= bacward;
                System.out.println(dist);
            }
        }
        System.out.println("count"+ count);}


     /*   int i;
        do {
            System.out.println();
            i = 10;
        }
        while (i!=-1);*/
    }
}
