/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.util.ArrayList;

/**
 *
 * @author alvar
 */
public class Team<T extends Players> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0; //Variables


    private ArrayList<T> members = new ArrayList<>(); //Array

    public Team(String name) {   //Metódo de team
        this.name = name;
    }

    public String getName() { //Getter
        return name;
    }

    public boolean addPlayer(T player) { //Metódo agregar player
        if (members.contains(player)) {  //
            System.out.println(player.getName() + " is already on this team"); //Si se ccntiene player se imprimer el nombre del player con leyenda de que está en el tem  y se regresa falso
            return false;
        } else {
            members.add(player); //si no se agreaga a members
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size(); //Metódo de numPlayers con una extensión size del array  se muestra el número de players
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) { //Recibe el team, con el escore del equipo principal y del equipo rival

        String message;

        if(ourScore > theirScore) {   //Si nuestro escore es mayor que el contrario ,ganó
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with "; //Si nuestro escore es igual que el del contrario ,empate

        } else {
            lost++;
            message = " lost to "; //Si nuestro escore es menor que el del contrario ,perdió
        }
        played++;
        if(opponent != null) { //Es para actualizar el del oponente  si es diferente de null entra estó para que no se gnere un ciclo infinito
            System.out.println(this.getName() + message + opponent.getName());//Se imprime  el nombre ,message y el del oponente
            opponent.matchResult(null, theirScore, ourScore);//Pero se cambia el orden de introducción de valores para actualizar el del oponente
        }
    }

    public int ranking() {
        return (won * 2) + tied; //El ranking 2 puntos por ganar más uno por empate
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) { //Se compara  el ranking  si es mayor se regresa un menos 1 para aumentar la posción 
            return -1; //debido a que el uno es el más alto
        } else if(this.ranking() < team.ranking()) { //Lo contrario
            return 1;
        } else {//Si no se compara nada se regresa 0 
            return 0;
        } 
    }
}

