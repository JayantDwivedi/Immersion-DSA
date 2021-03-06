package Greedy;

import java.util.Arrays;

public class CoinCount {
    public static void main(String[] args) {
        int[] currency = {1,2,5,10,20,50,100,200,500,2000};
        int amount = 39;


        int count = 0;

        while (amount > 0) {
            int index = Arrays.binarySearch(currency,amount);

            if (index < 0) {
                index = Math.abs(index) - 2;
            }
            amount -= currency[index];
            count++;
        }
        System.out.println(count);
    }
}
