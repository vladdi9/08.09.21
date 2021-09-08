package org.itstep;

import java.util.Random;

public class CicleFor {
    public static void main(String[] args) {
        //Поднимаемся по ступенькам с 1-й по 9-ю
        for (int i=1; i<10; i++)
        System.out.print(i+"i, ");
        //Избавимся от последней запятой
        System.out.println();
        {int i;
        for (i=1;i<9; i++)
            System.out.print(i+ ", ");
        System.out.println(i);}


        // бесконечный цикл (;;)   (;tre;)
        //Человек нажимает кнопку счетчика и прыгает через ступень
        {System.out.println();
        for (int i=0; i<10; i++)
            System.out.println(i++);}
        //0,1,3,6,10
        {int a=0;
        for (int i=0;i<16; i++){
            System.out.print(i+" ");
        i+=a;
        a++;
            System.out.println();}}


        //Шагает по случайным ступенькам с 1 по 9
        { Random random = new Random();
        for (int i=0; i<9; i++){
            int number=random.nextInt(9)+1;
            System.out.print(number+", ");}}
        System.out.println();
            // шаг через 1
            for (int i=0; i<10; i++,i++)
                System.out.print("step "+i+", " );
        System.out.println();
            // шаг
        for (int i=10 ;i>0; i--,i--)
            System.out.print("step1 "+i+", ");
        System.out.println();
        //Поднимаясь по ступенькам, в какой-то момент перешагнуть через одну
        for (int i=0; i<10; i++){
            if (i==5) break; // continue - пропустить этот шаг: break - остановится на данном шаге
            System.out.print("step "+i+", ");
            System.out.println();}

            //Счетчик имеется только у одного человека. При этом первый поднимается вверх, а второй спускается вниз
            {for (int i=0; i<10; i++,i++){
                System.out.print(" "+i+", ");
                int s=8-i;
                System.out.println(" "+s+", ");}}

                //Два человека поднимаются по лестнице. Один ступает на каждую ступеньку, второй - через одну
                //Подъем прекращается, когда один из них поднимется
                for (int i=0, j=0; i<10 && j<10; i++, j+=2){
                System.out.print("first "+ i+", ");
                System.out.println("second "+ j+", ");}
    }
}
