package ui;
import model.*;
import java.util.Scanner;

public class Main{


public static void main(String[] args) {

  Scanner reader = new Scanner(System.in);

  SeaPort s = new SeaPort("Camaron que se duerme", "Cra 29a #10b -119", "100031231", "32323232");

  System.out.println("Digite la identificacion ");
  String id1 = reader.nextLine();

  System.out.println("Digite el peso del contenedor");
  double weight1 = reader.nextDouble();
  reader.nextLine();

  System.out.println("Digite el tipo de contenedor que es:" + Container.TANKCONTAINER + "/" + Container.DRYVAN20 + "/" + Container.DRYVAN40);
  char type1 = reader.nextLine().charAt(0);

  System.out.println("Digite la descripcion");
  String description1 = reader.nextLine();

  System.out.println("Digite el si esta viniendo: F o si esta saliendo: V");
  boolean arriving1 = reader.nextBoolean();
  reader.nextLine();

  System.out.println("Digite los dias que esta el contenedor");
  int days1 = reader.nextInt();
  reader.nextLine();

  System.out.println("Digite el costo");
  double cost1 = reader.nextDouble();
  reader.nextLine();

  Container r1 = new Container(id1,weight1,type1,description1,arriving1,days1,cost1);

  s.addContainer(r1);









}




}
