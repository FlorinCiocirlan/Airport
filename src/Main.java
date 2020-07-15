public class Main {
    public static void main(String[] args) {
        Attendant at1 = new Attendant("02/02/1998","Florin Ciocirlan",Languages.ENGLISH);
        Attendant at2 = new Attendant("02/02/1991","Izabela Ogrezeanu",Languages.FRENCH);
        Attendant at3 = new Attendant("02/02/1990","Mitica Dragomir",Languages.GERMAN);
        Attendant at4 = new Attendant("02/02/1990","Costel Trandafir",Languages.GERMAN);
        Attendant at5 = new Attendant("02/02/1990","Gicu Grozav",Languages.GERMAN);
        Attendant at6 = new Attendant("02/02/1990","Ghita Muresan",Languages.ENGLISH);
        Pilot p1 = new Pilot("02/02/1998","Costica Gelu", Roles.CO_PILOT,true);
        Pilot p2 = new Pilot("02/02/1998","Gelu Popoviciu", Roles.PILOT,true);
        Flight flight = new Flight(2,Languages.GERMAN);
        flight.addAttendants(at2    );
        flight.addAttendants(at4);
        flight.addAttendants(at5);
        flight.addPilot(p1);
        flight.addPilot(p2);
        flight.isFlightReady();
    }
}
