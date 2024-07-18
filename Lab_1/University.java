package Lab1;

public class University {


    String universityName;
    String universityLocation;

    public University(String universityLocation, String universityName){

        this.universityLocation = universityLocation;
        this.universityName = universityName;
    }

    public String getName(){
        return universityName;
    }
    public String getLoc(){
        return universityLocation;
    }
    public void Uni(String name){
        this.universityName = name;
    }
    public void Loc(String location){
        this.universityLocation = location;
    }

    public void printInfo(){
        System.out.println("University name: " + universityName);
        System.out.println("University location: "  + universityLocation);
    }
}
