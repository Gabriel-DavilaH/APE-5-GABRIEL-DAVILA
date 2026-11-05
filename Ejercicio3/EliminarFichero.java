import java.io.File; // 1. Importar la clase necesaria

public class EliminarFichero {
    public static void main(String[] args) {
        // 2. Crear un objeto de tipo File con el nombre del archivo
        File archivo = new File("estudiantes.txt");
        
        // 3 y 4. Utilizar el método delete() y comprobar si se realizó correctamente
        if (archivo.delete()) {
            // 5. Mensaje de confirmación si se eliminó con éxito
            System.out.println("¡El archivo '" + archivo.getName() + "' fue eliminado correctamente!");
        } else {
            // 6. Mensaje indicando el problema si no se pudo eliminar
            System.out.println("No se pudo eliminar el archivo. Es posible que no exista o esté en uso.");
        }
    }
}
