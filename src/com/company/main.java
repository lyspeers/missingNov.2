package com.company;

public class main {

    public static void main(String[] args) {
        System.out.println("hello");
        int count, missingNo = 0;
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        int numL = numArray.length;
        for (count =0;count<=numL;count++){
            if(numArray[count]==count+1){
                System.out.print(numArray[count]);
                missingNo = numArray[count];
            }else{

                System.out.println(numArray[count]);
                count = numArray[count]+1;
                System.out.println(missingNo + " is the missing number");
            }

        }
    }
}
