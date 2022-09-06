from ctypes import sizeof
from operator import index
import os
from queue import Empty
import sys

base = []

def Menu(sMn): # Função de estruturação do Menu
    if sMn == 0:
        print("======== MENU ========")
        print("1-Cadastrar.")
        print("2-Apagar.")
        print("3-Alterar.")
        print("4-Buscar.")
        print("5-Listar.")
        print("6-Sair")
        print("-"*22)
    elif sMn == 1:
        os.system("cls")
        print("====== Cadastrar ======")
        Cadastro()
        os.system("cls")
    elif sMn == 2:
        os.system("cls")
        print("======= Apagar =======")
        Apagar()
        os.system("cls")
    elif sMn == 3:
        os.system("cls")
        print("======= Alterar =======")
        Alterar()
        os.system("cls")
    elif sMn == 4:
        os.system("cls")
        print("======= Buscar =======")
        Buscar()
        os.system("cls")
    elif sMn == 5:
        os.system("cls")
        Listar()
        os.system("cls")
    elif sMn == 6:
        os.system("cls")
        print("Você escolheu sair!")
        os.system("pause")

def Cadastro(): # Cadastra um novo jogo
    tt = input("Nome do Jogo:\n>>")
    lDay = input("\nData de Lançamento:\n>>")
    dev = input("\nDesenvolvedora:\n>>")

    game = []
    game.append(tt)
    game.append(lDay)
    game.append(dev)

    if len(base) == 0:
        base.append(game)
        print("Jogo cadastrado!")
        os.system("pause")
    else:
        for x in range(0, len(base)):
            if tt == base[x][0]:
                print("Jogo já cadastrado!")
                os.system("pause")
                fd = 1
                break
            else:
                fd = 0
        if fd == 0:
            base.append(game)
            print("Jogo cadastrado!")
            os.system("pause")

def Apagar(): # Apaga um jogo
    if len(base) == 0:
        print("A lista de jogos está vazia!")
        os.system("pause")
    else:
        tt = input("Informe o nome do jogo:\n>>")
        for x in range(0, len(base)):
            if tt == base[x][0]:
                print("Jogo: {}\nLançamento: {}\nDesenvolvedora {}\n".format(base[x][0], base[x][1], base[x][2]))
                op = input("Deseja apagar o jogo(S/N):\n>>")
                while op not in "SsNn":
                    op = input("Informe uma opção valida(S/N): >>")
                if op == "S":
                    print("Jogo apagado!")
                    del(base[x])
                    os.system("pause")
                else:
                    print("Operação cancelada!")
                    os.system("pause")
                fd = 1
                break
            else:
                fd = 0
            if fd == 0:
                ("Jogo não encontrado!")
        

def Alterar(): # Altera o jogo selecionado

    tt = input("Informe o nome do jogo:\n>>")
    fd = 0

    for x in range(0, len(base)):
        if tt == base[x][0]:
            print("Jogo: {}\nLançamento: {}\nDesenvolvedora {}\n".format(base[x][0], base[x][1], base[x][2]))
            op = input("Deseja alterar o jogo(S/N):\n>>")
            while op not in "SsNn":
                op = input("Informe uma opção valida(S/N): >>")
            if op in "Ss":

                tt = input("Nome do Jogo:\n>>")
                lDay = input("\nData de Lançamento:\n>>")
                dev = input("\nDesenvolvedora:\n>>")

                game = []
                game.append(tt)
                game.append(lDay)
                game.append(dev)
                base.insert(x, game)

                print("Jogo alterado!") 
            else:
                print("Operação cancelada!")
                os.system("pause")
            fd = 1
            break
        else:
            fd = 0
    if fd == 0:
        print("Jogo não encontrado!")
        os.system("pause")

def Buscar(): # Busca um jogos da lista
    tt = input("Informe o nome do jogo:\n>>")
    fd = 0
    for x in range(0, len(base)):
        if tt == base[x][0]:
            print("-"*22)
            print("Titulo: {}\nLançamento: {}\nDesenvolvedora: {}\n".format(base[x][0], base[x][1], base[x][2]))
            print("-"*22)
            fd = 1
            os.system("pause")
        else:
            fd = 0
        break
    if fd == 0:
        print("Jogo não encontrado!")
        os.system("pause")

def Listar():
    print("1-Nome.\n2-Data.\n3-Desenvolvedora.")
    op = int(input(">>"))
    
    if op == 1:
        nome = []
        for x in range(0, len(base)):
            nome.append(base[x][0])
        nome_ord = sorted(nome)
        print("-"*32)
        for x in range(0, len(nome_ord)):
            print(nome_ord[x])
        print("-"*32)
        os.system("pause")
    elif op == 2:
        dt = input("Informe a Data:")
        fd = 0
        for x in range(0, len(base)):
            if dt == base[x][1]:
                print("-"*22)
                print("Titulo: {}\nLançamento: {}\nDesenvolvedora: {}".format(base[x][0], base[x][1], base[x][2]))
                print("-"*22)
                fd = 1
        if fd == 0:
            print("Data não encontrado!")
        os.system("pause")
    elif op == 3:
        dev = input("Informe a desenvolvedora:")
        fd = 0
        for x in range(0, len(base)):
            if dev == base[x][2]:
                print("-"*22)
                print("Titulo: {}\nLançamento: {}\nDesenvolvedora: {}".format(base[x][0], base[x][1], base[x][2]))
                fd = 1
        if fd == 0:
            print("Desenvolvedora não encontrado!")
        os.system("pause")

# Execução principal
mn = 0

while mn != 6:
    Menu(0)
    try:
        mn = int(input(">>"))
    except:
        print("Informe uma opção valida!")
    if mn > 0 and mn < 7:
        Menu(mn)
    else:
        os.system("cls")
        print("Informe uma opção valida!")
