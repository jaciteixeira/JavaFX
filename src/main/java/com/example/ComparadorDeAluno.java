package com.example;

import java.util.Comparator;

public class ComparadorDeAluno implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // // se o1 < o2 return -1
        // // se == return 0
        // // se o1 > o2 return 1
    
        // int comparacao = o1.compareToIgnoreCase(o2);
        // if (comparacao < 0) return -1;
        // if (comparacao > 0) return 1;
        // return 0;

        return o1.compareToIgnoreCase(o2);
    }
    
}
