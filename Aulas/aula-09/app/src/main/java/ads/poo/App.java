package ads.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    Scanner teclado;
    private HashMap<String, Aluno> bancoDeDados;

    public App(){
        this.teclado = new Scanner(System.in);
        this.bancoDeDados= new HashMap<>();
    }
    
    private int menu(){
        int opcao = 0;
        System.out.println(" ..:: SIGAA ::.. ");
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
    
    private boolean cadastrar(){
        System.out.print("Entre com nome: ");
        var nome = teclado.nextLine();

        System.out.print("Entre com a matricula: ");
        String matricula = teclado.nextLine();

        System.out.print("Entre com curso: ");
        var curso = teclado.nextLine();

        System.out.print("Entre com telefone: ");
        String fone = teclado.nextLine();

        System.out.print("Entre com o email: ");
        String email = teclado.nextLine();
        
        System.out.print("Entre com a data de nascimento: ");
        String dataString = teclado.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataString, formato);

        Aluno a = new Aluno(nome, matricula, curso, fone, email, data);

        if (!this.bancoDeDados.containsKey(matricula)){
            this.bancoDeDados.put(matricula, a);
            return true;
        } else{
            return false;
        }
    }
        
    // private boolean editar(){
        
    // }

    private void excluir(){
        System.out.print("Informe a matricula que deseja excluir: ");
        String matricula = teclado.nextLine();

        if (this.bancoDeDados.remove(matricula) == null){
            bancoDeDados.entrySet().removeIf(elemento -> elemento.getKey().equals(matricula));
            System.out.println("Não encontrado");
        } else{
            System.out.println("Removido com sucesso");
        }
    }

    private void listarAluno(){
        System.out.print("Entre com a matricula do Aluno que deseja: ");
        String matricula = teclado.nextLine();
        Aluno aluno = bancoDeDados.get(matricula);
        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    private void listarTodos(){
        System.out.println(this.bancoDeDados);
    }
        
    public static void main(String[] args) {
        
        App app = new App();
        int opcao;
        
        do {
            opcao = app.menu();
            
            switch (opcao) {
            case 1 -> app.cadastrar();
            case 2 -> System.out.println("Editando");
            case 3 -> app.excluir();
            case 4 -> app.listarAluno();
            case 5 -> app.listarTodos();
            default -> System.out.println("Opção invalida");
            }
        } while (opcao!=6);
    }
}
        