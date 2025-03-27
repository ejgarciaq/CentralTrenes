//Clase que genera el grafo por el cual se movera el aplicactivo
package Grafo;
import java.io.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.UnsupportedOperationException;
import java.lang.RuntimeException;
  
public class ContructorGrafo {
    
    private final int MAXIMO_VERTICES; // Número máximo de vértices en el grafo
    private final int MAXIMO_ARISTAS; // Número máximo de aristas en el grafo
    private int aristas; // Número actual de aristas en el grafo
    private int grafitoMatriz[][]; // Matriz de adyacencia que representa el grafo
// Constructor que inicializa el grafo con el número de caminos y ciudades   
public ContructorGrafo(int caminos,int ciudades)
{   	
    this.aristas = 0;
    MAXIMO_VERTICES = ciudades;
    MAXIMO_ARISTAS = caminos; 
    grafitoMatriz = new int[MAXIMO_VERTICES][MAXIMO_VERTICES];
   // Inicializa la matriz de adyacencia con ceros (sin aristas)
    for (int i = 0; i < getMAX_VERTICES(); i++) 
    {
        for (int j = 0; j < getMAX_VERTICES(); j++)
        {
            grafitoMatriz[i][j] = 0;
        }
    }
}
// Constructor que inicializa el grafo con el número de ciudades (asume caminos = ciudades)
public ContructorGrafo(int ciudades)
{
this(ciudades, ciudades);
}
// Métodos para obtener el número máximo de vértices y aristas
public int getMAX_VERTICES() {
return MAXIMO_VERTICES;
}

public int getMAX_ARISTAS() {
return MAXIMO_ARISTAS;
}
    
//-----------------------------------------------

/**
* Inserta una arista dada la relacion entre vertice1 y vertice2 y la distancia entre los vertices
* dados
* @param v1 vertice1
* @param v2 vertice2
* @param dist distancia entre los dos vertices
* @throws ArrayIndexOutOfBoundsException
* @throws UnsupportedOperationException
*/
public void insertaArista(int v1, int v2, int dist)
throws ArrayIndexOutOfBoundsException, UnsupportedOperationException {
if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
throw new ArrayIndexOutOfBoundsException(
"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
} else if (aristas == MAXIMO_ARISTAS) {
throw new UnsupportedOperationException("No se puede añadir más aristas");
} else {
grafitoMatriz[v1][v2] = dist;// Inserta la arista en la matriz de adyacencia
}
}
/**
* Este metodo nos indica si existe una arista entre un par de vertice dados.
* @param v1 vertice1
* @param v2 vertice2
* @return verdadero o falso.
*/

public boolean existeArista(int v1, int v2) {
if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
throw new ArrayIndexOutOfBoundsException(
"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
} else if (grafitoMatriz[v1][v2] != 0) {
return true;
}
return false;
}

/**
* Eliminar arista
* @param v1 vertice1
* @param v2 vertice2
*/
public void eliminaArista(int v1, int v2) {
if (v1 >= MAXIMO_VERTICES || v2 >= MAXIMO_VERTICES) {
throw new ArrayIndexOutOfBoundsException(
"Vertices inválidos, fuera de rango" + "nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
} else if (grafitoMatriz[v1][v2] == 0) {
System.err.println("La arista NO existe");
} else {
grafitoMatriz[v1][v2] = 0;
}
}

public void borrarGrafo() {
for (int i = 0; i < grafitoMatriz.length; i++) {
for (int j = 0; j < grafitoMatriz[i].length; j++) {
grafitoMatriz[i][j] = 0;
}
}
}

public void impgrafitoMatriz() {
System.out.print(" ");
for (int i = 0; i < MAXIMO_VERTICES; i++) {
System.out.printf("  %3d", i);
}
System.out.println();
for (int i = 0; i < MAXIMO_VERTICES; i++) {
System.out.printf(" %3d", i);
for (int j = 0; j < MAXIMO_VERTICES; j++) {
System.out.printf(" %3d", grafitoMatriz[i][j]);
}
System.out.println();
}
}

// ----- Operaciones para obtener Lista de Adyacencia ----- //

public boolean grafoVerticesAdyacentes(int v) {
int auxiliar = 0;
boolean estavacia = true;

while (auxiliar < MAXIMO_VERTICES && estavacia) {
if (grafitoMatriz[v][auxiliar] == 1) {
estavacia = false;
} else {
auxiliar = auxiliar + 1;
}
}

return estavacia;
}

public int primeroListaAdy(int v) throws RuntimeException {
int auxiliar = 0;
boolean estavacia = true;

while (auxiliar < MAXIMO_VERTICES && estavacia) {
if (grafitoMatriz[v][auxiliar] == 1) {
estavacia = false;
} else {
auxiliar = auxiliar + 1;
}
}

if (auxiliar == MAXIMO_VERTICES)
throw new RuntimeException("La lista de Adyacencia esta vacía");
return auxiliar;
}

public int proxAdy(int v, int ady) {
int proximo = ady + 1;
while (proximo < MAXIMO_VERTICES && grafitoMatriz[v][proximo] == 0) {
proximo = proximo + 1;
}
if (proximo == MAXIMO_VERTICES)
return -1;
return proximo;
}
////-------------------------------------------- probar algoritmo y ajustar a la necesidad.
/*public int encontrarCaminoMasCorto(int ini,int fin)
	{
            int m[][] = grafitoMatriz;
		// Se verifica que no se este tratando de accesar a un v�rtice
		// fuera del rango de la matriz de adyacencia.
		if((ini>m.length-1)||(fin>m[0].length))
		{
			System.out.print("Indices fuera de rango...");
			return 0;
		}
		// Se quiere ver el camino m�s corto desde un nodo a s� mismo
		// entonces se imprime el coste de llegar a s� mismo.
		if( ini == fin )
		{
			System.out.println("\t\t Costo de llegar de "+ini+" a "+fin+" es de "+m[ini][fin]);
			System.out.println("\n");
			return m[ini][fin];
		}
		// Como los indices est�n bien ingresados y no se est�
		// tratando con el caso base de que se quiera llegar al mismo nodo
		// entonces se busca la distancia m�s corta que hay entre el nodo "ini"
		// y el nodo "fin".
		return MostrarCaminoMasCorto(ini,fin,ini,0,m);
		
	}
	// M�todo que muestra el camino m�s corto entre dos v�rtices del grafo.
	public  int MostrarCaminoMasCorto(int ini,int ter,int x,int suma,int [][]matriz)
	{
		int i,j,aux;
		// Si se pasar�n los l�mites de orden de la matriz entonces
		// quiere decir que el camino no se encuentra y se retorna 0.
		if(x>(matriz.length-1))
		{
			System.out.print("El camino entre los nodos no existe...");
			System.out.println("\n");
			return -1;
		}
		// Como se esta todav�a dentro de la matriz entonces se 
		// sigue buscando un nodo que llegue al nodo terminal.
		for(i=0;i<matriz[0].length;i++)
		{
			// Existe una llegada al nodo deseado entonces
			// Se suma el costo al costo general y se retorna la suma.
			if(matriz[x][ter]!=0)
			{
				System.out.println("Revisando Nodo "+x+" - Costo : "+suma);
				suma += matriz[x][ter];                               
				break;                                
			}
			else
                        {
                            
				// Como lo anterior no pas� entonces se verifica que 
				// existe un camino para pasar al pr�ximo nivel.
				if(matriz[x][i]!=0)		// Camino existe
				{     
					System.out.println("Revisando Nodo "+x+" - Costo : "+suma);
					aux = suma;
					suma += MostrarCaminoMasCorto(ini,ter,x,suma,matriz);
					if(suma==-1)
					suma = aux;
					else
					if((suma>aux)&&(aux!=0))
					suma=aux;
				}
                        }
		}
		
		return suma;
	}

public  int[][] Floyd(){

    int[][] ady = grafitoMatriz;
   // se inicializa con las aristas.
   int[][] resultado = new int[ady.length][ady.length];

   for (int i = 0; i < ady.length; i++)
      for (int j = 0; j < ady.length; j++)

         resultado[i][j] = j;

   //Algoritmo de Floyd
   // si el camino desde i a j es mejor al meter k
   // se actualiza las matrices
   
   for (int k = 0; k < ady.length; k++){
      for (int i = 0; i < ady.length; i++){
         for (int j = 0; j < ady.length; j++){

            if ((ady[i][k] != Integer.MAX_VALUE)&&(ady[k][j] != Integer.MAX_VALUE)&&(Math.min(ady[i][j], ady[i][k] + ady[k][j]) != ady[i][j])){

				ady[i][j] = ady[i][k] + ady[k][j];
				resultado[i][j] = resultado[i][k];
            }
         }
      }
   }

System.out.print(" ");
for (int i = 0; i < MAXIMO_VERTICES; i++) {
System.out.printf("  %3d", i);
}
System.out.println();
for (int i = 0; i < MAXIMO_VERTICES; i++) {
System.out.printf(" %3d", i);
for (int j = 0; j < MAXIMO_VERTICES; j++) {
System.out.printf(" %3d", resultado[i][j]);
}
System.out.println();
}
      return resultado;
}*/

private int[][] floyd ()
{
 int [ ][ ]floyd = grafitoMatriz;

int n=grafitoMatriz.length;

try {

}

catch(Exception e){}

for (int k=0;k<=n-1;k++)

{

for (int i=0;i<=n-1;i++)

{for (int j=0;j<=n-1;j++)

if ((floyd[i][k]!=0)&&(floyd[k][j]!=0))

floyd[i][j]=funcionfloyd(floyd[i][j],floyd[i][k]+floyd[k][j]);}

}
return floyd;

}

private  int funcionfloyd(int A, int B)

{

if ((A==0)&&(B==0))

return 0;

else if (A==0)

return B;

else if (B==0)

return A;

else if (A>B)

return B;

else return A;

} 
public int llamadoFloyd(int origen,int destino)
{
    int retorno;
    int [][] data = floyd();
    retorno = data[origen][destino];
    return retorno;
}
}


    
    
 
