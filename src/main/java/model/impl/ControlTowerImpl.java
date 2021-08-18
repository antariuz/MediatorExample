package model.impl;

import model.Operator;
import model.ControlTower;

import java.util.ArrayList;
import java.util.List;

public class ControlTowerImpl implements ControlTower {
    private Operator flightOperator;
    private final List<Operator> operators = new ArrayList<>();

    public void setAircraft(Operator flightOperator) {
        this.flightOperator = flightOperator;
    }

    public void addAircraftToControlTower(Operator operator) {
        this.operators.add(operator);
    }

    @Override
    public void sendMessage(String message, Operator operator) {
        if (flightOperator.equals(operator)){
            for (Operator air : operators)
                if (air != operator) {
                    air.receiveMessage(message);
                }
            System.out.println("---------------------------------");

        } else {
            flightOperator.receiveMessage(message);
        }


    }
}
