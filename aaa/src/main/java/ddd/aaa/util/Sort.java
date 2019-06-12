package ddd.aaa.util;

public class Sort {

    public static void quicksort(int[] array, int left, int right) {
        if (left < right) {
            int middle = partion(array, left, right);
            quicksort(array, left, middle - 1);
            quicksort(array, middle + 1, right);
        }
    }

    private static int partion(int[] array, int left, int right) {
        int i = left - 1;
        int temp = array[right];
        int j = left;
        for (; j < right; j++) {
            if (array[j] < temp) {
                i++;
                swap(array, i, j);
            }

        }
        swap(array, i + 1, right);
        return i + 1;
    }


    public static void sheelSort(int[] a){
        int d = a.length;
        while(d!=0){
            d/=2;
            for(int x=0;x<d;x++){
                for(int i=x+d;i<a.length;i+=d){
                   int  j = i-d;
                   int temp = a[i];
                   for(;j>=0&&temp<a[j];j-=d){
                       a[j+d]=a[j];
                   }
                   a[j+d]=temp;
                }
            }
        }
    }


    public static void heapSort(int[] array){

    }

    public static void mergeSort(int[] array,int left,int right){
        if(left<right){
            int q = (left+right)/2;
            mergeSort(array,left,q);
            mergeSort(array,q+1,right);
            merge(array,left,q,right);
        }
    }

    private static void merge(int[] array, int left, int q, int right) {
        int n1 = q-left+1;
        int n2 = right-q;
        StringBuilder v = new StringBuilder();

    }
    private static void merge( int left,int[] array1, int q, int right) {
        int n1 = q-left+1;
        int n2 = right-q;
        StringBuilder v = new StringBuilder();

    }


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String...args){
        int[] array={9,8,7,6,5,4,3,2,1};
       // quicksort(array,0,array.length-1);
        for(int i :array){
            System.out.print(i);
        }
        System.out.println();
        sheelSort(array);
        for(int i :array){
            System.out.println(i);
        }
    }
}
