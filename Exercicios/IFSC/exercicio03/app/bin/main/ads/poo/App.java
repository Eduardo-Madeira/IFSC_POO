package ads.poo;

public class App {

    Scanner teclado;

    public App(){
        this.teclado = new Scanner(System.in);
    }

    // Menu principal
    private int menu(){
        int opcao = 0;
        System.out.println(" ..:: Agenda ::.. ");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Listar dados de um aluno");
        System.out.println("5 - Listar todos os alunos");
        System.out.println("6 - Sair"); 
        System.out.print("Entre com a opção que deseja: ");
        opcao = teclado.nextInt();
        teclado.nextLine();
        return opcao;
    }
    
    public static void main(String[] args) {

        App app = new App();
        int opcao;

        Contato c = new Contato();
        
        do {
            opcao = app.menu();
            
            switch (opcao) {
            case 1 -> c.Contato();
            case 2 -> app.editar();
            case 3 -> app.excluir();
            case 4 -> app.listarAluno();
            case 5 -> app.listarTodos();
            default -> System.out.println("Opção invalida");
            }
        } while (opcao!=6);
    }
}
