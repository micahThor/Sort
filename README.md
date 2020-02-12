# Challenge 26 - Insertion Sort (10 FEB 2020)
<!-- Short summary or background information -->
Insertion sort involves iterating over a collection and manipulating element's indexes based off their adjacent equality.

## Challenge Description
<!-- Description of the challenge -->
Implement insertion sort in Java and provide unit tests to prove quality.  Write a blog that verifies the insertion sort algorithm.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Insertion sort takes in an array of integers and iterates over that array.  Starting at index 1, we set a temp integer value equal to the current index element.  

Then we keep a second integer value ("j") that lags the for loop indexing variable ("i").

While the lagging index in the array is less than or equal to 0 and the temp variable is less than the lagging value,  
swap the value of the adjacent values and decrease the lagging index by one.

Big O time: O(n^2)  

Big O space: O(1) 

## Solution
<!-- Embedded whiteboard image -->
[Blog](https://github.com/micahThor/Sort/blob/master/assets/BLOG.md) 

[Code](https://github.com/micahThor/Sort/blob/master/src/main/java/com/micahThor/sort/Sort.java)  

![](https://github.com/micahThor/Sort/blob/master/assets/inserSort.jpg)

---

# Challenge 27 - Merge Sort (11 FEB 2020)
<!-- Short summary or background information -->
Merge sort involves halving an array into two seperate arrays until each element is contained within it's own array. Then the arrays are integrated in a sorted fashion.

## Challenge Description
<!-- Description of the challenge -->
Implement merge sort in Java and provide unit tests to prove quality.  Write a blog that verifies the insertion sort algorithm.

## Approach & Efficiency
Merge sort halves the input array into array segments until each array segment contains one element.  Then the elements are recaptured in the array in order.

Big O time: O(n log(n))  

Big O space: O(n) 


[Blog](https://github.com/micahThor/Sort/blob/master/assets/BLOG.md)

[Code](https://github.com/micahThor/Sort/blob/master/src/main/java/com/micahThor/sort/Sort.java)  

![](https://github.com/micahThor/Sort/blob/master/assets/mergeSort.jpg)
