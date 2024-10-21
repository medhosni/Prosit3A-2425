package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animal{
    private int nbrLegs ;

    public Terrestrial(){

    }
    public Terrestrial(String name ,String family,int age,boolean isMammel,int nbrLegs){
        super(name,family,age,isMammel);
        this.nbrLegs=nbrLegs;
    }

    @Override
    public String toString(){
        return super.toString()+"\n nbrLegs "+this.nbrLegs;
    }
}
