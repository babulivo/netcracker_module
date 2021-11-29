package com.company;

public class Commander extends Human{
    //private int squad;
    private int soldierNum;
    private Soldier[] soldiers = new Soldier[3];

    public Commander(String name, int age) {
        super(name, age);
    }

    public void addSoldier(Soldier soldier) {
        if (soldier == null) {
            throw new IllegalArgumentException("Soldier must not be null");
        }

        if(soldierNum < 3) {
            soldiers[soldierNum] = soldier;
            ++soldierNum;
        }
    }
}
