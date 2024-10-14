package tn.esprit.gestionZoo.entities;

public class Zoo {

  private   Animal[] animals;
    private String name ,city ;
    private int countAnimal;
    private static final int nbrCages =25;
    public  Zoo(){

    }
    public Zoo(String name,String city  ){

        this.animals = new Animal[nbrCages];
        if(!name.isEmpty())
        this.name=name;
        else
            this.name="Name zoo";
        this.city=city;

    }

    public void setName(String name){
        if(!name.isEmpty())
            this.name=name;

    }
    void displayZoo(){
        System.out.println("le nom "+this.name);
        System.out.println("city "+this.city);
        System.out.println("nbr Cages "+this.nbrCages);
    }

    public boolean addAnimal(Animal animal){
        if (!isZooFull()){
            if(this.searchAnimal(animal)==-1){
                //24
                this.animals[this.countAnimal]=animal;
                //24+1
                this.countAnimal++;
                return true;
            }
        }
return false;

    }
    public  int searchAnimal(Animal animal){
       for(int i=0;i<this.countAnimal;i++){
           if(this.animals[i].getName()== animal.getName()){
               return i;
           }
       }
        return  -1 ;
    }
    public  boolean removeAnimal(Animal animal){
        int index = this.searchAnimal(animal);

        if(index>-1){
            for(int i =index;i<this.countAnimal;i++){
                this.animals[i]=this.animals[i+1];

            }
            return true;
        }
        return false;
    }
    public boolean isZooFull(){
        return this.countAnimal>=nbrCages;
    }
    public static Zoo comperZoo(Zoo z1,Zoo z2 ){
    if (z1.countAnimal>z2.countAnimal){
        return z1;
    }
    return z2;
    }


    public String toString (){
        String str ="";

        for (int i =0 ;i<this.countAnimal;i++){
            str=str+this.animals[i];
        }


        return  "\nle nom "+this.name
                +"\ncity "+this.city
                +"\nnbr Cages "+this.nbrCages
                +"\n animals "+str;
    }
}
