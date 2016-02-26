/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Array que almacena los números de la lista
    private int[] listaEnteros;
    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        listaEnteros = new int[0];
    }

    /**
     * Método para añadir elementos a la lista
     */
    public void add(int elemento){
        int tamaño = listaEnteros.length;
        int[] temp = new int[tamaño + 1];
        for (int cont = 0; cont < tamaño; cont++){
            temp[cont] = listaEnteros[cont];
        }
        temp[tamaño] = elemento;
        listaEnteros = temp;
    }

    /**
     * Método para añadir elementos a la lista, 
     * indicando por parámetro en qué posición se almacenarán
     * Si la posición no es válida no hace nada
     */
    public void add(int elemento,int posicion){
        int tamaño = listaEnteros.length;
        if ((posicion >= 0) && (posicion < tamaño)){
            int[] temp = new int[tamaño + 1];
            int indiceListaEnteros = 0;
            for (int indiceTemp = 0; tamaño > indiceListaEnteros; indiceTemp++){
                if (posicion == indiceTemp){
                    temp[indiceTemp] = elemento;
                }
                else {
                    temp[indiceTemp] = listaEnteros[indiceListaEnteros];
                    indiceListaEnteros++;
                }
            }
        }
    }

    /**
     * Método para vaciar la lista
     */
    public void clear(){
        listaEnteros = new int[0];
    }
    
    /**
     * 
     */
}
