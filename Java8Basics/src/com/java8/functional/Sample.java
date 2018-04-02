package com.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Predicate<Integer> isGreaterThan3 = e -> e > 3;
		Predicate<Integer> isEven = e -> e % 2 == 0;

		Function<Integer, Predicate<Integer>> isGreaterThan = number -> e -> e > number;
		System.out.println(list.stream().filter(isGreaterThan.apply(3)).filter(isEven).map(e -> e * 2).findFirst().get());
	}

}
