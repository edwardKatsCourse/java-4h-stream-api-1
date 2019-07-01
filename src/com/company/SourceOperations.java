package com.company;

import java.util.*;
import java.util.stream.*;

public class SourceOperations {

    public static void main(String[] args) {
        //Stream Sources

        //1. Collections
        //2. Arrays
        //3. From nothing

        new ArrayList<>().stream();
        new HashSet<>().stream();
        new HashMap<>().entrySet().stream();


        String[] names = {"JAMES", "PETER", "SARAH"};
        Arrays.stream(names);
//                .map()
//                .filter()
//                .collect(Collectors.toList());

        //Create Stream of nothing
        Stream.of("one", "two");
        Stream.builder()
                .add("one")
                .add("two")
                .build();
//                .filter()


        int i1 = 1; // Integer
        int i2 = 1;
        int i3 = 1;
        int i4 = 1;
        int i5 = 1;

        IntStream.of(i1, i2, i3, i4, i5).boxed(); //boxed: IntStream -> Stream<Integer>
//        new Integer(15);
//
//        double d = 11.13;
//        new Double(d);
//        LongStream;
//        DoubleStream;


//        "abc".chars().boxed();
    }
}
