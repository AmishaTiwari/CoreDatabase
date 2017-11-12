/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahandling;

/**
 *
 * @author Vishal Kumar
 */
public class KMP {
    protected int KMPSearch(String pat, String txt)
    {
        if(txt.equals("")) return 0;
        int M = pat.length();
        int N = txt.length();
        int  cnt = 0;
        int lps[] = new int[M];
        int j = 0; 
        computeLPSArray(pat,M,lps);
 
        int i = 0;  // index for txt[]
        while (i < N)
        {
            if (pat.charAt(j) == txt.charAt(i))
            {
                j++;
                i++;
            }
            if (j == M)
            {
                cnt++;
                j = lps[j-1];
            }
 
            else if (i < N && pat.charAt(j) != txt.charAt(i))
            {
                if (j != 0)
                    j = lps[j-1];
                else
                    i = i+1;
            }
        }
        return cnt;
    }
 
    protected void computeLPSArray(String pat, int M, int lps[]){
        int len = 0;
        int i = 1;
        lps[0] = 0;  
 
        while (i < M)
        {
            if (pat.charAt(i) == pat.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else  
            {
                if (len != 0)
                {
                    len = lps[len-1];
                }
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
