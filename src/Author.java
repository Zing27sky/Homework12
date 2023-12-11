public class Author {
    public String name;
    public String surname;

     Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
         return this.name;
    }
    public String getSurname(){
         return this.surname;
    }
    public String toString(){
         return this.name + " " + this.surname;
    }


}
