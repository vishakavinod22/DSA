package Hashmaps.Easy;

import java.util.HashMap;

/**
 * 383. Ransom Note
 *
 * Link: https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote and magazine consist of lowercase English letters.
 */

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        //separate magazine into hashmap
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (char m : magazine.toCharArray()) {
            int val = magazineMap.getOrDefault(m, 0);
            magazineMap.put(m, val + 1);
        }

        //separate ransomNote into hashmap
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        for (char r : ransomNote.toCharArray()) {
            int val = ransomNoteMap.getOrDefault(r, 0);
            ransomNoteMap.put(r, val + 1);
        }

        for (char r : ransomNote.toCharArray()) {
            int r_val = ransomNoteMap.get(r);
            int m_val = magazineMap.getOrDefault(r, 0);

            if(m_val == 0 || r_val > m_val){
                return false;
            }
        }
        return true;
    }
}
