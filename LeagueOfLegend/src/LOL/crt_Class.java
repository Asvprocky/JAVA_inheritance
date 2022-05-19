package LOL;
import java.util.Scanner;

public class crt_Class {




    private String Name;

    private int HP;

    public void setName(String n) {
        Name = n;
    }

    public String getName() {
        return Name;
    }

    public void PutName() {
        System.out.println("your name is :  " + Name);
    }

    public void setHP(int n) {
        HP = n;
    }

    public int getHP() {
        return HP;
    }

    public void putHP() {
        System.out.println("your hp id  :" + HP);
    }

}
