# this works by first finding the smallest element in the array and then swapping it with the first element
# this goes on until the array is sorted

def selection_sort(arr):
    n = len(arr)
    for i in range(n-1):
        min_idx = i
        for j in range(i+1,n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i],arr[min_idx] = arr[min_idx],arr[i]

def bubble_sort(arr):
    
    n = len(arr)
    
    for i in range(n):
        swapped = False
        for j in range(0,n-i-1):
            if arr[j]>arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j]
                swapped = True
        if swapped == False:
            break

arr = [64, 34, 25, 12, 22, 11, 90]
selection_sort(arr)
print(arr)
bubble_sort(arr)
print(arr)
