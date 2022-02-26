package com.skypro;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("first", "middle", "middle", "last"));

        printEvenNumbers(nums);
        printSortedNumbers(nums);
        printUniqueWords(words);
        printDuplicatesNumber(words);

    }

    private static void printDuplicatesNumber(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print("Дубликат: ");
        System.out.print(words.size() - uniqueWords.size());

    }

    private static void printUniqueWords(List<String> words) {
        System.out.print("Уникальные слова, дубли: ");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.print(uniqueWords);
        System.out.println(" ");
    }

    private static void printSortedNumbers(List<Integer> nums) {
        System.out.print("Четные числа: ");
        Set<Integer> uniqueSortedNums = new TreeSet<>(nums);

        for (int num : uniqueSortedNums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }

        }
        System.out.println(" ");
    }

    private static void printEvenNumbers(List<Integer> nums) {
        System.out.print("Нечетные числа: ");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");

    }
}


