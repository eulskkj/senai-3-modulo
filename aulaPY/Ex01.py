# importa o customtkinter e apelida em ctk
import customtkinter as ctk

# faz com que fique em modo preto
ctk.set_appearance_mode('dark')

# aqui começa a janela
janela = ctk.CTk()

# faz com que a janela fique em 600x400
janela.geometry('600x400')

# trava a janela em 600x400
janela.resizable(False, False)

# Muda o titulo da janela
janela.title('Sistema de acesso')

# muda a foto da janela
janela.iconbitmap('01.ico')


# elementos de dentro da janela

titulo = ctk.CTkLabel(janela,
                      text='Sistema de Acesso',
                      text_color= 'red',
                      font=('verdana',40)
                      )
titulo.pack(pady=20)

login = ctk.CTkEntry(janela, 
                     width=400,
                     height=40,
                     placeholder_text='Digite o seu login',
                     border_color= 'pink'
                     )
login.pack()

senha = ctk.CTkEntry(janela, 
                     width=400,
                     height=40,
                     placeholder_text='Digite o sua senha',
                     border_color= 'pink',
                     show='*'
                     )
senha.pack(pady= 20)

botao = ctk.CTkButton(janela,
                      text= 'acessar',
                      width=150,
                      height=40,
                      font=('verdana', 20),
                      fg_color='pink',
                      text_color='red')
botao.pack(pady=60)

# faz com q apareça a janela
janela.mainloop()