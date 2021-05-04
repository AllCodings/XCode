/*
package Rough;

public class WordAllPermutations
{
    public static void main(String[] args)
    {
        String str = "12345";
        int n = str.length();
        WordAllPermutations permutation = new WordAllPermutations();
        permutation.permute(str, 1, n-1);
    }

    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
*/





package com.xcode.Rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sanjay.bind1 on 10/8/2017.
 */

public class WordAllPermutations
{
    String[] words = {"Bird","Blue","Joke","Zinc","Quit","Lazy","Wire","Game","Home","Stop","Play","Rain","Leaf","Star","Post"};
    String[][] permutedWords = new String[15][4];
    int index = 0;
    List<String> p_word = new ArrayList<>();

    public static void main(String[] args)
    {
        WordAllPermutations permutation = new WordAllPermutations();

        for (int i = 0; i <permutation.words.length ; i++) {
            permutation.p_word.clear();
            permutation.permute(permutation.words[i],1,3);
            List<String> temp = permutation.p_word;
            temp.remove(0);
            Collections.shuffle(temp);
            permutation.permutedWords[i][0] = permutation.words[i];
            permutation.permutedWords[i][1] = temp.get(0);
            permutation.permutedWords[i][2] = temp.get(1);
            permutation.permutedWords[i][3] = temp.get(2);
            System.out.println(Arrays.asList(permutation.permutedWords[i]));
        }
    }

    public void permute(String word, int l, int r)
    {
        if (l == r) {
            p_word.add(word);
        }

        else
        {
            for (int i = l; i <= r; i++)
            {
                word = swap(word,l,i);
                permute(word, l+1, r);
                word = swap(word,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
