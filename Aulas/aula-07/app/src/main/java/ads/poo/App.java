/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

public class App {

    public static void main(String[] args) {
        Buzz b = new Buzz();

        System.out.println(b.dispararLaser());
        System.out.println(" ");

        System.out.println(b.golpear());
        System.out.println(" ");

        System.out.println(b.fraseAleatoria());
        System.out.println(" ");

        System.out.println("Capacete aberto? " + b.isCapaceteAberto());
        b.acaoCapacete();
        System.out.println("Capacete aberto? " + b.isCapaceteAberto());
        System.out.println(" ");

        System.out.println("Asa aberta? " + b.isAsaAberto());
        System.out.println(" ");
        b.acaoAsa();
        System.out.println("Asa aberta? " + b.isAsaAberto());
        System.out.println(" ");

        Caneta c = new Caneta();

        System.out.println(c.desenhar());
        System.out.println(" ");

        c.setCor("Azul");
        c.setTinta(1);

        System.out.println(c.getCor());
        System.out.println(" ");
        System.out.println(c.getTinta());
        System.out.println(" ");
        System.out.println(c.desenhar());
        System.out.println(" ");

        Pessoa juca = new Pessoa();

        juca.setNome("Juca");
        juca.setCpf("000.000.000-00");
        juca.setEmail("juca@exemple.org");

        System.out.println(juca);
    }
}