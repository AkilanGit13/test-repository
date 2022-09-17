package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Greeting{
	Integer operation(Integer a, Integer b) ;
}


public class LambdaTestGreeting {
	
	public static <T, R> List<R> map(T[] s, Function<T, R> f) {
		List<R> list = new ArrayList<>() ;
		
		for(T str : s) {
			list.add(f.apply(str)) ;
		}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3) ;
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4)) ;
		List<List<Integer>> list = new ArrayList<>() ;
		List<Integer> temp = new ArrayList<>() ;
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				temp.add(list1.get(i)) ;
				temp.add(list2.get(j)) ;
				list.add(temp) ;
				temp = new ArrayList<>() ;
			}
		}
		System.out.println(list);
		
	}

	public static List<Integer> fun(int[] a){
		List<Integer> list = new ArrayList<>() ;
		
		for(int i : a) {
			list.add(i) ;
		}
		return list ;
	}
}
