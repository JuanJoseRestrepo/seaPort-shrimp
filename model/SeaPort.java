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
	
	ArrayList<Container> c = new ArrayList<Container>();
	
	for(int i = 0; i < containers.size(); i++){
		
		if(containers.get(i).getInput() == true){
				c.add(containers.get(i));
			
		}
		
	}
	
	return c;
}

public void addContainer(Container r1){

containers.add(r1);
}

public String infoContainerAndClient(){
	
	String msj = "";
	
	for(int k = 0; k < containers.size() ; k++){
		
		msj += containers.get(k).InfoContainer();
		msj += "Las veces que se solicita el cantidad:" + requestTankContainerAmount();
		
		
	}
	
	return msj;
	
}

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



