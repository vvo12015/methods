package net.vrakin;

import java.util.Scanner;

/**
 * Methods
 *
 */
public class App 
{

    public static final int COUNT_NUM_IN_ARRAY = 10;

    public static void main(String[] args )
    {
        System.out.println( "Hello methods" );
        boolean notExited = true;
        try(Scanner sc = new Scanner(System.in)) {
            while (notExited){
                System.out.println("Enter number task. Basic task (1-3) or 0 to exit: ");
                int task = sc.nextInt();
                String string = "";

                switch (task){
                    case 0 -> notExited = false;
                    case 1 ->{
                        int[] arr = new int[COUNT_NUM_IN_ARRAY];
                        enteredArr(arr, sc);
                        System.out.printf("Max value of array: %s%n", BasicTasks.max(arr));
                    }
                    case 2 -> {
                        System.out.println("Enter size of sides of the rectangle");
                        System.out.print("Width:");
                        int w = sc.nextInt();
                        System.out.print("High:");
                        int h = sc.nextInt();
                        BasicTasks.rectangle(w, h);
                    }
                    case 3 -> {
                        int[] arr = new int[COUNT_NUM_IN_ARRAY];
                        enteredArr(arr, sc);
                        System.out.println("Enter number of find");
                        int find = sc.nextInt();
                        System.out.printf("Inder of %d - %d%n", find, BasicTasks.find(arr, find));
                    }
                }
            }
        }
    }

    private static void enteredArr(int[] arr, Scanner sc) {
        System.out.printf("Enter %d numbers for array of integers: %n", COUNT_NUM_IN_ARRAY);
        for (int i = 0; i < COUNT_NUM_IN_ARRAY; i++) {
            System.out.println("Enter number " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }
}
