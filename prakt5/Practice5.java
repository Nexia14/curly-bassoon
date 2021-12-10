package ru.mirea.prakt5;

public class Practice5 {
    // ex 6
    /*
    Дано натуральное число n>1. Проверьте, является ли оно простым.
    Программа должна вывести слово YES, если число простое и NO, если число составное.
     */
    private static void isPrime(int number) {
        isPrime(number, 2);
    }

    private static void isPrime(int number, int div) {
        if (number == 2) {
            System.out.println("YES");
            return;
        }
        if (number % div == 0) {
            System.out.println("NO");
            return;
        }
        if (div > Math.sqrt(number)) {
            System.out.println("YES");
            return;
        }
        isPrime(number, div + 1);
    }

    //ex10
    /*
    Дано число n, десятичная запись которого не содержит нулей.
    Получите число, записанное теми же цифрами, но в противоположном порядке.
     */

    private static int revers(int num, int rev){
        if(num==0)return rev;
        return revers(num/10, 10*rev + num%10);
    }

    //ex8
    /*
    Дано слово, состоящее только из строчных латинских букв.
    Проверьте, является ли это слово палиндромом. Выведите YES или NO.
     */
    private static void isPalindrome(String s) {
        if (s.length() == 1) {
            System.out.println("YES");
            return;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            System.out.println("NO");
            return;
        }
        if (s.length() == 2) {
            System.out.println("YES");
            return;
        }
        isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
//ex6
        System.out.println("Primes?");
        isPrime(2);
        isPrime(18756);
        isPrime(3571); // prime
//ex10
        System.out.println("\nReverse");
        System.out.println(revers(123,0));
        System.out.println(revers(1, 0));
        System.out.println(revers(9968123, 0));
//ex8
        System.out.println("\nPalindrome:");
        isPalindrome("hellolleh");
        isPalindrome("heloeh");
        isPalindrome("h");
    }
}