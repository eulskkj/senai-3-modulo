import os
os.system("cls")

a = int(input("Diigte um número: "))
b = str(input("Diigte a operação '+' '-' '*' '/' : "))
c = int(input("Diigte outro número: "))

soma = a + c 
subtracao = a - c
multiplicacao = a * c
divisao = a / c

if b == '+':
    resultado = soma
elif b == '-':
    resultado = subtracao 
elif b == '*':
    resultado = multiplicacao
elif b == '/':
    resultado = divisao 
else:
    resultado = "Operação inválida"

print(f"{a} {b} {c}")
print(f"Resultado: {resultado}")