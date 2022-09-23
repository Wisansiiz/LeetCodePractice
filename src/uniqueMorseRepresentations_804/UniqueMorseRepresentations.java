package uniqueMorseRepresentations_804;

import java.util.ArrayList;
import java.util.List;

public class UniqueMorseRepresentations {
    public static void main(String[] args) {
        String [] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new Solution().uniqueMorseRepresentations(words));
    }
}
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> list = new ArrayList<>();
        for (String w : words){
            StringBuilder temp = new StringBuilder();
            for (char c : w.toCharArray()){
                temp.append(morse[c - 'a']);
            }
            if (!list.contains(temp.toString()))
                list.add(temp.toString());
        }
        return list.size();
    }
}