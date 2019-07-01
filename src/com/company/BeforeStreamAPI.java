package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class BeforeStreamAPI {

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

        List<String> words = new ArrayList<>();
        words.add(w1);
        words.add(w2);
        words.add(w3);
        words.add(w4);
        words.add(w5);
        words.add(w6);
        words.add(w7);
        words.add(w8);
        words.add(w9);
        words.add(w10);

        //get all words > 3 characters

        //!!!!!THIS FOR MUST BE FIRST!!!!!!
        List<String> greaterThanThree = new ArrayList<>();
        for (String word : words) {
            if (word == null) {
                continue;
            }

            if (word.length() > 3) {
                greaterThanThree.add(word);
            }
        }


        //all words starting with letter 'm'
        List<String> mWords = new ArrayList<>();
        for (String word : greaterThanThree) {
            if (word.startsWith("m")) {
                mWords.add(word);
            }
        }

        //Wrap into normal type
        List<Word> wrapToNormalType = new ArrayList<>();
        for (String word : mWords) {
            wrapToNormalType.add(new Word(word));
        }

//        Collections.sort(
//                wrapToNormalType,
//                Comparator.comparing(Word::getWord));

        Set<Word> unique = new TreeSet<>(Comparator.comparing(Word::getWord));
        unique.addAll(wrapToNormalType);

        System.out.println(unique);

    }
}


class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Word [" + word + "]";
    }

    public void setWord(String word) {
        this.word = word;
    }
}
