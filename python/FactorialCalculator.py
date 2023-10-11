def factorial_loop(n):

    result = 1

    for i in range(1, n + 1):

        result *= i

    return result

 

def factorial_recursive(n):

    if n <= 1:

        return 1

    return n * factorial_recursive(n - 1)

 

if __name__ == "__main__":

    import sys

    if len(sys.argv) > 1:

        number = int(sys.argv[1])

    else:

        number = int(input("Entrez un nombre: "))

    print("Factorielle (boucle):", factorial_loop(number))

    print("Factorielle (récursive):", factorial_recursive(number))