[Expected Approach] Dutch National Flag Algorithm - One Pass - O(n) Time and O(1) Space
    The problem is similar to "Segregate 0s and 1s in an array". The idea is to sort the array of size n using three pointers: lo = 0, mid = 0 and hi = n - 1 such that the array is divided into three parts -

    arr[0] to arr[lo - 1]: This part will have all the zeros.
    arr[lo] to arr[mid - 1]: This part will have all the ones.
    arr[hi + 1] to arr[n - 1]: This part will have all the twos.

    Here, lo indicates the position where next 0 should be placed, mid is used to traverse through the array and hi indicates the position where next 2 should be placed.

        Traverse over the array till mid <= hi, according to the value of arr[mid] we can have three cases:

        arr[mid] = 0, then swap arr[lo] and arr[mid] and increment lo by 1 because all the zeros are till index lo - 1 and move to the next element so increment mid b 1.
        arr[mid] = 1, then move to the next element so increment mid by 1.
        arr[mid] = 2, then swap arr[mid] and arr[hi] and decrement hi by 1 because all the twos are from index hi + 1 to n - 1. Now, we don't move to the next element because the element which is now at index mid can be a 0 and therefore needs to be checked again.