package org.example;

public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        boolean isPangram = isPangram(input);
        System.out.println("Is it a pangram? " + isPangram);
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                if (!alphabet[ch - 'a']) {
                    alphabet[ch - 'a'] = true;
                    count++;
                }
            }
        }

        return count == 26;
    }
}
