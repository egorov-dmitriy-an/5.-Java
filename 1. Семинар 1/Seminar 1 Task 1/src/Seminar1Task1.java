import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

// Составить частотный словарь элементов одномерного массива
// Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.
// Пример:
// { 1, 9, 9, 0, 2, 8, 0, 9 }
// частотный массив может быть представлен так:
//
// 0 встречается 2 раза
// 1 встречается 1 раз
// 2 встречается 1 раз
// 8 встречается 1 раз
// 9 встречается 3 раза

class Seminar1Task1{

    public static void main(String args[]){
        List startArray = new ArrayList();
        startArray = create();
        printArray (startArray);
        System.out.println();
        coin (startArray);
    }

    public static List create (){
        List methodArray = new ArrayList();
        Scanner in = new Scanner (System.in);
        System.out.print("Введите размер исходного массива - ");
        int leng = in.nextInt();
        for (int i = 0; i < leng; i++){
            System.out.print("Введите элемент с индексом " + i + " - ");
            int num = in.nextInt();
            methodArray.add(num);
        }
        return (methodArray);
    }

    public static void printArray (List arrayPrint){
        System.out.print("Исходный массив: ");
        for (int i = 0; i < arrayPrint.size(); i++){
            System.out.print(arrayPrint.get(i) + " ");
        }
    }

    public static void coin (List sourceArray){
        for (int i = 0; i < sourceArray.size(); i++){
            int index = 1;
            for (int j = i + 1; j < sourceArray.size(); j++){
                if (sourceArray.get(j) == sourceArray.get(i)){
                    index++;
                    sourceArray.remove(j);
                    j--;
                }
            }
            System.out.println(sourceArray.get(i) + " встречается " + index + " раз(а)");
        }
    }
}