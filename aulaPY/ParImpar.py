import os
os.system("cls")

num = []

for i in range(6):
    n = int(input("Digite um número: "))
    num.append(n)
for n in num:
    if n % 2 == 0:
        print(f"O número {n} é par.")
    else:    
        print(f"O número {n} é ímpar.")
        
print(f"Números digitados: {num}")

