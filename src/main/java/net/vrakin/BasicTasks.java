package net.vrakin;

public class BasicTasks {

    public static int max(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void rectangle(int wide, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wide; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int find(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
