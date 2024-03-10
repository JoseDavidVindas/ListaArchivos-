import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene un programa simple para verificar la existencia de un archivo y realizar operaciones basadas en esa verificación.
 */
public class App {
    
    /**
     * El método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args){
        
        // Crear un objeto File para representar el archivo "archivo.txt"
        File archivo = new File("archivo.txt");
        int respuesta = 0;
        
        // Verificar si el archivo existe
        if(archivo.exists()){
            
            // Mostrar un mensaje indicando que el archivo existe
            JOptionPane.showMessageDialog(null, "Archivo existe", "Message", respuesta);
            
            // Si el usuario elige la opción "Sí", eliminar el archivo
            if (respuesta == JOptionPane.YES_OPTION){
                archivo.delete();
            }
        } else {
            
            // Mostrar un mensaje indicando que el archivo no existe
            JOptionPane.showMessageDialog(null, "Archivo no existe", "Mensaje del sistema", JOptionPane.ERROR_MESSAGE);
            
            // Preguntar al usuario si desea crear el archivo
            respuesta = JOptionPane.showInternalConfirmDialog(null, "Desea crear el archivo?", "Sistema", 0, JOptionPane.DEFAULT_OPTION);
            
            // Si el usuario elige la opción "Sí", intentar crear el archivo
            if (respuesta == JOptionPane.YES_OPTION){
                
                try{
                    archivo.createNewFile(); // Intentar crear el archivo
                } catch (IOException e){
                    JOptionPane.showMessageDialog(null, e); // Capturar y mostrar cualquier excepción que ocurra durante la creación del archivo
                }
            }
        }
    }
}
