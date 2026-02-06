nome = input("Digite seu nome: ")
n1 = float(input("Digite sua primeira nota: "))
n2 = float(input("Digite sua segunda nota: "))
n3 = float(input("Digite sua terceira nota: "))

total = (n1 + n2 + n3) / 3

print(f'Sr(a) {nome} sua média foi de {total:.1f}')
