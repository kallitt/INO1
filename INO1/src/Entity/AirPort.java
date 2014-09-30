/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.List;

/**
 *
 * @author Kalit
 */
public class AirPort {
    
    private int id;
    private String name;
    private String city;
    
    private List<Arrival> arrival;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addArrival(Arrival a) {
        this.arrival.add(a);
    }
    
    public Arrival[] getArrivals()
    {
        return (Arrival[])this.arrival.toArray();
    }
}
