/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.util.ArrayList;
import java.util.Collections;


public class LeagueTable<T extends Team> {  //Extiende de Team
     private String name;
    


    private ArrayList<T> league = new ArrayList<>(); //ArrayList de teams pero con el t debido a que pone la regla de que sean del mismo tipo

    public LeagueTable(String name) { //Constructor
        this.name = name;
    }

    public String getName() { //getter
        return name; 
    }

   public boolean add(T team){
       if(league.contains(team)){ // Para añadir un team se verifica si en la liga se contiene ese tema si si se regresa falso
          
           return false;
       }
       league.add(team); //Si no se añade a la liga
       return true;

    
    }
   public void showLeagueTable()
   {
       Collections.sort(league);  //Para mostrar la tabla  se utiliza sort para que los acomode menor a mayor
       for(T t: league) //Se recorre el arreglo y se va imprimiedno el ranking de cada equipo junto con su nombre
       {
           System.out.println(t.getName()+":"+t.ranking());
       } 
       
   }
    
}
