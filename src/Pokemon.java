/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author adil3
 */
public interface Pokemon {
    void Attaque();
    void Defence();
}

public class Pikachu implements Pokemon
{
    @Override
    public void Attaque()
    {
        System.out.println("attaque eclair");
    }
    public void Defense(){
        System.out.println("defense eclair");
    }
    
    
    
    
}

public class Reshiram implements Pokemon{
    @Override
    public void Attaque(){
        System.out.println("Attaque dragon");
    }
    
     public static void main(String[] args) {
        Pokemon pokemon1 = new Reshiram();
        Pokemon pokemon2 = new Pikachu();

        pokemon1.Attaque();
        pokemon2.Attaque();
    }
}
    

