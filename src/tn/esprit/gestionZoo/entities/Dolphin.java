package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{

    private float swimmingspeed ;

    public Dolphin(){}
    public Dolphin(String name ,String family,int age,boolean isMammel,String habitat,float swimmingspeed){

        super(name,family,age,isMammel,habitat);
        this.swimmingspeed = swimmingspeed;

    }
    public void swim(){
        System.out.println("This Dolphin animal is swimming");
    }
    @Override
    public String toString(){
        return super.toString()+"\n swimmingspeed "+this.swimmingspeed;
    }
}
