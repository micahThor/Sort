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

#### Pass 1