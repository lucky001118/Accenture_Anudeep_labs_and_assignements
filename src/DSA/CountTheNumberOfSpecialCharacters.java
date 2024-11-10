package DSA;


import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfSpecialCharacters {
    /*
    ou are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word,
    and every lowercase occurrence of c appears before the first uppercase occurrence of c.
Return the number of special letters in word.

Example 1:
Input: word = "aaAbcBC"
Output: 3
Explanation:
The special characters are 'a', 'b', and 'c'.

Example 2:
Input: word = "abc"
Output: 0
Explanation:
There are no special characters in word.

Example 3:
Input: word = "AbBCab"
Output: 0
Explanation:
There are no special characters in word.
     */
    public int numberOfSpecialChars(String word) {
        int sizeOfWord=word.length();
        int spacialCharacterCount=0;
        Map<Character,Integer> uppercasePosition = new HashMap<>();
        Map<Character,Integer> lastLowercasePosition = new HashMap<>();
        for (int i=0;i<sizeOfWord;i++){
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)){
                lastLowercasePosition.put(ch,i);
            } else if (Character.isUpperCase(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if (!uppercasePosition.containsKey(lowerCh)){
                    uppercasePosition.put(lowerCh,i);
                }
            }
        }

        for (char character: lastLowercasePosition.keySet()){
            if (uppercasePosition.containsKey(character)){
                if (lastLowercasePosition.get(character)<uppercasePosition.get(character)){
                    spacialCharacterCount++;
                }
            }
        }
        return spacialCharacterCount;
    }

    public static void main(String[] args) {
        CountTheNumberOfSpecialCharacters ctnosc = new CountTheNumberOfSpecialCharacters();
//        int a = 'a';
//        System.out.println(a);
//        HashMap<String, String> capitalCities = new HashMap<String, String>();
//        capitalCities.put("England", "London");
//        capitalCities.put("Germany", "Berlin");
//        capitalCities.put("Norway", "Oslo");
//        capitalCities.put("USA", "Washington DC");
//
//        System.out.println(capitalCities.keySet());
//        System.out.println(capitalCities.containsKey(capitalCities.keySet()));
        System.out.println(ctnosc.numberOfSpecialChars("aaAbcBC"));
    }
}
