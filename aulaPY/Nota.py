import os
os.system("cls")

notas = []

for i in range(5):
    while True:
        try:
            nota = float(input(f"Digite a nota {i+1} (0-10): "))
            if 0 <= nota <= 10:
                notas.append(nota)
                break
            else:
                print("Nota inválida! Digite um valor entre 0 e 10.")
        except ValueError:
            print("Erro! Digite um número válido.")

media = sum(notas) / len(notas)

acima = sum(1 for nota in notas if nota > media)
abaixo = sum(1 for nota in notas if nota < media)

print(f"\nMédia das notas: {media:.2f}")
print(f"Notas acima da média: {acima}")
print(f"Notas abaixo da média: {abaixo}")