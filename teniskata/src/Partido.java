/**  
   * Clase donde se van anotando los tantos e imprimiendo los resultados  
   */ 
public class Partido{ 
    public static void main(String args[]){ 
        Marcador marcador = new Marcador(); 
         
        while(!marcador.isTerminado()){ 
            /* Elige aleatoriamente quién anota el punto */ 
            if(((int)(Math.random()*10))%2==0) marcador.actualiza(false);  
            else marcador.actualiza(true); 
             
            System.out.println(marcador+"\n"); // Imprime el marcador 
        } 
         
        System.out.println("\n\n El ganador es: " + marcador.quienGana()); 
    }    
} 

