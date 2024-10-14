package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Animal;
import tn.esprit.gestionZoo.entities.Zoo;


public class ZooManagement {

    public static void main(String[] args) {
       Animal lion = new Animal("symba","CATS",5,true);
       Zoo myzoo = new Zoo("MyZoo","Tunis");



     //   System.out.println(myzoo.toString());

        System.out.println(myzoo.addAnimal(lion));
        System.out.println(myzoo.addAnimal(lion));
        System.out.println(myzoo.addAnimal(lion));
        System.out.println(myzoo.addAnimal(lion));
     //   System.out.println(myzoo.toString());


        System.out.println(myzoo.searchAnimal(lion));

        System.out.println(myzoo.searchAnimal(new Animal("symba","",20,false)));


    }

}
