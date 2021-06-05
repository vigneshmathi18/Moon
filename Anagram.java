package com.company;
import java.util.*;

public class PracticeDemo {
    static boolean isAnangram(char s1[],char s2[]){
        int l1=s1.length;
        int l2=s2.length;
        if (l1!=l2){
            return false;

        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<l1;i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }
            return true;


//editing to creat a new branch for practice purpose
    }
    public static void main(String args[]){
        char str1[]="silent".toCharArray();
        char str2[]="listen".toCharArray();
        if(isAnangram(str1,str2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a anagram");
        }

    }


}
