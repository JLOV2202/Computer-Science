import os

mn = True
folhas = []

while mn:

    print("="*24)
    print("1 - Criar Folha")
    print("2 - Remover Folha")
    print("3 - Calcular Salário")
    print("4 - Demonstrativo")
    print("5 - Sair")
    print("="*24)

    op = int(input("\n>> "))
    os.system('cls')

    if op == 1:

        print("-- Criar Folha --\n")
        nm = input("Informar Funcionário: ")
        ms = int(input("Informar Mês: "))
        an = int(input("Informar Ano: "))
        ht = int(input("Informar Horas Trabalhadas: "))
        vh = float(input("Informar Valor Hora: "))
        if len(folhas) != 0:
            for x in range(0, len(folhas)):
                if nm == folhas[x][0] and ms == folhas[x][1] and an == folhas[x][2]:
                    fnd = True
                    break
                else:
                    fnd = False
            if fnd:
                print("Funcionário já cadastrado!")
                os.system('pause')
            else:
                func = []
                func.append(nm)
                func.append(ms)
                func.append(an)
                func.append(ht)
                func.append(vh)
                folhas.append(func)     

        else:
            func = []
            func.append(nm)
            func.append(ms)
            func.append(an)
            func.append(ht)
            func.append(vh)
            folhas.append(func)

        os.system('cls')

    elif op == 2:
        print("-- Remover Folha --\n")
        nm = input("Informar Funcionário: ")
        ms = int(input("Informar Mês: "))
        an = int(input("Informar Ano: "))

        for x in range(0, len(folhas)):
            if nm == folhas[x][0] and ms == folhas[x][1] and an == folhas[x][2]:
                fnd = True
                break
            else:
                fnd = False
        if fnd:
            print("Funcionário encontrado!")
            del(folhas[x])
            print("Removido!")
            os.system('pause')
        else:
            print("Funcionário não encontrado!")
            os.system('pause')

        os.system('cls')

    elif op == 3:
        print("-- Calcular Salário --\n")
    elif op == 4:
        print("-- Demonstrativo --\n")
        print(folhas)
    elif op == 5:
        print("Você escolheu sair!")
        os.system('pause')
        print("\n")
        mn = False

