//1)Создайте список чисел. Отфильтруйте только четные числа, отсортируйте их по возрастанию и найдите их сумму.
//2)Создайте список строк, отфильтруйте строки длиной более 5 символов, преобразуйте их в нижний регистр и соберите в новую коллекцию

import java.util.ArrayList;

public class malenkie_zadachki {
    public static void nomber(int[] array){
        int count=0;
        for (int i=0; i<array.length;i++) {
            if (array[i]%2!=0){
                count+=1;
            }
        }
        int[] evenArray = new int[count];
        count=0;
        for (int i=0; i<array.length;i++) {
            if (array[i]%2==0){
                evenArray[count]=array[i];
                count++;
            }
        }
        intprinter(evenArray);
        System.out.println();
        selectionSort(evenArray);
    }
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Обмен элементов
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        intprinter(array);
        System.out.println();
        System.out.println(summ(array));

    }
    public static void intprinter(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
    public static int summ(int[] array){
        int summ =0;
        for (int i = 0; i < array.length; i++) {
            summ +=array[i];
        }
       return summ;
    }

    public static void stringing (String[] stringer){
        ArrayList<String> finale= new ArrayList<>();
        for (int i = 0; i < stringer.length; i++) {
            if (stringer[i].length() > 5) {
                finale.add(stringer[i]);
            }
        }
        String[] finalestr=finale.toArray(new String[0]);
        stringreader(finalestr);
        novgorod(finalestr);
    }
    public static void novgorod (String[] stinger) {
        for (int i = 0; i < stinger.length; i++) {
            stinger[i]=stinger[i].toLowerCase();
        }
        stringreader(stinger);
    }
    public static void stringreader(String[] stinger){
        System.out.println();
        for (int i = 0; i < stinger.length; i++) {
            System.out.print(stinger[i]+' ');
        }
    }

    public static void main(String[] args) {
        int[] x={4,5,2,6,1,3};
        String[] aboba={"StRiNg","int","bebras"};
        nomber(x);
        stringing(aboba);
    }
}