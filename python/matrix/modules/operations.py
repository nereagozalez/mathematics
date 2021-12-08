from random import randint


def fill_matrix(rows, columns):

    matrix = []

    for i in range(rows + 1):
        matrix.append(list())
        for j in range(columns + 1):
            matrix[i].append(randint(0, 9))
    
    return matrix

def matrix_pprint(matrix):

    for row in range(len(matrix)):
        for column in range(len(matrix[row])):
            print(matrix[row][column], end=' ')
        print()
    print()


def transposed_matrix(matrix):
    transposed = []

    for column in range(len(matrix[0])):
        transposed.append(list())
        for row in range(len(matrix)):
            transposed[column].append(matrix[row][column])

    return transposed



def matrix_mult(matrixA, matrixB):
    
    product_matrix = list()

    if len(matrixA[0]) == len(matrixB):
        for i in range(len(matrixA)):
            product_matrix.append(list())
            for j in range(len(matrixB)):
                product = 0
                for k in range(len(matrixB)):

                    product += matrixB[k][j]*matrixA[i][k]
                
                product_matrix[i].append(product)

    else:
        raise 'Cannot be multiplied'
    
    return product_matrix
    


def scalar_product(scalar, matrix):
    
    return [ [scalar * matrix[i][j] for j in range(len(matrix[i]))] for i in range(len(matrix)) ]


def matrix_sum(matrixA, matrixB):
    
    if (len(matrixB[0]) == len(matrixA[0])) and (len(matrixB) == len(matrixA)):
        return [ [matrixA[i][j] + matrixB[i][j] for j in range(len(matrixA[i]))] for i in range(len(matrixA)) ]
    else:
        raise 'Cannot be multiplied'

