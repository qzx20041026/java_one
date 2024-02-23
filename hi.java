import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.StringJoiner;

public class hi {
    public static void main(String[] args) {
    Dog hsq=new hashiqi();
    Dog sp=new shapi();
    Dog cd=new ChineseDog();
    hsq.setAge(8);
    sp.setAge(2);
    cd.setAge(1);
    show(hsq);
    show(sp);
    show(cd);

    }
    public static void show(Dog a){
        a.show();
    }
}



