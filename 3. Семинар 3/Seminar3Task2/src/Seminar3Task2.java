import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

// Необходимо найти длину наибольшей общей последовательности двух наборов

class Seminar3Task2 {
    public static void main(String args[]) {
        ArrayList temp = new ArrayList();
        List one = create();
        List two = create();
        System.out.println("First array: " + one);
        System.out.println("Second array: " + two);
        sort(one, two, temp, 0, 0);
        arrLenMax(result);
    }

    public static ArrayList result = new ArrayList();

    public static void sort(List first, List second, ArrayList stepArray, int m, int n) {
        for (int i = m; i < first.size(); i++) {
            for (int j = n; j < second.size(); j++) {
                if (first.get(i).equals(second.get(j))) {
                    ArrayList count = new ArrayList();
                    count = (ArrayList) stepArray.clone();
                    count.add(first.get(i));
                    sort(first, second, count, i + 1, j);
                }
            }
        }
        if (stepArray.size() > 0) {
            result.add(stepArray);
        }
    }

    public static List create() {
        List arr = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.print("Length array - ");
        int len = in.nextInt();
        for (int i = 0; i < len; i++) {
            System.out.print("Element " + i + " - ");
            String num = in.next();
            arr.add(num);
        }
        return (arr);
    }

    public static void arrLenMax(ArrayList<List> res) {
        int max = 0;
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).size() > max) max = res.get(i).size();
        }
        System.out.println("max length = " + max);
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i).size() == max) System.out.println("СommArray " + res.get(i));
        }
    }
}