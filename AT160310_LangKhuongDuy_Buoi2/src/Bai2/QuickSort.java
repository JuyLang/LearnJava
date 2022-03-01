/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author langk
 */
public class QuickSort extends DaySo implements Sort{

    public QuickSort(int n) {
        super(n);
    }
     int partition(int[] array, int low, int high)
    {
        int pivot = array[low];
        while(low != high){
            if(pivot < array[high]){
                high--;
            }
            else if( pivot > array[high]){
                swap(array, low, high);
                low++;
            }
            else if(pivot > array[low]){
                low++;
            }
            else if( pivot < array[low]){
               swap(array, low, high);
            }
        }
        return low;
    }

    void quickSort(int[] array, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    @Override
    public void Sort() {
       quickSort(array, 0, size-1);
        
    }
    
}
