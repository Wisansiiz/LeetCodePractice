package numUniqueEmails_929;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com",
                "test.email.leet+alex@code.com"};
        System.out.println(new Solution().numUniqueEmails(emails));
    }
}
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails){
            String[] strings = s.split("@");
            String s1 = strings[0], s2 = strings[1];
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s1.length(); i++){
                if (s1.charAt(i)!='.'&&s1.charAt(i)!='+')
                    stringBuilder.append(s1.charAt(i));
                if (s1.charAt(i)=='+')
                    break;
            }
            set.add(stringBuilder +"@"+ s2);
        }
        return set.size();
    }
}