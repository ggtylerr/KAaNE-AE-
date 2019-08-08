package com.ggtylerr.kaane_ae.util;

import java.util.ArrayList;
import java.util.List;

/**
 * ggtylerr/util/string
 *
 * Made for KAaNE [JE] and KAaNE [AE]
 *
 * Can be used in other projects.
 */

public class string {
    // isVowel
    // -----------
    // if any character in a string is a vowel, it'll return true
    // -----------
    // example:
    // "Hello There!" - true
    // "HELLO THERE!" - true
    // "N0 V0W3L5!" - false
    // "y?" - false
    public static boolean isVowel(String s) {
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        }
        return false;
    }
    // isDigit
    // -----------
    // if the string is a digit, it'll return true
    // -----------
    // example:
    // "a" - false
    // "123" - true
    // "123,456" - false
    // "123456" - true
    public static boolean isDigit(String s) {
        try {double b = Double.parseDouble(s);}
        catch(NumberFormatException ex){return false;}
        return true;
    }
    // firstLetter
    // -----------
    // returns the first letter (non digit). if there is none, it'll return blank.
    // -----------
    // example:
    // "Hello World!" - "H"
    // "hello world!" - "h"
    // "123a48ae8439e0t8" - "a"
    // "12345" - ""
    public static String firstLetter(String s) {
        String[] sArr = s.split("");
        for (int i = 0; i < sArr.length; i++)
            if (!isDigit(sArr[i])) return sArr[i];
        return "";
    }
    // firstChar
    // -----------
    // returns the first character.
    // -----------
    // example:
    // "Hello World!" - 'H'
    // "hello world!" - 'h'
    // "123a48ae8439e0t8" - '1'
    // "!!!!" - '!'
    public static char firstChar(String s) {
        return s.charAt(0);
    }
    // firstInt
    // -----------
    // returns the first int. if there is none, it'll return with 0.
    // -----------
    // example:
    // "12345" - 1
    // "999959999" - 9
    // "a3i0u" - 3
    // "Hello World!" - 0
    public static int firstInt(String s) {
        String[] sArr = s.split("");
        for (int i = 0; i<sArr.length; i++) if (isDigit(sArr[i])) return Integer.parseInt(sArr[i]);
        return 0;
    }
    // lastLetter
    // -----------
    // returns the last letter (non digit). if there is none, it'll return blank.
    // -----------
    // example:
    // "Hello World!" - "!"
    // "hello world" - "d"
    // "hello WORLD" - "D"
    // "123a48ae8439e0t8" - "t"
    // "12345" - ""
    public static String lastLetter(String s) {
        String[] sArr = s.split("");
        for (int i = sArr.length; i>=0;i++)
            if (!isDigit(sArr[i])) return sArr[sArr.length-1];
        return "";
    }
    // lastChar
    // -----------
    // returns the last character.
    // example:
    // "Hello World!" - '!'
    // "hello world" - 'd'
    // "123a48ae8439e0t8" - '8'
    // "!!!!" - '!'
    public static char lastChar(String s) {
        return s.charAt(s.length()-1);
    }
    // lastInt
    // -----------
    // returns the last int. if there is none, it'll return with 0.
    // -----------
    // "12345" - 5
    // "999959999" - 9
    // "a3i0u" - 0
    // "Hello World!" - 0
    public static int lastInt(String s) {
        String[] sArr = s.split("");
        for (int i = sArr.length-1; i<sArr.length && i>=0; i--) if (isDigit(sArr[i])) return Integer.parseInt(sArr[i]);
        return 0;
    }
    // totalLetters
    // -----------
    // returns the total letters (non digits).
    // -----------
    // example:
    // "Hello World!" - 12
    // "HelloWorld" - 10
    // "123E4" - 1
    // "12345690" - 0
    public static int totalLetters(String s) {
        int output = 0;
        String[] sArr = s.split("");
        for(String str : sArr) if (!isDigit(str)) output++;
        return output;
    }
    // totalDigits
    // -----------
    // returns the total digits
    // -----------
    // example:
    // "123456789" - 9
    // "3058e10" - 6
    // "Hell0 there!" - 1
    // "Hello there!" - 0
    public static int totalDigits(String s) {
        int output = 0;
        String[] sArr = s.split("");
        for(String str : sArr) if (isDigit(str)) output++;
        return output;
    }
    // moveOnceLeft
    // -----------
    // returns a String[] that has all items moved to the left
    // -----------
    // example:
    // {"1","2","3"} - {"2","3"}
    // {"EEE"} - {""}
    public static String[] moveOnceLeft(String[] s) {
        String[] tempArr = new String[s.length];
        for (int i = 1; i < s.length; i++) {
            tempArr[i-1] = s[i];
        }
        return tempArr;
    }
    // removeLast(String[])
    // -----------
    // returns a String[] that has all items except for the last item
    // -----------
    // example:
    // {"1","2","3"} - {"1","2"}
    // {"EEE"} - {"EEE"}
    public static String[] removeLast(String[] s) {
        try {
            String[] tempArr = new String[s.length - 1];
            for (int i = 0; i < s.length - 1; i++) {
                tempArr[i] = s[i];
            }
            return tempArr;
        } catch (Exception ex) {
            return s;
        }
    }
    // removeLast(int,String[])
    // -----------
    // returns a String[] that has all items except for the last {int} items
    // -----------
    // example:
    // 1,{"1","2","3"} - {"1","2"}
    // 2,{"1","2","3"} - {"1"}
    // 3,{"1","2","3"} - {"1","2","3"}
    // 0,{"EEE"} - {"EEE"}
    // 1,{"EEE"} - {"EEE"}
    public static String[] removeLast(int amount, String[] s) {
        try {
            String[] tempArr = new String[s.length - amount];
            for (int i = 0; i < s.length - amount; i++) {
                tempArr[i] = s[i];
            }
            return tempArr;
        } catch (Exception ex) {
            return s;
        }
    }
    // count
    // -----------
    // returns the number of times a string is in an array
    // -----------
    // example:
    // {"1","2","3"},"3" - 1
    // {"Test","test","Test"},"Test" - 2
    // {"WOAH!","woah","Woah"},"WOAH" - 0
    public static int count(String[] arr, String s) {
        int out = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(s)) out++;
        return out;
    }
    // exclude
    // -----------
    // returns an array that doesn't have a specific string
    // -----------
    // example:
    // {"1","2","3"},"3" - {"1","2"}
    // {"Hello","World!",""},"" - {"Hello","World!"}
    // {"Hello","World!"},"HELLO" - {"Hello","World!"}
    public static String[] exclude(String[] arr, String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            if (!arr[i].equals(s)) list.add(arr[i]);
        return list.toArray(new String[0]);
    }
}
