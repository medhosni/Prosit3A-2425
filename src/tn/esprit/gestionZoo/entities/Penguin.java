package tn.esprit.gestionZoo.entities;

public class Penguin extends  Aquatic{

    private float swimmingdepth ;

    public Penguin(){}

    @Override
    public void swim() {
        System.out.println("This Penguin animal is swimming");
    }

    public Penguin(String name ,String family,int age,boolean isMammel,String habitat,float swimmingdepth){

        super(name,family,age,isMammel,habitat);
        this.swimmingdepth = swimmingdepth;

    }
    @Override
    public String toString(){
        return super.toString()+"\n swimmingdepth "+this.swimmingdepth;
    }

}
