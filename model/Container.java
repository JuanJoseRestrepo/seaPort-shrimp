package model;


public class Container{

//Constantes

private final static char TANKCONTAINER = 't';
private final static char DRYVAN20  = 'a';
private final static char DRYVAN40 = 'b';
private final static double BASECOST = 2000000;
private final static double DAYCOSTBYARRIVING = 100000;
private final static double DAYCOSTBYLEAVING = 150000;

//Atributos

private String id;
private double weight;
private char type;
private String description;
private double arriving;
private int days;
private double cost;

//Constructor
public Container(String id, double weight,char type, String description,boolean arriving, int days, double cost){

this.id = id;
this.weight = weight;
this.type = type;
this.description = description;
this.arriving = arriving;
this.days = days;
this.cost = cost;

}


//VERDADERO SI SALE, FALSO SI ENTRA
public double calculatedCost(){

double costOfThis = 0.0;

if(arriving == true){

costOfThis = (BASECOST * weight) + (days * DAYCOSTBYLEAVING);

}else if(arriving == false){
  costOfThis = (days * DAYCOSTBYLEAVING);
}

return costOfThis;

}

public double getWeight(){
  return weight;
}

public boolean getInput(){
  return arriving;
}
public int getDays(){
  return days;
}
public char getType(){
  return type;
}








}
