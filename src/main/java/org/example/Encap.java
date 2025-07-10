package org.example;

import org.w3c.dom.ls.LSOutput;

class D{
    private int id=5;
    public String name ="harsha";
    protected String password = "12345678";
    static String Nation = "Indian";
    public void show(){
        System.out.println(id);
        System.out.println(password);
    }
}

class E extends D{
    D obj = new D();
    public void shows(){
        System.out.println(obj.name);
        System.out.println(obj.password);
    }
}
class F{
    D obj2 = new D();
    public void display(){
        System.out.println(obj2.name + " " + obj2.password);
    }

}

public class Encap  {
    public static void main(String[] args) {
        D obj = new D();
        System.out.println( obj.name + " " + obj.password + " " + D.Nation + " " + obj.Nation);
        obj.show();
        E obj1 =new E();
        obj1.shows();
        F o = new F();
        o.display();
    }
}
