import model.Operator;
import model.impl.Pilot;
import model.impl.ControlTowerImpl;
import model.impl.FlightOperator;

public class MediatorExample {
    public static void main(String[] args) {
        ControlTowerImpl controlTower = new ControlTowerImpl();

        Operator flightOperator = new FlightOperator(controlTower,"Operator");
        Operator aircraft1 = new Pilot(controlTower,"E045");
        Operator aircraft2 = new Pilot(controlTower,"W067");

        controlTower.setAircraft(flightOperator);
        controlTower.addAircraftToControlTower(aircraft1);
        controlTower.addAircraftToControlTower(aircraft2);

        flightOperator.sendMessage("Stand by...");
        aircraft1.sendMessage("E045... Requesting landing...");

    }
}
