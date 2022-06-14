
public class CtBook {
    
    public static void main(String[] args) throws Exception{


        int op = 0;
        int index = 0;
        int id = 0;
        int i = 0;
    
        do {
            clearConsole();
            System.out.printf("====== Agenda de Contatos ======\n");
            System.out.printf("\n       ------ MENU ------\n\n");
            System.out.printf(" [ 1 ] Cadastrar Contato \n");
            System.out.printf(" [ 2 ] Consultar Contato \n");
            System.out.printf(" [ 3 ] Listar os Contatos \n");
            System.out.printf(" [ 4 ] Excluir um Contato \n");
            System.out.printf(" [ 5 ] Sair \n");
    
            System.out.printf("\n Informe um Opção: ");
            scanf("%d", &op);
            flush_in();
    
            switch (op) {
            case 1:
                newContato(&contato[index]);
                index++;
                break;
            case 2:
                searchContato(contato, index);
                break;
            case 3:
                listContato(contato, index);
                break;
            case 4:
                clearConsole();
                System.out.printf("\n------ Excluir Contato ------\n");
                System.out.printf("\nInforme o C�digo: ");
                scanf("%d", &id);
                System.out.printf("\n\n C�digo: %d", id);
                System.out.printf("\n Nome: %s", contato[id].nome);
                System.out.printf("\n Telefone: %s", contato[id].tel);
                System.out.printf("\n Email: %s", contato[id].email);
                System.out.printf("\n\nDeseja Excluir o Contato?\n [ 1 ] Sim\n [ 2 ] N�o\n\nInforme uma Op��o: ");
    
                scanf("%i", &i);
                if (i == 1) {
                    for (i = id; i < index; i++) {
                        strcpy(contato[i].nome, contato[i + 1].nome);
                        strcpy(contato[i].tel, contato[i + 1].tel);
                        strcpy(contato[i].email, contato[i + 1].email);
                    }
                    index--;
                }
                break;
            case 5:
                clearConsole();
                System.out.printf("\n------ Você Escolheu Sair ------\n");
                System.out.printf("\nFeito por: João Lucas de Oliveira Vieira\n");
                System.out.printf("\n--------------------------------\n");
                break;
            }
        } while (op != 5);
    }

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
