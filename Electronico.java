public class Electronico extends Juguete {
    private int cantidadBaterias;
    private int vidaUtil;

    public Electronico(String nombre, int numeroPiezas, int edadPermitida, int cantidadBaterias, int vidaUtil) {
        super(nombre, numeroPiezas, edadPermitida);
        this.cantidadBaterias = cantidadBaterias;
        this.vidaUtil = vidaUtil;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\tJuguete Electronico - Nombre:" + nombre);
        System.out.println("\tpiezas:" + numeroPiezas);
        System.out.println("\tedad:" + edadPermitida);
        System.out.println("\tbaterias:" + cantidadBaterias);
        System.out.println("\tVida útil:" + vidaUtil);
    }
}