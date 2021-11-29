package com.company;

public class Human implements Capable_for_combat{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void can_fight() {
        System.out.println("I can fight");
    }

    @Override
    public void can_report() {
        System.out.println("I can report");
    }
}
