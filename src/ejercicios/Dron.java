package ejercicios;

public class Dron {
    Herramientas Herramienta;
    static final float MAX_PESO = 200;
    static final float MAX_VEL = 5;
    static final float MAX_ALTURA = 100;
    float velocidad = 5;
    float altura = 100;

    public Herramientas getHerramienta() {
        return Herramienta;
    }

    public void setHerramienta(Herramientas herramienta) {
        Herramienta = herramienta;
    }

    public Dron(Herramientas herramienta) {
        this.Herramienta = herramienta;
    }


    float excesoPeso (){

        float diferencia = Herramienta.getPeso() - MAX_PESO;


        System.out.println(diferencia);

        return diferencia;


    }


    public void penalidadVelocidad(){

        if (Herramienta.getPeso() <=MAX_PESO){
            this.velocidad = velocidad;
        }
        float exceso = excesoPeso();

        this.velocidad -= ((exceso/50) * 0.02f);

    }

    public void penalidadAltura(){

        if (Herramienta.getPeso() <=MAX_PESO){
            this.altura = altura;
        }
        float exceso = excesoPeso();

        this.altura -= ((exceso/50) * 0.05f);

    }
}
