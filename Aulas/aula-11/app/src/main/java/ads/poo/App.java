/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // Motor[] stock = new Motor[3];
        ArrayList<Motor> stock = new ArrayList<>();
        Carro garagem = new Carro("fusca", "branco", new Motor(1000, 52));

        // stock[0] = (garagem.getMotor());
        stock.add(garagem.getMotor());
        
        garagem.setMotor(new Motor(2000, 110));
        
        garagem = new Carro("Uno de escada", "Branco", new Motor(1000, 66));        

    }
}