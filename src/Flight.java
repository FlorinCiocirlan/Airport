import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Flight {
    private int id;
    private Languages language;
    private List<Pilot> pilotList=new ArrayList<>();
    private List<Attendant> attendantList=new ArrayList<>();

    public Flight(int id,Languages language) {
        this.id = id;
        this.language=language;
    }

    public void addAttendants(Attendant attendant){
            System.out.println("Se adauga insotitor de zbor pe numele " + attendant.getName() + " limba vorbita:" + attendant.getLanguage());
            attendantList.add(attendant);
    }
    public void addPilot(Pilot pilot){
        System.out.println("Se adauga pilot cu numele " + pilot.getName() + " cu rol de " + pilot.getRole());
        pilotList.add(pilot);
    }
    public boolean checkAttendantsLanguage(){
        boolean result = attendantList.stream().allMatch(attendant -> attendant.getLanguage() == language);
        System.out.println("We check Attendants language spoken -> Do they speak the flight's language ? " + result);
        return result;
    }
    public boolean checkPilotCompass(){
        boolean result = pilotList.stream().allMatch(pilot -> pilot.isCompass() == true);
        System.out.println("We check if pilots have their compass -> Do they have it ? " + result);
        return result;
    }
    public boolean checkPilotsRoles(){
        boolean result = (pilotList.stream().anyMatch(pilot -> pilot.getRole()==Roles.CO_PILOT) & (pilotList.stream().anyMatch(pilot -> pilot.getRole()==Roles.PILOT)));
        System.out.println("We check if we have a pilot and co-pilot on board -> Are they on board ? " + result);
        return result;

    }
    public boolean isFlightReady(){
        boolean result = checkAttendantsLanguage() & checkPilotCompass() & checkPilotsRoles();
        System.out.println("We check if the flight is ready -> Is the flight ready ? " + result);
        return result;
    }
}
