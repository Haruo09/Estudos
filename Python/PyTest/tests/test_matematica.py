import pytest  # NOQA

from src.matematica import *


def test_soma():
    assert soma(1, 2) == 3


@pytest.mark.skip("Não quero rodar esse teste")
def test_soma_falha():
    assert soma(1, 2) == 4


def test_factorial():
    assert factorial(4) == 24
    assert factorial(5) == 120
    assert factorial(6) == 720


@pytest.mark.parametrize("entrada, saida", [
    (1, [1]),
    (5, [1, 1, 2, 3, 5]),
    (10, [1, 1, 2, 3, 5, 8, 13, 21, 34, 55])
])
def test_fibonacci(entrada, saida):
    f = fibonacci(entrada)
    assert f == saida
    # assert fibonacci(1) == [1]
    # assert fibonacci(5) == [1, 1, 2, 3, 5]
    # assert fibonacci(10) == [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
