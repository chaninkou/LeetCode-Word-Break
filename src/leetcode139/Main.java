package leetcode139;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String s = "leetcode";
		
		List<String> wordDict = new ArrayList<>();
		
		wordDict.add("leet");
		wordDict.add("code");
		
		System.out.println("String: " + s);
		
		System.out.println("Dictionary: " + wordDict);
		
		CheckDictContainStringFunction solution = new CheckDictContainStringFunction();
		
		System.out.println("Solution: " + solution.wordBreak(s, wordDict));
		
	}
}
