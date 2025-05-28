
public class Mecanico extends Juguete {
    private String color;

    public Mecanico(String nombre, int numeroPiezas, int edadPermitida, String color) {
        super(nombre, numeroPiezas, edadPermitida);
        this.color = color;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\tJuguete Mecanico - Nombre:" + nombre);
        System.out.println("\tpiezas:" + numeroPiezas);
        System.out.println("\tedad:" + edadPermitida);
        System.out.println("\tcolor:" + color);
    }
}
