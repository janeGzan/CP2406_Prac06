public class Horse {
    String name;
    String color;
    String birth;

    Horse(String inputName, String inputColor, String inputBirth){
        this.name = inputName;
        this.color = inputColor;
        this.birth =inputBirth;
    }
    public String displayInfo(){ return this.name + " is color " + this.color + ", born in " + this.birth;}
}
