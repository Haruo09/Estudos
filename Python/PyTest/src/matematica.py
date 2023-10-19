def soma(x, y):
    return x + y 
 

def factorial(n: int) -> None:
    if n == 1:
        return 1
    else: 
        return factorial(n - 1) * n


def fibonacci(x: int) -> list[int]:
    if x == 1:
        return [1]
    
    v = [1, 1]
    for i in range(2, x):
        v.append(v[i - 1] + v[i - 2])
    
    return v
