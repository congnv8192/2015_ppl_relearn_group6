/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

/**
 *
 * @author 4tech
 */
public class Task2TUT4 {

    public static void main(String[] args) {
        TextIO.put("how many numbers do u want to add to array: ");
        int num = TextIO.getInt();

        int array[] = new int[num];

        for (int i = 0; i < array.length; i++) {
            TextIO.put("Input the " + i + " number");
            array[i] = TextIO.getInt();
        }

        TextIO.putln("The negative integers is: " + countNegative(array));
        TextIO.putln("The Minimum number or the arr is: " + min(array));
        TextIO.putln("it is " + isAscended(array));

    }

    /**
     * @param a
     * @return
     * @brief desc: used to count the negative number of an array
     * @effects count is the number of negative integers, array a, item a[i] if
     * a[i] < 0 then count ++
     */
    public static int countNegative(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * brief des: used to find the minimum number of an integer array.
     *
     * @param a
     * @return
     * @modifies: min
     * @effects: array a, item i, min num 
     * default: min = a[0] if a[i] > a[i+1] 
     * then a[i+1] = min 
     * else min = a[i]
     * return min
     *
     */
    public static int min(int[] a) {
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                min = a[i + 1];
                i++;
            } else {
                min = a[i];
                i++;
            }

        }
        return min;
    }

    /**
     *
     * @param a
     * @return
     * @requires: a != null, a.length > 1.
     * @effects; if there are: x= a[i] and y = a[i+1} and x > y then return
     * false else return true.
     */
    public static boolean isAscended(int[] a) {
        boolean sorted = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }

        }
        return true;

    }
}
