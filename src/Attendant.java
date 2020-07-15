public class Attendant extends Employee{
    private Languages language;
    public Attendant(String birthdate, String name,Languages language) {
        super(birthdate, name);
        this.language=language;
    }
    public Languages getLanguage(){
        return language;
    }

}
