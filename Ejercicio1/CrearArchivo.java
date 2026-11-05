import java.io.File;
import java.io.IOException;

public class CrearArchivo {

    public static void main(String[] args) {

        try {
            // 1. Crear el archivo curso.txt
            File archivo = new File("curso.txt");

            // 2. Comprobar si el archivo existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            // 3. Mostrar el nombre del archivo
            System.out.println("Nombre del archivo: " + archivo.getName());

        } catch (IOException e) {
            // 4. Mostrar un mensaje si ocurre un error
            System.out.println("Ocurrió un error al crear el archivo.");
        }
    }
}