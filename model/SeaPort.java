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

public void addContainer(Container r1){

containers.add(r1);

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






















}
