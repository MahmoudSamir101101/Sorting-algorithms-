/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.algorithms.git;
import java.util.Scanner;
/**
 *
 * @author Trixy
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Insertion Sort
        // TODO code application logic here
        Scanner Enter=new Scanner(System.in);
        System.out.println(" Enter the Numbers to sorted");
        int i,j,key;
        int x[]=new int[10];
        for(int z=0;z<x.length;z++)
            x[z]=Enter.nextInt();
        i=1;
        while(i<x.length){
            key=x[i];
            j=i-1;
            while(j>=0&&x[j]>key){
                x[j+1]=x[j];
                j=j-1;
                x[j+1]=key;}
            i++;
            }
        for(int z=0;z<x.length;z++)
            System.out.println(x[z]);
    }
                
    }
    

