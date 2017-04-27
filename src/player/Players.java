
package player;




    /**
     * En esta se puden definir metodos y atributos,pero no objetos ,pero si se puede heredar 
     */
 public abstract class Players {  
    private String name; //Variable

    public Players(String name) { //Constructor
        this.name = name;
    }

    public String getName() { //Getter
        return name;
    }
}
   
    
