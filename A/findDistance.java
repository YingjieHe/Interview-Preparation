
public class findDistance {

	public int Distance(String[] words, String word1, String word2) {
	
	        if(words == null || words.length <= 0) return -1;
	        int index1 = -1;
	        int index2 = -1;
	        int res = -1;
	        for(int i = 0; i < words.length; ++i) {
	
	            if(words[i] == word1) index1 = i;
	            if(words[i] == word2) index2 = i;
	            if((words[i] == word1 || words[i] == word2) && index1 != -1 && index2 != -1) {
	                res = Math.max(Math.abs(index1 - index2), res);
	            }
	        }
	        return res;
	    }
	}
