# Projeto Supermercado

sabonete = 5.25
feijao = 7.30
cerveja = 5.10
arroz = 7.25
acucar = 5.60

qsabonete = int(input('Digite a quantidade de Sabonetes: '))
qfeijao = int(input('Digite quantos KG de Feijão: '))
qcerveja = int(input('Digite a quantidade de Latinhas: '))
qarroz = int(input('Digite quantos KG de Arroz: '))
qacucar = int(input('Digite quantos KG de Açucar: '))

total = (sabonete*qsabonete) + (feijao*qfeijao) + (cerveja*qcerveja) + (arroz*qarroz) + ( acucar*qacucar)

print(f'O total da compra foi de: R${total:.2f}')