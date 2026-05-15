import customtkinter as ctk

ctk.set_appearance_mode('dark')
def calcular():
    media =(float(unidade1.get())+float(unidade2.get())+float(unidade3.get())) / 3
    if (media >=5):
        situacao = 'Passou de ano'
    else:
        situacao = 'Se fudeu'
    resultado.configure(text = f'A sua média é: {media:.1f}\n {situacao}')

janela = ctk.CTk()
janela.geometry('600x400')

janela.title('Sistema escolar 2026')


titulo = ctk.CTkLabel(janela,
                      text='Sistema escolar',
                      font=('verdana', 20),
                      text_color='white')
titulo.pack()

unidade1 = ctk.CTkEntry(janela,
                        width=400, 
                        height=20,
                        placeholder_text='Digite a nota da 1º unidade',
                        border_color='yellow')
unidade1.pack(pady = 20)

unidade2 = ctk.CTkEntry(janela,
                        width=400, 
                        height=20,
                        placeholder_text='Digite a nota da 2º unidade',
                        border_color='yellow')
unidade2.pack(pady = 20)

unidade3 = ctk.CTkEntry(janela,
                        width=400, 
                        height=20,
                        placeholder_text='Digite a nota da 3º unidade',
                        border_color='yellow')
unidade3.pack(pady = 20)

botao = ctk.CTkButton(
    janela,
    width=200,
    height=35,
    fg_color='yellow',
    text_color='black',
    text='Resultado',
    command=calcular
)
botao.pack()

resultado = ctk.CTkLabel(janela,
                         text='',
                         font=('verdana', 25),
                         text_color='white')
resultado.pack(pady=20)

janela.mainloop()