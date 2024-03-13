package ads.poo;

import java.util.Random;

public class Buzz {

    // Atributos
    
    private boolean estadoCapacete = false;
    private boolean estadoAsa = false;
    private String[] frase = {  
        "Ao infinito e além!", 
        "Preparado para voar!", 
        "Comando estelar pronto para voar!", 
        "Consigo resolver todas as missões do universo.", 
        "Saudações, eu sou Buzz LIghtyear e venho em missão de paz.", 
        "Tem uma cobra na minha bota!"
    };

    // Métodos

    // Método para Abrir ou Fechar capacete
    public boolean acaoCapacete(){
        if (estadoCapacete == true){
            estadoCapacete = false;
        } else{
            estadoCapacete = true;
        }
        return estadoCapacete;
    }

    public boolean isCapaceteAberto(){
        return estadoCapacete;
    }

    // Método para mandar a Frase de forma aleatória
    public String fraseAleatoria(){
        Random r = new Random();
        int i = r.nextInt(6);
        return frase[i];
    }
    public boolean isAsaAberto(){
        return estadoAsa;
    }

    // Método para disparar Laser
    public String dispararLaser(){
        return "Disparando laser";
    }
    
    // Método para golpear
    public String golpear(){
        return "Golpeando";
    }

    // Método para Abrir ou Fechar asa
    public boolean acaoAsa(){
        estadoAsa = !estadoAsa;
        return estadoAsa;
    }
}