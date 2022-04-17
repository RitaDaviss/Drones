package ejercicios;

public class Brazo extends Herramientas{
    final static float peso = 500;

    @Override
    public float getPeso() {
        return super.getPeso();
    }

    public Brazo(Herramientas herramienta, float peso) {
        super(herramienta, peso);
    }
}
