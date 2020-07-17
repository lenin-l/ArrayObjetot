/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

/**
 *
 * @author Carrillo Imbaquingo Lenin Alexander
 */

class Ahorro_Scrap{

    public int peso;
    public int codigo;
    public String material_fundir;
    Ahorro_Scrap(int peso, int codigo, String material_fundir){
        this.peso=peso;
        this.material_fundir=material_fundir;
        this.codigo=codigo;
}
}
  public class Main{
           //@param args the command line arguments
   public static void main(String[] args) {
   System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
   System.out.println("\t    MATERIA DE PROGRAMACIÓN");
   System.out.println("\tCARRERA DE INGENIERÍA AUTOMOTRIZ");
   System.out.println("NOMBRE DEL ESTUDIANTE: LENIN CARRILLO");
              Ahorro_Scrap[] arreglo;
              arreglo=new Ahorro_Scrap[11];
             arreglo[0]=new Ahorro_Scrap(50, 1567, "Aluminio Puro");
             arreglo[1]=new Ahorro_Scrap(80, 5958,"Aluminio Con Aleación Cobre");
             arreglo[2]=new Ahorro_Scrap(45, 4887, "Aluminio Con Aleación Magnesio");
             arreglo[3]=new Ahorro_Scrap(52, 9878, "Aluminio Con Aleación Silício");
             arreglo[4]=new Ahorro_Scrap(63, 8958, "Aluminio Con Aleacion Zinc");
             arreglo[5]=new Ahorro_Scrap(29, 3898, "Aluminio Impuro");
             arreglo[6]=new Ahorro_Scrap(36, 3694, "Aluminio Puro");
             arreglo[7]=new Ahorro_Scrap(88, 4874, "Aluminio con Aleación Magnesio");
             arreglo[8]=new Ahorro_Scrap(79, 7898, "Auminio Aleación Silicio");
             arreglo[9]=new Ahorro_Scrap(41, 5987, "Aluminio Aleación Cobre");
             arreglo[10]=new Ahorro_Scrap(41, 8916, "Aluminio Aleacioón Zinc");
       
             for(int i=0;i<arreglo.length;i++)
            System.out.println("El ahorro de Scrap en el elemento de "+i+" tiene "
                    + "un disminución de "+arreglo[i].peso +" gramos "
                    + "\n Y el material es "+arreglo[i].material_fundir+ " y su "
                            + "código es "+arreglo[i].codigo + " " );
          }
  }
