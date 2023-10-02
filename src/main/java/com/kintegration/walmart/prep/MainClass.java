package com.kintegration.walmart.prep;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
  
class MainClass {
  
    // Driver code
    public static void main(String[] args)
    {
    	//List list = Arrays.asList(4, 2, 11);
    	List<Integer> l1 = Arrays.asList(Integer.valueOf(4),Integer.valueOf(2),Integer.valueOf(11),Integer.valueOf(7));
    	List<Integer> l2 = Arrays.asList(Integer.valueOf(17),Integer.valueOf(13),Integer.valueOf(3),Integer.valueOf(1), Integer.valueOf(23));
    	
    	LinkedList<Integer> ld1 = new LinkedList<>(l1);
    	LinkedList<Integer> ld2 = new LinkedList<>(l2);
    	System.out.println(ld1);
    	System.out.println(ld2);
    	
    	Stream<Integer> s1 = ld1.stream();
    	Stream<Integer> s2 = ld2.stream();
    	Stream<Integer> s3 = Stream.concat(s1, s2);
    	List<Integer> ls = s3.sorted().collect(Collectors.toList());
    	
    	LinkedList<Integer> ldr = new LinkedList<>(ls);
    	System.out.println(ldr);
        // Creating two Streams
        LongStream Stream1 = LongStream.of(1520, 1620);
        LongStream Stream2 = LongStream.of(1720, 1820);
  
        // concatenating both the Streams and
        // displaying the result
        LongStream.concat(Stream1, Stream2)
            .forEach(element -> System.out.println(element));
        
        new Random().ints().forEach(s->System.out.println(s));
    }
}