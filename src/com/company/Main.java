package com.company;

public class Main {

    public static void main(String[] args) {
        Human[] headquarters = new Human[9];

        Soldier soldier1 = new Soldier("Adam", 19);
        headquarters[0] = soldier1;
        Soldier soldier2 = new Soldier("Robert", 20);
        headquarters[1] = soldier2;
        Soldier soldier3 = new Soldier("Pablo", 26);
        headquarters[2] = soldier3;
        Soldier soldier4 = new Soldier("Bob", 18);
        headquarters[3] = soldier4;
        Soldier soldier5 = new Soldier("Chris", 21);
        headquarters[4] = soldier5;
        Soldier soldier6 = new Soldier("Tom", 22);
        headquarters[5] = soldier6;

        Commander commander1 = new Commander("Jerry", 38);
        commander1.addSoldier(soldier1);
        commander1.addSoldier(soldier2);
        commander1.addSoldier(soldier3);
        headquarters[6] = commander1;

        Commander commander2 = new Commander("Elon", 41);
        commander2.addSoldier(soldier4);
        commander2.addSoldier(soldier5);
        commander2.addSoldier(soldier6);
        headquarters[7] = commander2;

        General general = new General("Isaac", 62);
        general.addCommander(commander1);
        general.addCommander(commander2);
        headquarters[8] = general;

        for (int i = 0; i < 9; i++) {
            System.out.println(headquarters[i].getName());
            System.out.println(headquarters[i].getAge());
            headquarters[i].can_fight();
            headquarters[i].can_report();
            System.out.println();
        }
    }
}
