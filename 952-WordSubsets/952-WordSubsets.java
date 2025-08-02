// Last updated: 02/08/2025, 18:55:18
import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();

        // Step 1: Compute the maximum frequency requirements for words2
        int[] maxFreq = new int[26]; // Stores max frequency for each letter from all words2
        for (String word : words2) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
                maxFreq[c - 'a'] = Math.max(maxFreq[c - 'a'], freq[c - 'a']);
            }
        }

        // Step 2: Check each word in words1
        for (String word : words1) {
            int[] freq1 = new int[26];
            for (char c : word.toCharArray()) {
                freq1[c - 'a']++;
            }

            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq1[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                result.add(word);
            }
        }

        return result;
    }
}