import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        int dayCount = Integer.parseInt(arr[0]) + 1;

        int[] degree = convertToInts();
        int maxi = 0;
        int count = 0;
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] > 0){
                count++;
            }
            else{
                if (count>maxi){
                    maxi = count;
                    count = 0;
                }
            }
        }
        System.out.println(maxi);
    }
    public static int[] convertToInts(){
        String[] arr = ArrayReader.execute();
        int[] degree = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            degree[i - 1] = Integer.parseInt(arr[i]);
        }
        return degree;
    }
}