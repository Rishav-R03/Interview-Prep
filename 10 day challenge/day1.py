'''
    # day 1 of arrays

    problem1: insert element at the x position
    problem2: remove element at the x position
    problem3: insert element at the end of the array

'''
class solution:
    def __init__(self,arr):
        self.arr = arr

    def insertAtPos(self, arr: list[int], pos: int, value: int):
    # Ensure the position is valid
        if pos < 0 or pos > len(arr):
            raise IndexError("Position out of bounds")
        
        # Resize the array by appending a dummy value to the end
        arr.append(0)
        
        # Shift elements to the right starting from the end
        for i in range(len(arr) - 1, pos, -1):
            arr[i] = arr[i - 1]
        
        # Insert the new value at the specified position
        arr[pos] = value
    
