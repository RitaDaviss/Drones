package ejercicios;

public class Main {

    public static void main(String[] args) {


        Herramientas sensor = new Sensor();
        Dron dronS = new Dron(sensor);

        dronS.penalidadAltura();
        dronS.penalidadVelocidad();

        System.out.println("Herramienta: Sensor " + "Velocidad: " + dronS.velocidad + "Altura: " + dronS.altura);

    }
}
