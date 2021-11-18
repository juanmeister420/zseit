# 🥱🥱🥱

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# get index of elemnent in lista array starting from the middle
def get_index(lista, element):
    if len(lista) == 1:
        return 0
    elif len(lista) == 2:
        if lista[0] == element:
            return 0
        else:
            return 1
    else:
        middle = len(lista) // 2
        if lista[middle] == element:
            return middle + 1
        elif lista[middle] > element:
            return get_index(lista[:middle], element)
        else:
            return get_index(lista[middle:], element) + middle
