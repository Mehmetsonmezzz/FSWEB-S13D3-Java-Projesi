package Workintech;

public class person {
    public String firstName;
    public String lastName;
    public int age;
    public String favoriteColor;
    public String favoriteCar;
    public String email;


    public person(String favoriteColor,String favoriteCar,String email){
        this.favoriteColor=favoriteColor;
        this.favoriteCar=favoriteCar;
        this.email=email;
    }

    public person(String firstName, String lastName, int age) {
        this("","","");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
    public int getAge(){
        return age;
    }
    
}
