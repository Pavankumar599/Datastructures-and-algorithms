/*
 * This problem is taken from leetcode
 * problem link: https://leetcode.com/problems/count-primes/
 */
import java.util.Scanner;
import java.util.*;
 public class CountPrimes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Value");
        int n = sc.nextInt();
        
        boolean[] sieve = new boolean[n];
        for(int i = 2; i<n; i++){
            sieve[i] = true;
        }

        int count = 0;
        for (int i = 2; i<n; i++){
            if (sieve[i])
            {
                count+=1;
                for(int j= i*2; j <n; j+=i){
                    sieve[j] = false;
                }
            }
        }
        System.out.println("prime numbers below "+ n + " are "+ count);

    }

 }