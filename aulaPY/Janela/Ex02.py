
import customtkinter as ctk

ctk.set_appearance_mode('dark')

#função 
def calcular():
    d = int(distancia.get())
    c = int(consumo.get())
    p = float(preco.get())
    calculo = (d/c) * p    
    resultado.configure(text=f'O valor final dessa viagem é de R${calculo:.2f}')
    
    
janela = ctk.CTk()
janela.resizable(False, False)

janela.geometry('640x400')


titulo = ctk.CTkLabel (janela,
                      text = 'APP VIAGEM',
                      text_color = 'blue',
                      font= ('verdana', 40)  
                      )
titulo.pack(pady=20)

distancia = ctk.CTkEntry (janela,
                      width=400,
                      height=30,
                      placeholder_text= 'Digite a distância da viagem em KM',
                      border_color= 'blue'
                      )
distancia.pack(pady=20)

consumo = ctk.CTkEntry (janela,
                      width=400,
                      height=30,
                      placeholder_text= 'Digite o consumo do seu veiculo',
                      border_color= 'blue'
                      )
consumo.pack(pady=20)

preco = ctk.CTkEntry (janela,
                      width=400,
                      height=30,
                      placeholder_text= 'Digite o preço atual do combustível',
                      border_color= 'blue'
                      )
preco.pack(pady=20)

botao = ctk.CTkButton (janela,
                       text= 'Calcular gasto',
                       width=150,
                       height=30,
                       font=('verdana', 20),
                       fg_color='red',
                       text_color='black',
                       command=calcular

                       )
botao.pack(pady=10)

resultado = ctk.CTkLabel(janela, 
                         text='',
                         text_color='blue',
                         font=('verdana',20 )
                         )
resultado.pack(pady=10)    




janela.mainloop()





