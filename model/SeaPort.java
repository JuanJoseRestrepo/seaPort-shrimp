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

public void addContainer(String id1, double weight1, char type1, String description1, boolean arriving1, int days1, double cost1){

containers.add(id,weight,type,description,arriving,days,cost);

}






public int requestTankContainerAmount(){

int moneyBoys = 0;

for(int i = 0; i < containers.size() ; i++){

if(getInput() == true){

moneyBoys = containers.get(i).calculatedCost();


}else if(getInput() == false){

moneyBoys = containers.get(i).calculatedCost();

}




}





}






















}
