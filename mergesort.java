/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
public class Sieves {

    /**
     * @param args the command line arguments
     */
   private int[] arr;
    private int[] tempArr;
    private int length;
    public static void main(String a[]){
       Scanner scan= new Scanner(System.in);
       int n= scan.nextInt();
       int [] arr= new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=scan.nextInt();
       }
				
        Sieves mers = new Sieves();
        mers.sort(arr);
		
        for(int i:arr){
            System.out.println(i);
        }
    }
    public void sort(int arr[]) {
        this.arr = arr;
        this.length = arr.length;
        this.tempArr = new int[length];
        MergeMethod1(0, length - 1);
    }
    private void MergeMethod1(int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int middle = lowIndex + (highIndex - lowIndex) / 2;
            MergeMethod1(lowIndex, middle);
            MergeMethod1(middle + 1, highIndex);
            mergeMethod2(lowIndex, middle, highIndex);
        }
    }
    private void mergeMethod2(int lowIndex, int middle, int highIndex) {
        for (int i = lowIndex; i <= highIndex; i++) {
            tempArr[i] = arr[i];
        }
        int i = lowIndex;
        int j = middle + 1;
        int k = lowIndex;
        while (i <= middle && j <= highIndex) {
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempArr[i];
            k++;
            i++;
        }
 
    }
}

