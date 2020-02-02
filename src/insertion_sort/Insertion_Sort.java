/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion_sort;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Insertion_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: "); 
        int size = sc.nextInt();
        int[] arr = new int[size];    
        System.out.println("Enter "+size+" Elements:");
        
        for (int i = 0; i < size; i++) {
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            int current =arr[i];
           int j=i-1;
            while (j>=0 && current <arr[j]){
                arr[j+1]=arr[j];
                j--;}
            
                arr[j+1]=current;
        }
        System.out.println("Sorted Array:");
            for (int i= 0; i < size; i++) {
            System.out.println(arr[i]);
            
            }
    }
    }
    
   

