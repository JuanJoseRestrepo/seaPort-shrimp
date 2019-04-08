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

public ArrayList<Container> getOutputContainers(){
	
	
	
}

public void addContainer(Container r1){

containers.add(r1);

}

public String infoContainerAndClient(){
	
	String msj = "";
	
	for(int k = 0; k < containers.size() ; i++){
		
		msj += containers.get(k).InfoContainer();
		msj += "El dinero total es:" + requestTankContainerAmount();
		
		
	}
	
	return msj;
	
}


public int requestTankContainerAmount(){

int moneyBoys = 0;

for(int i = 0; i < containers.size() ; i++){

	if(containers.get(i).getInput() == true){

	moneyBoys = (int) containers.get(i).calculatedCost();

	
		}else if(containers.get(i).getInput() == false){

		moneyBoys = (int)containers.get(i).calculatedCost();
	
		}
	  }


	return moneyBoys;
}

public String listOfTank(){
	
	String msj = "";
	msj = containers.size();
	for(int i = 0; i < containers.size();i++){
		
		if(containers.get(i).getType().equals(Container.TANKCONTAINER)){
			if(containers.get(i).getInput() == true){
			
			msj += containers.get(i).infoContainer();
			}
		}else{
			
			msj = "No existe ningún contenedor de tipo cisterna";
		}
		
		
		
		
	}
	
	
	
	
}






















}
