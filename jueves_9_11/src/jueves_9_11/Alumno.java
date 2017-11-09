
package jueves_9_11;

import java.util.Random;


public class Alumno {
     private int nota1=0;
     private int nota2=0;
     private float notaFinal;
     
     String apellido;
     int legajo;
     String nombre;
     public Alumno(String nombre,String apellido,int legajo){
         this.apellido=apellido;
         this.legajo=legajo;
         this.nombre=nombre;
     }
     
     public void cacularFinal(){
         if(this.nota1<4 && this.nota2<4){
             Random alt = new Random();
             this.notaFinal=alt.nextInt(10);
             }else
             this.notaFinal=-1;
             
     }
     public void Estudiar(int notaUno,int notaDos){
         this.nota1=notaUno;
         this.nota2=notaDos;
     }
     public void Mostrar(){
         System.out.println(nombre+" "+apellido+" "+legajo+" ");
         if(notaFinal!= -1){
             System.out.print(this.notaFinal);   
         }
                 
         
     }
}
