/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ino;

import Entity.*;


/**
 *
 * @author Kalit
 */
public class INO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        AirPort airPortGdansk = new AirPort();
        airPortGdansk.setId(1);
        airPortGdansk.setCity("Gdansk");
        
        AirPort airPortWarszawa = new AirPort();
        airPortWarszawa.setId(1);
        airPortWarszawa.setCity("Warszawa");
        
        
        Plane planeOne = new Plane();
        planeOne.setId(1);
        planeOne.setName("Samolot 1");
        planeOne.setNumber("RAWR-666-1");
        
        Plane planeTwo = new Plane();
        planeTwo.setId(1);
        planeTwo.setName("Samolot 2");
        planeTwo.setNumber("RAWR-666-2");
        
        Arrival arrivalOne = new Arrival();
        arrivalOne.setFromPort(airPortGdansk);
        arrivalOne.setToPort(airPortWarszawa);
    }
    
}
