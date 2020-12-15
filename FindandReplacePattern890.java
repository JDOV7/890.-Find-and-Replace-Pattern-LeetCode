package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class FindandReplacePattern890 {
//["abc","deq","mee","aqq","dkd","ccc"]
//"abb"
//["abcccccc","abc","aaac","bbb","aaaacd","aavc"]
//"avcd"
//["abcccccc","abc","aaac","bbb","aaaacd","aavc"]
//"avc"
//["abc","cba","xyx","yxx","yyx"]
//"abc"
//["badc","abab","dddd","dede","yyxx"]
//"baba"

    public void FindandReplacePattern890() {
        String[] words = {"abcccccc", "abc", "aaac", "bbb", "aaaacd", "aavc"};
        String pattern = "avc";
        List<String> lCorrectPattern = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            String aTemporal = words[i];
            boolean bControl = true;
            int iMinSize = Integer.min(aTemporal.length(), pattern.length());
            for (int j = 0; j < iMinSize - 1; j++) {
                if (j + 1 < iMinSize && pattern.charAt(j) != pattern.charAt(j + 1)
                        && aTemporal.charAt(j) != aTemporal.charAt(j + 1)
                        && pattern.indexOf(pattern.charAt(j + 1)) == aTemporal.indexOf(aTemporal.charAt(j + 1))) {
                    continue;
                } else if (j + 1 < iMinSize && pattern.charAt(j) == pattern.charAt(j + 1)
                        && aTemporal.charAt(j) == aTemporal.charAt(j + 1)
                        && pattern.indexOf(pattern.charAt(j + 1)) == aTemporal.indexOf(aTemporal.charAt(j + 1))) {
                    continue;
                } else {
                    System.out.println("salio " + aTemporal);
                    bControl = false;
                    break;
                }

            }
            if (bControl) {
                lCorrectPattern.add(aTemporal);
            }
        }
        System.out.println(lCorrectPattern.size());
        for (int i = 0; i < lCorrectPattern.size(); i++) {
            System.out.println(lCorrectPattern.get(i));
        }
    }
}
