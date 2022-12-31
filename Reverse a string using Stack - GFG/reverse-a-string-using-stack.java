//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        Stack<Character> s = new Stack<>();
        String str = "";
        for(int i = 0;i<S.length();i++)
        s.push(S.charAt(i));
        int i = 0;
        while(!s.empty()){
            str+= s.pop();
        }
        return str;
    }

}