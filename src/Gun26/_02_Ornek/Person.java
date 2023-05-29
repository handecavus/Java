package Gun26._02_Ornek;

public class Person {
    String name;
    String surName;
    int age;

    public void BilgiYazdir(){

        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("age = " + age);
    }

    public String toString(){
        return name+" "+surName+" "+age;
    }

    public void getBirthYear(){
        System.out.println("doğum yılınız = " + (2022-age));
    }

    public String getBirthYear2(){

       return "doğum yılınız = " + (2022-age);
    }

    public void getInitials(){
        System.out.println(
               name.toUpperCase().charAt(0)+"."+
               surName.toUpperCase().charAt(0)+".");
    }

    public String getInitials2(){
        return name.toUpperCase().charAt(0)+"."+
               surName.toUpperCase().charAt(0)+".";

    }
}
