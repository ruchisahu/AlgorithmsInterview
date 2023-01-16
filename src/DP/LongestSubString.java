package DP;

public class LongestSubString {
	public static String longestCommon(String s, String t) {
	    int[][] match = new int[s.length() + 1][t.length() + 1];
	    int start = 0, longest = 0;
	    for (int i = 1; i <= s.length(); i++) {
	      for (int j = 1; j <= t.length(); j++) {
	        if (s.charAt(i - 1) == t.charAt(j - 1)) {
	          match[i][j] = match[i - 1][j - 1] + 1;
	          if (match[i][j] > longest) {
	            longest = match[i][j];
	            start = i - longest;
	          }
	        } else {
	          match[i][j] = 0;
	        }
	      }
	    }
	    return s.substring(start, start + longest);
	  }
	
	 public static String longestCommonSubsequence(String text1, String text2) {
		   int n=text1.length();
		   int m=text2.length();
		   int start = 0, longest = 0;
		   int[][] dp=new int[n+1][m+1];
		   for(int i=1;i<=n;i++ ) {
			   for(int j=1;j<=m;j++) {
				   if(text1.charAt(i-1) ==text2.charAt(j-1)) {
					   dp[i][j]=1 +dp[i-1][j-1];
				   }
				   else {
					   dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				   }
				  
				   
			   }
		   }
		  
	        int index = dp[n][m];
	        int temp = index;
	  
	        char[] lcs = new char[index+1]; 
	        int i = n;
	        int j = m;
	        StringBuilder sb=new StringBuilder();
	        while (i > 0 && j > 0)
	        {
	            
	            if (text1.charAt(i-1) == text2.charAt(j-1))
	            {
	                lcs[index-1] = text1.charAt(i-1);
	                sb.append(text1.charAt(i-1));
	                i--;
	                j--;
	                index--;    
	                
	            }
	  
	            else if (dp[i-1][j] > dp[i][j-1])
	                i--;
	            else
	                j--;
	        }          
	        
		return sb.reverse().toString();
	        
	    }

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace" ;
		//System.out.println(longestCommon(text1,text2));
		System.out.println(longestCommonSubsequence(text1,text2));

	}

}
