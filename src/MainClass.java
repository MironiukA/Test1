public class MainClass {
private int class_number =20;
private String class_string ="Hello, world";
    public int getLocalNumber() {
        return 14;
    }
    public int getClassNumber(){
        this.class_number = class_number;
        return class_number;
    }
    public String getClassString (){
        this.class_string=class_string;
        return class_string;
    }
}