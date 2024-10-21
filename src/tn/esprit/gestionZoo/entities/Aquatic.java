package tn.esprit.gestionZoo.entities;

public abstract class Aquatic extends Animal {
private String habitat ;

public Aquatic(){

}
public Aquatic(String name ,String family,int age,boolean isMammel,String habitat ){

    super(name,family,age,isMammel);
    this.habitat=habitat;

}

public abstract void swim();
    @Override
    public String toString(){
    return super.toString()+"\n habitat "+this.habitat;
    }

}
