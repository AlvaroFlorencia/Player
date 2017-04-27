/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author alvar
 */
public class Main {
    public static void main (String [ ] args) {
 
       LeagueTable<Team<FootballPlayer>> footballLeague= new LeagueTable<>("Americans");
       Team<FootballPlayer> Tigres= new Team<>("Tigres");  
       Team<FootballPlayer> Patriots= new Team<>("Patriots");
       Team<FootballPlayer> Falcons= new Team<>("Falcons");   //Define diferentes equipos en una liga de football
       Team<FootballPlayer> UNAM= new Team<>("UNAM");
       Team<BaseBallPlayer> CruzVerde = new Team<>("CruzVerde");
        Tigres.matchResult(Patriots, 4, 3);
        Falcons.matchResult(UNAM, 2, 2);
        footballLeague.add(Tigres);
        footballLeague.add(Patriots);
        footballLeague.add(Falcons);
        footballLeague.add(CruzVerde); //Me manda el error de que no se puede agregar un equipo de Baseball en una liga de FootBall
                
 
        }
}
