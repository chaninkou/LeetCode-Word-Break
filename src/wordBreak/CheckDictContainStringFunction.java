package wordBreak;

import java.util.List;

public class CheckDictContainStringFunction {
    public boolean wordBreak(String s, List<String> wordDict) {
    	// Dynamic programming with boolean
    	boolean[] dp = new boolean[s.length() + 1];
        // Set<String> set = new HashSet<>();
        // set.addAll(wordDict);
        
    	// Since we start from 0 to a word it match, 0 index have to be true by default
    	dp[0] = true;
    	
    	for(int sIndex = 1; sIndex <= s.length(); sIndex++){
    		// Check from the previous element and previous previous element and so on
    		for(int dIndex = sIndex - 1; dIndex >= 0; dIndex--){
    			// f[j] have to be true in order to check if the next word is true also
                // example leebcode, f[4] is leeb, which is false and contains 'code' return false
                // example leetcode, f[4] is leet, which is true and contains 'code' return true
    			if(dp[dIndex] && wordDict.contains(s.substring(dIndex, sIndex))){
    				dp[sIndex] = true;
    				break;
    			}
    		}
    	}
    	
    	// If this is true, that means we found words from dictionary in the stringW
    	return dp[s.length()];
    }
}
