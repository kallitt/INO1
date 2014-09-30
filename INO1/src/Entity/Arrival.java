/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Kalit
 */
public class Arrival {
    private int id;
    private String number;
    private Plane plane;
    
    private AirPort fromPort;
    private AirPort toPort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public AirPort getFromPort() {
        return fromPort;
    }

    public void setFromPort(AirPort fromPort) {
        this.fromPort = fromPort;
    }

    public AirPort getToPort() {
        return toPort;
    }

    public void setToPort(AirPort toPort) {
        this.toPort = toPort;
    }
}
