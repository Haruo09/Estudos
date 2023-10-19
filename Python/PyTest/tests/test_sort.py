import pytest

from src.sort import *

@pytest.mark.parametrize("entrada, saida", [
    ([9, 8, 7, 6, 5, 4, 3, 2, 1], [1, 2, 3, 4, 5, 6, 7, 8, 9]),
    ([5, 6, 1, 3, 9, 4], [1, 3, 4, 5, 6, 9])
])
def test_bubblesort(entrada, saida):
    assert bubblesort(entrada) == saida


def test_bubbler_sort_error():
    with pytest.raises(TypeError):
        bubblesort(3)


def test_quicksort():
    x = [8, 7, 3, 5, 4, 6, 1, 2, 0, 9, 10]
    quickSort(x, 0, len(x) - 1)
    assert x == [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
