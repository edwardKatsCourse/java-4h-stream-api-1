package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AfterStreamAPI {

    public static void main(String[] args) {
        //1. Created 10 words
        //2. filtered by not null
        //3. filtered by greater > 3
        //4. filtered by all starting with 'm'
        //5. wrap into type Word
        //6. Sorted
        //7. made unique

        String w1 = "apple";
        String w2 = "juice";
        String w3 = "monkey";
        String w4 = "money";
        String w5 = "make-up";
        String w6 = "master";
        String w7 = "mad";
        String w8 = "sad";
        String w9 = null;
        String w10 = null;
        String w11 = "master";
        String w12 = "master";

        //                .map(Word::new)

        //source
        Stream.of(w1, w2, w3, w4, w5, w6, w7, w8, w9, w10, w11, w12)

                //pipe
                .filter(x -> x != null)
                .filter(x -> x.length() > 3)
                .filter(x -> x.startsWith("m"))
                .distinct()
                .map(x -> new Word(x))

                //collectors (terminal operations)
                .collect(Collectors.toSet())
                .forEach(x -> System.out.println(x));

    }
}
