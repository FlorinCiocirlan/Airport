public class Pilot extends Employee{
    private Roles role;
    private boolean compass;
    public Pilot(String name, String birthdate , Roles role, boolean compass){
        super(name,birthdate);
        this.role=role;
        this.compass=compass;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public boolean isCompass() {
        return compass;
    }

    public void setCompass(boolean compass) {
        this.compass = compass;
    }
}
