import os
os.system("cls")

idades = []

while True:
    idade = int(input("Digite uma idade (-1 para parar): "))
    idades.append(idade)

    if idade == -1:
        break

soma = sum(idades)
print(f"Idades informadas: {idades[:-1]}")
print(f"Quantidades de idades: {len(idades) - 1}")
print(f"Média das idades: {soma / (len(idades) - 1):.2f}")
print(f"Idades iguais ou maiores que 18: {[idade for idade in idades if idade >= 18 and idade != -1]}")