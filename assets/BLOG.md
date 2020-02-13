# Insertion Sort - Challenge #26  10 FEB 2020

Insertion sort acts on an array by visiting each element and determining their equality with adjacent values until they are in the right position.  The approach to this sort is to keep track of two indexing variables that pass through the array.  With each element they visit, the determine if the value is greater than or less than.  If the lagging variable is greater than, it swaps itself with the current index and keeps going.

### Pseudocode
```
SelectionSort(int []arr)   
    DECLARE n <-- arr.Length; 
    FOR i = 0; i to n - 1  
        DECLARE min <-- i; 
        FOR j = i + 1 to n 
            if (arr[j] < arr[min]) 
                min <-- j; 
 
        DECLARE temp <-- arr[min]; 
        arr[min] <-- arr[i]; 
        arr[i] <-- temp; 
```

### Trace
```
Sample Array: [8,4,23,42,16,15]
``` 
![](https://github.com/micahThor/Sort/blob/master/assets/inserSort.jpg)

#### Pass 1
In pass one 4 is our temp variable.  We compare this to the previous value 8 and determine that a swap is necessary.  We swap the elements and advance our indexing variables.

#### Pass 2
In pass two 23 is our temp variable.  Since it is larger than its previous element, nothing happens.  We increase our indexing variables.

#### Pass 3
In pass three 42 is our temp variable.  Since it is larger than its previous element, nothing happens.  We increase our indexing variables.

#### Pass 4
In pass four 16 is our temp variable.  Since it is smaller than previous element values of 42 and 23, we make appropriate swaps and increase our indexing variables.

#### Pass 5
In pass five we arrive at the end of our array and our temp value is 15.  Since it is smaller than previous elements of 42, 23, and 16, we make appropriate swaps.  At this time our array is sorted from smallest to larges.

### Result
```
Sample Array: [4, 8, 15, 16, 23, 42]
``` 

---

# Merge Sort - Challenge #27  11 FEB 2020
Merge sort involves halving an array into two seperate arrays until each element is contained within it's own array.  Then the arrays are integrated in a sorted fashion.


### Pseudocode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
       
```

### Trace
```
Sample Array: [8,4,23,42,16,15]
``` 
![](https://github.com/micahThor/Sort/blob/master/assets/mergeSort.jpg)

#### Pass 1
n=5, mid=1
Since the array length is greater than one, the array is split in half.  Since the array is of an even length, three elements compose the left and right array.

#### Pass 2
n=3, mid=1
Since the array length is greater than one, the array is split in half again.

#### Pass 3
n=2, mid=1
Since the array length is greater than one, the array is split in half again.

#### Pass 4
n=1, mid=1
Since the array length is not greather than one, the element is ready to be integrated in sorted order.

#### Pass 5
n=1, mid=1
Since the array length is not greather than one, the element is ready to be integrated in sorted order.

#### Pass 6
n=1, mid=1
Since the array length is not greather than one, the element is ready to be integrated in sorted order.

#### Pass 7
The array is composed of the three elements in sorted order.

#### Pass 8
n=3, mid=1
Since the array length is greater than one, the array is split in half again.

#### Pass 9
n=2, mid=1
Since the array length is greater than one, the array is split in half again.

#### Pass 10
n=1, mid=1
Since the array length is not greather than one, the element is ready to be integrated in sorted order.

#### Pass 11
n=1, mid=1
Since the array length is not greather than one, the element is ready to be integrated in sorted order.

#### Pass 12
n=1, mid=1
Since the array length is not greather than one, the element is ready to be integrated in sorted order.

#### Pass 13
The array is composed of the three elements in sorted order.

### Result
```
Sample Array: [4, 8, 15, 16, 23, 42]
``` 

---

# Quick Sort - Challenge #28  12 FEB 2020
Quick sort makes use of a pivot element to determine if a swap needs to be made.  Like all sorting algorithms, quick sort has to visit each value to determine equality.  This gives the sorting algorithm a time complexity of O(n^2) at worst and O(n log(n)) in the best cases.  This particular quick sort sets the final element in the array as the pivot element.  Then the second pointer traverses from the beginining to the end of the array to determine if a swap needs to occur.  


### Pseudocode
```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
       
```

### Trace
```
Sample Array: [8,4,23,42,16,15]
``` 
![](https://github.com/micahThor/Sort/blob/master/assets/quickSort.jpg)

### Result
```
Sample Array: [4, 8, 15, 16, 23, 42]
``` 
