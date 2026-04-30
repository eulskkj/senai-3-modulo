import os
os.system("cls | clear")

numeros = []
for x in range(3):
    nota = float(input("Digite a nota da unidade: "))
    numeros.append(nota)
    media = sum(numeros) / len(numeros)
print(f"A média das notas é {media}")