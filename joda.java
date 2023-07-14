import java.util.Scanner;

public class Joda{
 public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

System.out.println("Welcome to The Coca Cola Company");

  System.out.println("Cual es tu nombre");
   nombre = in.nextLine();
  System.out.println("indique los años de antiguedad");
   antiguedad = in.nextInt();
  System.out.println("A continuacion, Indique el numero de clave, por favor");
   clave = in.nextInt();
  

   if (clave == 1){ if  ( antiguedad == 1) {
System.out.println("Le corresponde un total de 6 dias de vacaciones");} else if  ( antiguedad >= 2 && antiguedad  <=6) {
System.out.println("Le corresponde un total de 14 dias de vacaciones");} else if  ( antiguedad >7) {
System.out.println("Le corresponde un total de 20 dias de vacaciones");} else System.out.println("No le corresponden vacaciones, si cree que se trata de un error, reinicie el sistema e intente nuevamente.");
   } else if (clave == 2){ if  ( antiguedad == 1) {
System.out.println("Le corresponde un total de 7 dias de vacaciones");} else if  ( antiguedad >= 2 && antiguedad  <=6) {
System.out.println("Le corresponde un total de 15 dias de vacaciones");} else if  ( antiguedad >7) {
System.out.println("Le corresponde un total de 22 dias de vacaciones");} else System.out.println("No le corresponden vacaciones, si cree que se trata de un error, reinicie el sistema e intente nuevamente.");

   } else if (clave == 3){ if  ( antiguedad == 1) {
System.out.println("Le corresponde un total de 10 dias de vacaciones");} else if  ( antiguedad >= 2 && antiguedad  <=6) {
System.out.println("Le corresponde un total de 20 dias de vacaciones");} else if  ( antiguedad >7) {
System.out.println("Le corresponde un total de 30 dias de vacaciones");} else System.out.println("No le corresponden vacaciones, si cree que se trata de un error, reinicie el sistema e intente nuevamente.");

   } else
  System.out.println("Ese numero de clave no se encuentra cargado en nuestro sistema, reinicie el sistema e intente nuevamente, gracias");
 }
}