package ui;
import model.*;
import java.util.*;

public class Main{


public static void main(String[] args) {

  Scanner reader = new Scanner(System.in);

  SeaPort s = new SeaPort("Camaron que se duerme", "Cra 29a #10b -119", "100031231", "32323232");

  s.addContainer("A00983123",120.0, 't',"apenas va a salir xdxd",true,12);
  s.addContainer("A00345678",320.0, 'a',"apenas va a salir xdxd", true,19);
  s.addContainer("A00123133",520.0, 'b', "apenas va a entrar xdxd", false,28);

  boolean exit = false;
  int userInput =0;



  while(!exit){

    System.out.println("Entrar");
    System.out.println("1.");
    System.out.println("2.");
    System.out.println("3. DAR LA CANTIDAD DE CONTENEDORES TIPO CISTERNA");
    System.out.println("4.MOSTRAR INFORMACION");
    System.out.println("5.SALIR");

    userInput = reader.nextInt();
    reader.nextLine();

	switch (userInput) {
    case(1):

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

  System.out.println("Digite los dias que piensa venir o los dias en los que se piensa ir");
  int days1 = reader.nextInt();
  reader.nextLine();

  s.addContainer(id1,weight1,type1,description1,arriving1,days1);
  break;

  case(2):

	  ArrayList<Container> contas1 = s.getOutputContainers();

	  for(int i = 0; i < contas1.size(); i++){

		  System.out.println("La lista de los que salen son:" + contas1.get(i).getId());

	  }

    break;

    case(3):

	  System.out.println("Estos son los que estan saliendo:" + s.requestTankContainerAmount());
    break;

    case(4):

	  System.out.println(s.infoContainerAndClient());

    break;

    case(5):
    exit = true;
	  System.out.println("Hasta luego, bye mi socio zolo milloz loka, F.R.V a morir, cali pachanguero, vamos a huelerrrrrrrrr");

    break;





}

}


}


}
