package com.ggtylerr.kaane_ae.util;

public class string {
    public static boolean isVowel(String s) {
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        }
        return false;
    }
    public static boolean isDigit(String s) {
        try {double b = Double.parseDouble(s);}
        catch(NumberFormatException ex){return false;}
        return true;
    }
    public static String firstLetter(String s) {
        String[] sArr = s.split("");
        return sArr[sArr.length-1];
    }
    public static char firstChar(String s) {
        return s.charAt(0);
    }
    public static int firstInt(String s) {
        String[] sArr = s.split("");
        for (int i = 0; i<sArr.length; i++) if (isDigit(sArr[i])) return Integer.parseInt(sArr[i]);
        return 0;
    }
    public static String lastLetter(String s) {
        String[] sArr = s.split("");
        return sArr[sArr.length-1];
    }
    public static char lastChar(String s) {
        return s.charAt(s.length()-1);
    }
    public static int lastInt(String s) {
        String[] sArr = s.split("");
        for (int i = sArr.length-1; i<sArr.length && i>=0; i--) if (isDigit(sArr[i])) return Integer.parseInt(sArr[i]);
        return 0;
    }
    public static int totalLetters(String s) {
        int output = 0;
        String[] sArr = s.split("");
        for(String str : sArr) if (!isDigit(str)) output++;
        return output;
    }
    public static int totalDigits(String s) {
        int output = 0;
        String[] sArr = s.split("");
        for(String str : sArr) if (isDigit(str)) output++;
        return output;
    }
    public static String[] moveOnceLeft(String[] s) {
        String[] tempArr = new String[s.length];
        for (int i = 1; i < s.length; i++) {
            tempArr[i-1] = s[i];
        }
        return tempArr;
    }
    public static String[] removeLast(String[] s) {
        String[] tempArr = new String[s.length-1];
        for (int i = 0; i < s.length-1; i++) {
            tempArr[i] = s[i];
        }
        return tempArr;
    }
    public static String[] removeLast(int amount, String[] s) {
        String[] tempArr = new String[s.length-amount];
        for (int i = 0; i < s.length-amount; i++) {
            tempArr[i] = s[i];
        }
        return tempArr;
    }
}
