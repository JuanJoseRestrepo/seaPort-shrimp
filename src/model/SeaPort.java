package model;
import java.util.ArrayList;

public class SeaPort{

//Atributos
private String companyName;
private String address;
private String phone;
private String nit;

//Relaciones
private ArrayList<Container> containers;


public SeaPort(String companyName,String addres, String phone, String nit){

this.companyName = companyName;
this.address = address;
this.phone = phone;
this.nit = nit;
containers = new ArrayList<Container>();
}

/*
*Este metodo va a generar una lista de los contenedores que van a salir del puerto

@return retorna una lista de tipo ArrayList de tipo contenedor

**/
public ArrayList<Container> getOutputContainers(){

	ArrayList<Container> c = new ArrayList<Container>();

	for(int i = 0; i < containers.size(); i++){

		if(containers.get(i).getInput() == true){
				c.add(containers.get(i));

		}

	}

	return c;
}


/*
*Este metodo va a agregar los contenedores en el arraylist de containers


@Param recibe la identificacion del contenedor
@Param recibe el peso de la contenedora
@Param recibe el tipo de contenedor
@Param recibe la descripcion del contenedor
@Param recibe el arriving del contenedor
@Param recibe los dias del contenedor en el muelle

**/
public void addContainer(String id1, double weight1, char type1, String description1, boolean arriving1, int days1){

Container r1 = new Container(id1,weight1,type1,description1,arriving1,days1);

containers.add(r1);
}


/*
*Este metodo va a mostrar la informacion del usuario

@return un string que muestra la informacion

**/

public String infoContainerAndClient(){

	String msj = "";

	for(int k = 0; k < containers.size() ; k++){

		msj += containers.get(k).InfoContainer();
		msj += "Las veces que se solicita el cantidad:" + requestTankContainerAmount();


	}

	return msj;

}

/*
*Este metodo va a contar la cantidad de contenedores de tipo cistenera

@return retorna la cantidad de contenedores tipo int


**/

public int requestTankContainerAmount(){

	int k = 0;

	for(int i = 0; i < containers.size();i++){

		if(containers.get(i).getType() == Container.TANKCONTAINER && containers.get(i).getInput() == true){
			++k;
			}
		}
		return k;
	}




}
