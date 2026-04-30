import os
os.system("cls")

numeros = []

for i in range(8):
    while True:
        try:
            n = float(input(f"Digite o {i+1}º número: "))
            numeros.append(n)
            break
        except ValueError:
            print("Erro! Digite um número válido.")

positivos = [n for n in numeros if n >= 0]

removidos = len(numeros) - len(positivos)


print("\nLista original:", numeros)
print("Lista sem negativos:", positivos)
print("Quantidade de números removidos:", removidos)