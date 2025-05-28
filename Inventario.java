
    import java.util.ArrayList;
    import java.util.Scanner;

public class Inventario {
    private static ArrayList<Juguete> inventario = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        while (true) {
            entrada = sc.nextLine();
            if (entrada.equals("3")) {
                break;
            }
            procesarComando(entrada);
        }
        sc.close();
    }

    public static void procesarComando(String comando) {
        String[] partes = comando.split("/");

        if (partes[0].equals("1")) {
            String tipo = partes[1];
            String nombre = partes[2];
            int numeroPiezas = Integer.parseInt(partes[3]);
            int edadPermitida = Integer.parseInt(partes[4]);

            if (tipo.equals("Electronico")) {
                int baterias = Integer.parseInt(partes[5]);
                int vidaUtil = Integer.parseInt(partes[6]);
                Electronico e = new Electronico(nombre, numeroPiezas, edadPermitida, baterias, vidaUtil);
                inventario.add(e);
            } else if (tipo.equals("Mecanico")) {
                String color = partes[5];
                Mecanico m = new Mecanico(nombre, numeroPiezas, edadPermitida, color);
                inventario.add(m);
            }

        } else if (partes[0].equals("2")) {
            System.out.println("***Inventario de Juguetes***");
            for (Juguete j : inventario) {
                j.mostrarInformacion();
            }
        }
    }
}

