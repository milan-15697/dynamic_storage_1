import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class array_sort_generics {

    private <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
          
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[smallest])<=0) {
                    smallest = j;
                }
            }

            swap(arr, i, smallest);
        }
    }

    public static void main(String[] args){
        array_sort_generics obj = new array_sort_generics();

        Integer[] arr = {39,94,-77,15};
        String [] abc = {"Milan", "Pankaj", "AcadView"};

        System.out.println("Initial Array: "+ Arrays.toString(arr));
        obj.sort(arr);
        System.out.println("Final Sorted Array : "+Arrays.toString(arr));
       System.out.println("Initial Array: "+ Arrays.toString(abc));
        obj.sort(abc);
        System.out.println("Final Sorted Array : "+Arrays.toString(abc));
    }
}
