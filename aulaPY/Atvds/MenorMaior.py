import os
os.system("cls")

n = []
for i in range(5):
    num = int(input("Digite um número: "))
    n.append(num)

menor = min(n)
maior = max(n)

print(f"Lista: {n}")
print(f"Menor número: {menor}")
print(f"Maior número: {maior}")