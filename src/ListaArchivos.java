import java.io.File;

/**
 * Esta clase contiene un programa que lista los archivos en el directorio actual.
 */
public class ListaArchivos {
    
    /**
     * Método principal que ejecuta el programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args){
        
        // Crear un objeto File para representar el directorio actual
        File directorio = new File(".");
        
        // Verificar si el objeto File representa un directorio
        if (directorio.isDirectory()){
            
            // Obtener una lista de archivos en el directorio
            File[] listaDirectorio = directorio.listFiles();
            
            // Verificar si la lista de archivos no es nula
            if(listaDirectorio != null){
                
                // Iterar sobre la lista de archivos y mostrar los nombres de los archivos
                for(File elemento : listaDirectorio){
                    System.out.println(elemento.getName());
                }
            }
        }
    }
}
