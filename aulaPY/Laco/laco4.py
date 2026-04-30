
import os
os.system("cls | clear")

numeros = []

for x in range(7):
    n = int(input("Digite o número: "))
    numeros.append(n)
    
total = sum(numeros)

print(f"A soma dos nímero digitados foi {total}")
