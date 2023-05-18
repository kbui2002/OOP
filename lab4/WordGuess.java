package lab4;

import java.util.Scanner;

/**
 * 1.8 word guess
 */
public class WordGuess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Exercises 1.8
        final String[] words = { "testing", "hello", "world", "java", "boolean", "string", "integer" };
        String word = words[rand(words.length - 1)];
        boolean[] checkWord = new boolean[word.length()];
        runGame(sc, word, checkWord);
    }

    private static int rand(int i) {
        return 0;
    }

    public static void checkWord(String word, boolean[] checkWord, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                checkWord[i] = true;
            }
        }
    }

    public static String getWordWithMatches(String word, boolean[] checkWord) {
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (checkWord[i]) {
                ch[i] = word.charAt(i);
            } else {
                ch[i] = '_';
            }
        }
        String str = String.valueOf(ch);
        return str;
    }

    public static void runGame(Scanner sc, String word, boolean[] checkWord) {
        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = sc.next();
            trials++;

            if (trialWord.length() < 1) {
                continue;
            }

            if (trialWord.length() == 1) {
                checkWord(word, checkWord, trialWord.charAt(0));
                trialWord = getWordWithMatches(word, checkWord);
                if (trialWord.equals(word) == false) {
                    System.out.printf("Trail %d: %2$s\n", trials, trialWord);
                }
            }

            if (trialWord.equals(word)) {
                System.out.printf("Congratulation!\n", trials);
                break;
            }
        }
        System.out.printf("You got in %d trials\n", trials);
    }
}