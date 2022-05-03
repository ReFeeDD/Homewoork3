import java.util.Arrays;

public class HomeWork3 {
    public static void main(String args[]) {
         Array();
         Massiv();
         x2();
        arr1();
        arr2(6,2);

    }

    public static void Array() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void Massiv() {
        int[] mass = new int[100];
        int x = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;

        }
        for (x = 0; x < mass.length; x++) {
        }
        System.out.println(Arrays.toString(mass));
    }

    public static void x2() {
        int massiv[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 6) {
                massiv[i] = massiv[i] * 2;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }

    public static void arr1() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void  arr2(int len, int InitialValue) {
        int[] massiv = new int[len];
        for (int i =0; i<massiv.length; i++) {
            massiv[i] = InitialValue;
        }
        System.out.println(Arrays.toString(massiv));
    }
}


