package com.company.evilnerd;

/**
 * Created by Sveta on 29.09.2017.
 */
public class Rick {
    private int day;
    private int month;
    private int year;

    public Rick(int d, int m, int y){
        day = d;
        month = m;
        year = y;
        System.out.printf("���� �������� ���� - %s\n", this);
    }
    public String toString(){
        return  String.format("%d/%d/%d", day, month, year);
    }
}
