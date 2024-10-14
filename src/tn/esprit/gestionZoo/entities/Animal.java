package tn.esprit.gestionZoo.entities;

public class Animal {
    private String name,family;
    private int age ;
    private boolean isMammel;


    public Animal(){

    }
    public Animal(String name ,String family,int age,boolean isMammel){
        this.name=name;
        if(age>=0)
            this.age=age;
        else
            this.age=0;
        this.family=family;
        this.isMammel=isMammel;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){

        if(age>=0)
        this.age=age;

    }

    public String toString (){
        return  "\nle nom "+this.name+"\nfamily "
                +this.family+"\nage"
                +this.age+"\nis Mammal"
                +this.isMammel;
    }
}
