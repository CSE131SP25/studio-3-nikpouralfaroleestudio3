package studio3;

import java.util.Scanner;


public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value for n: ");
		int n = in.nextInt();
		
		boolean[] primes = new boolean[n + 1];
		for(int i = 0; i < primes.length; i++) {
		primes[i] = true;
		}
		for(int i = 2; i < n/i; i++) {
		for(int a = i+i; a <= n; a = a+i) {
		primes[a] = false;
		}
		}
		for(int i = 2; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}
	}

}
