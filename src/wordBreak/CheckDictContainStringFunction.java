package wordBreak;

import java.util.List;

public class CheckDictContainStringFunction {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] f = new boolean[s.length() + 1];
        
        // Set<String> set = new HashSet<>();
        // set.addAll(wordDict);
        
        f[0] = true;
        
        for(int i=1; i <= s.length(); i++){
            for(int j = i - 1; j >= 0; j--){
                System.out.println(i + s.substring(j, i));
                if(f[j] && wordDict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        
        return f[s.length()];
    }
}
