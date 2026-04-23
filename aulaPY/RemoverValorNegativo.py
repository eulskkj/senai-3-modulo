import os
os.system("cls")

n = []
for i in range(8):
    num = int(input("Digite um número: "))
    n.append(num)
for i in range(len(n)):
    if n[i] < 0:
        n[i] = 0


print(f"Lista original: {n}")
print(f"Lista sem valores negativos: {n}")
print(f"Quantidade de números removidos: {n.count(0)}")