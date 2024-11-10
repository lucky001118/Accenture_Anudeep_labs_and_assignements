package com.nov_08;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class Question01 {
    /*
    Question1: Write a Java method to remove duplicate characters from a string while maintaining the order of
    characters. For example, given "programming", the result should be "progamin".
Hint: Use a Set to track duplicates or check character positions.
Count Vowels and Consonants

Question2: Write a Java method to count the number of vowels and consonants in a given string.
Hint: Use a loop to iterate through the string and a conditional check for vowel characters.
Character Frequency Counter

Question3: Write a Java method that counts the frequency of each character in a given string and displays it.
 For example, given "apple," it should print a:1, p:2, l:1, e:1.
Hint: Using a Map<Character, Integer> can help with counting occurrences.
Check if a String is a Rotation of Another String

Question4: Write a Java method to check if one string is a rotation of another string. For example,
"abcde" is a rotation of "cdeab".
Hint: Concatenating one string with itself and checking for the other string within it might be helpful.
     */

    private void removeDublicate(String inputString){
        char [] string2 = inputString.toCharArray();
        /*
        HashSet, LinkedHashSet and TreeSet are the implementations of Set interface which
        does not allow duplicate elements. and linkedHashSet also maintains insertion order
         */
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        int count;

        for (int i=0;i<inputString.toCharArray().length;i++){
            linkedHashSet.add(string2[i]);

        }

        System.out.println(linkedHashSet);
    }

//    Question 2
    private int[] CountVowelAndConsonant(String inputeString){
        char [] stringArr=inputeString.toCharArray();
        int countVowel=0;
        int countConsonant=0;

        for(int i=0;i<stringArr.length-1;i++){
            if (stringArr[i]=='a'|| stringArr[i]=='e'|| stringArr[i]=='i' || stringArr[i]=='o'|| stringArr[i]=='u'){
                countVowel++;
            }else {
                countConsonant++;
            }
        }
        int [] countBouth = {countVowel,countConsonant};
        return countBouth;
    }

    //question 3
    private void FrequencyOfEachCharacter(String inputString){
        Map<Character,Integer> map = new HashMap<>();
        char [] stringArr=inputString.toCharArray();

        //it stores the all values with duplicate
        for (int i=0;i<inputString.toCharArray().length;i++){
            map.put(stringArr[i],i);
        }

        //it stores the none duplicte values
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        for (int i=0;i<inputString.toCharArray().length;i++){
            linkedHashSet.add(stringArr[i]);
        }

        Map<Character,Integer> frquency = new HashMap<>();

        int count=0;
        for (int i=0;i<inputString.toCharArray().length;i++){
            if (linkedHashSet.toArray()[i].equals(stringArr[i])){
//                frquency.put(stringArr[i])
            }
        }

    }

//    Question 4
    private boolean isStringIsRotational(String str1,String str2){
        return true;
    }

    public static void main(String[] args) {
        Question01 que = new Question01();
        que.removeDublicate("programming");

        int [] countBouth = que.CountVowelAndConsonant("programming");
        System.out.println("Vowels in string: "+countBouth[0]+" consonants in string: "+countBouth[1]);
    }
}
