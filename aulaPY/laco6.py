import os
os.system ("clear | cls")

temperatura = []

for i in range (5):
    temp = float(input("Digite a temperatura: ")) 
    temperatura.append(temp)
    
    maior = max(temperatura)
    menor = min(temperatura)
    
    soma = sum(temperatura)
    media = soma / 5
    
print(f"Maior:{maior}, menor:{menor}, média: {media}")




