/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 * @version 1.0
 * @param (String[] pStr) Sorting String array.
 * @see groupSort(String[] pStr) Method for Bubble sort algorithm
 * 
 */
public class BubbleSort {

    static int maxn = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] p = {"E", "C", "F", "D", "A", "B"};
        String msg2 = "";
        for (String message : p) {
            msg2 += "[" + message + "]";
        }
        // System.out.println(msg2);
        // String[] ps = Sort(p);

        String msg = "";


        String[] gs = groupSort(p);
        msg = "";
        for (String message : gs) {
            msg += "[" + message + "]";
        }
        System.out.print(msg + "Final List " + maxn + "");
    }

    public static String[] groupSort(String[] pStr) {

        int n = pStr.length;
        boolean swapped = true;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (pStr[i - 1].compareTo(
                        pStr[i]) < 0) {
                    String Temp = pStr[i];
                    pStr[i] = pStr[i - 1];
                    pStr[i - 1] = Temp;
                    swapped = true;
                }
                int z = 0;
                String msg = "";
                for (String message : pStr) {

                    if (z == i - 1 && swapped == true) {
                        msg += "[" + message + "<";
                    } else if (z == i && swapped == true) {
                        msg += ">" + message + "]";
                    } else if (z != i || z != i - 1) {
                        msg += "[" + message + "]";
                    }

                    z++;
                }
                System.out.println(msg);
            }
            n--;
        } while (swapped == true);
        return pStr;
    }

//Optimized Bubble sort
    public static String[] BubbleSort(String[] pStr) {
        int n = pStr.length;
        int newn = 0;
        do {
            newn = 0;
            for (int i = 1; i < n - 1; i++) {
                if (pStr[i - 1].compareTo(
                        pStr[i]) < 0) {
                    String Temp = pStr[i];
                    pStr[i] = pStr[i - 1];
                    pStr[i - 1] = Temp;
                    newn = i;
                    // System.out.print(pStr[i] + " > " + pStr[i - 1]);
                }
            }
            n = newn;
        } while (n != 0);

        return pStr;
    }
}
