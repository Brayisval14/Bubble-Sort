import java.io.*;
import java.util.*;

public class BubbleSort {

    // -------------------- BUBBLE SORT --------------------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // --------------------------- MAIN ---------------------------
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input.txt"));
            List<Integer> lista = new ArrayList<>();

            while (sc.hasNextInt()) {
                lista.add(sc.nextInt());
            }

            int[] datos = lista.stream().mapToInt(i -> i).toArray();

            bubbleSort(datos);

            PrintWriter pw = new PrintWriter("output.txt");
            for (int n : datos) pw.print(n + " ");
            pw.close();

            System.out.println("Bubble Sort completado.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
