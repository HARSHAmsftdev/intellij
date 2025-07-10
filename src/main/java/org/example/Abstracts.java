package org.example;

import java.security.spec.RSAOtherPrimeInfo;

abstract class A{
    public abstract void sound();
    public void use() {
        System.out.println("this is not abstract method");
    }
    private void name(){
        System.out.println();
    }

}
class B extends A{
    public void sound(){
        System.out.println("Hi");
    }
    public void use(){
        System.out.println("use from the b");
    }

}
public class Abstracts {
    public static  void main(String[] args) {
        A obj = new B();
        A obj1 =new AImpl();
        obj.sound();
        obj1.sound();
        obj.use();
        A obj2 = obj1;
        obj2.use();
        obj1.use();

    }
}
