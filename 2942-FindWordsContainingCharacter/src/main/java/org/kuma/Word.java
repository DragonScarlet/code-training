package org.kuma;

import java.util.ArrayList;
import java.util.List;

public class Word {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        var result = new ArrayList<Integer>();
        for (int i = 0; i <= words.length - 1; i++) {
            if(words[i].contains(String.valueOf(x))){
                result.add(i);
            }
        }
        return result;
    }
}
