package com.company.evilnerd;

/**
 * Created by Sveta on 29.09.2017.
 */
public class Fry {
    private String name;
    private  Rick bd;

    public Fry(String n, Rick bday){
        name = n;
        bd = bday;
    }
    public String toString(){
        return String.format("Меня зовут %s, я родился - %s!!!", name, bd);
    }
}
