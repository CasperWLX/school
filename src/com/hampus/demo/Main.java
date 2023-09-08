package com.hampus.demo;

public class Main
{
    public static void main(String[] args)
    {
        addition();
        firstValue();
        stringAddition();
        caseSensitivity();
        forEachLoop();

    }

    public static void addition()
    {
        int x = 15;
        int y = 25;

        System.out.println(x + y);
    }

    public static void firstValue()
    {
        int[] listOfNumbers = {12, 4, 5, 16, 23, 742};
        System.out.println(listOfNumbers[0]);
    }

    public static void stringAddition()
    {
        String name1 = "Benny";
        String name2 = "Anton";
        String combinedName = name1 + name2;

        System.out.println(combinedName);
    }
    //Att ändra public -> private gör att programmet inte går att köras.

    //Att ta bort static gör att programmet inte går att köras.
    public static void caseSensitivity()
    {
        int number = 1;
        int Number = 2;

        System.out.printf("%d %d\n", number, Number);
    }

    /**
     * Denna array kommer inte fungera då typen är int och den kan endast ta emot int och inte blandade typer.
     */
    public static void incorrectArray()
    {
        // int[] array = {1,true,2,5,false};
    }

    public static void forEachLoop()
    {
        int[] listOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : listOfNumbers)
        {
            System.out.println(number);
        }
    }
}
