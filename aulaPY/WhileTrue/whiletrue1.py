import os
os.system("cls | clear")

n = []
while True:
    numero = float(input("Digite um número para somar (0 para parar): "))
    n.append(numero)

    soma = sum(n)
    if numero == 0:
        break
print(f"Resultado: {soma}")



