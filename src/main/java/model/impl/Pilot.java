package model.impl;

import model.Operator;
import model.ControlTower;

public class Pilot implements Operator {
    private final ControlTower controlTower;
    private String id;

    public Pilot(ControlTower controlTower, String id) {
        this.controlTower = controlTower;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.id + " sent message: " + message);
        controlTower.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.id + " aircraft received message: " + message);
    }
}
