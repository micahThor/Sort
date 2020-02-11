package com.micahThor.sort;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.Assert.*;

@SpringBootTest
class SortApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void insertionSort_testHappyPath() {

		int[] actual = new int[]{8, 4, 23, 42, 16, 15};
		Sort.insertionSort(actual);

		int[] expected = new int[]{4, 8, 15, 16, 23, 42};

		assertArrayEquals(expected, actual);
	}

	@Test
	public void insertionSort_testReverse() {

		int[] actual = new int[]{20, 18, 12, 8, 5, -2};
		Sort.insertionSort(actual);

		int[] expected = new int[]{-2, 5, 8, 12, 18, 20};

		assertArrayEquals(expected, actual);
	}

	@Test
	public void insertionSort_testFewUniques() {

		int[] actual = new int[]{5, 12, 7, 5, 5, 7};
		Sort.insertionSort(actual);

		int[] expected = new int[]{5, 5, 5, 7, 7, 12};

		assertArrayEquals(expected, actual);
	}

	@Test
	public void insertionSort_testNearlySorted() {

		int[] actual = new int[]{2, 3, 5, 7, 13, 11};
		Sort.insertionSort(actual);

		int[] expected = new int[]{2, 3, 5, 7, 11, 13};

		assertArrayEquals(expected, actual);
	}
}
