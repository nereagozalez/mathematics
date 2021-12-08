from modules.operations import fill_matrix, matrix_pprint, transposed_matrix, matrix_mult, scalar_product, matrix_sum


def main():
    n, m = 2, 2
    matrixA = fill_matrix(n, m)
    matrixB = fill_matrix(n, m)
    matrix_pprint(matrixA)
    matrix_pprint(matrixB)
    matrix_pprint(transposed_matrix(matrixA))
    matrix_pprint(matrix_mult(matrixA, matrixB))
    matrix_pprint(scalar_product(2, matrixB))
    matrix_pprint(matrix_sum(matrixA, matrixB))




if __name__ == '__main__':
    main()
