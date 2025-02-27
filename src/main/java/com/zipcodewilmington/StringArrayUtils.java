package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            } else {
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseWords = new String[array.length];
        int count = 0;
        for (int i = 1; i <= array.length; i++) {
            reverseWords[count] = array[array.length - i];
            count++;
        }
        return reverseWords;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                return true;
            } else {
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String words = Arrays.toString(array).toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if (!words.contains(String.valueOf(alphabet.charAt(i)))) { // if the phrase does not the value of abc
                return false;
            } else {
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            } else {
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] value = new String[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove) {
                value[count] = array[i];
                count++;
            } else if (array[i] == valueToRemove) {
            }
        }
        return value;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String finalOutput = "";
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                finalOutput += array[i] + " ";
            }
        }
        finalOutput += array[array.length - 1];
        String[] array1 = finalOutput.split(" ");
        return array1;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String finalOutput = "";
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                finalOutput += array[i - 1];
            } else {
                finalOutput += array[i - 1] + " ";
            }
        }
        finalOutput += array[array.length - 1];
        String[] array1 = finalOutput.split(" ");
        return array1;
    }
}

//    String[] na;
//    String addDuplicate = array[0];
//        for (int i = 1; i < array.length; i++) {
//        if (array[i] == array[i - 1]) {
//        addDuplicate += array[i];
//        } else {
//        addDuplicate += " " + array[i];
//        }
//        }
//        na = addDuplicate.split(" ");
//        return na;
//        }
//        }
