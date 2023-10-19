def bubblesort(x):
    if type(x) is not list:
        raise TypeError(x)
    
    size = len(x)
    
    for _ in range(size - 1):
        for i in range(size - 1):
            if x[i] > x[i + 1]:
                x[i], x[i + 1] = x[i + 1], x[i]
    
    return x


def partition(array, low, high):
    pivot = array[high]
    
    i = low - 1
    for j in range(low, high):
        if array[j] <= pivot:
            i = i + 1
            (array[i], array[j]) = (array[j], array[i])
    (array[i + 1], array[high]) = (array[high], array[i + 1])
    return i + 1


def quickSort(array, low, high):
    if low < high:
        pi = partition(array, low, high)
        quickSort(array, low, pi - 1)
        quickSort(array, pi + 1, high)
