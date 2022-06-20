
import java.util.HashMap.*;
import java.util.Map;
import java.util.Scanner;


public class CtBook {

    //Limpa o Console
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

    //Limpa o Buffer do Scanner
    public final static void flush_in(Scanner scanner) {
        if (scanner.hasNextLine())
            scanner.nextLine();
    }

    int index = 0;
    Contact[] contato = new Contact[100];

    public void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        int op = 0;

        do {
            clearConsole();
            System.out.printf("====== Agenda de Contatos ======\n");
            System.out.printf("\n       ------ MENU ------\n\n");
            System.out.printf(" [ 1 ] Cadastrar Contato \n");
            System.out.printf(" [ 2 ] Alterar Contato \n");
            System.out.printf(" [ 3 ] Listar os Contatos \n");
            System.out.printf(" [ 4 ] Excluir um Contato \n");
            System.out.printf(" [ 5 ] Sair \n");
    
            System.out.printf("\n Informe um Opção: ");
            input.nextInt(op);
            flush_in(input);
    
            switch (op) {
            case 1:
                newContact();
                break;
            case 2:
                altContact();
                break;
            case 3:
                listContact();
                break;
            case 4:
                delContact();
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

    public void newContact(){
        Scanner input = new Scanner(System.in);
        clearConsole();
        System.out.printf("\n------ Cadastrar Contato ------\n");
        System.out.printf("Nome: ");
        System.out.printf("RG: ");
        System.out.printf("Data de Nascimento: ");
        System.out.printf("---- E-mail ----");
        System.out.printf("Principal: "); 
        System.out.printf("Secundário: ");
        System.out.printf("---- Telefone ----");
        System.out.printf("Residencial: ");
        System.out.printf("Comercial: ");
        System.out.printf("Celular: ");
        System.out.printf("---- Endereço ----");
        System.out.printf("Residencial: ");
        System.out.printf("Comercial");
    }

    private void altContact(){
        clearConsole();
        System.out.printf("\n------ Alterar Contato ------\n");
        System.out.printf("Nome: ");
        System.out.printf("RG: ");
        System.out.printf("Data de Nascimento: ");
        System.out.printf("---- E-mail ----");
        System.out.printf("Principal: "); 
        System.out.printf("Secundário: ");
        System.out.printf("---- Telefone ----");
        System.out.printf("Residencial: ");
        System.out.printf("Comercial: ");
        System.out.printf("Celular: ");
        System.out.printf("---- Endereço ----");
        System.out.printf("Residencial: ");
        System.out.printf("Comercial");
    }

    private void listContact(){
        clearConsole();
        System.out.printf("\n------ Listar Contatos ------\n");
    }

    private void delContact(){
        clearConsole();
        System.out.printf("\n------ Excluir Contato ------\n");
    }

}
