package com.company;

public class General extends Human{
    //private int squad;
    private int commanderNum;
    private Commander[] commanders = new Commander[2];

    public General(String name, int age) {
        super(name, age);
    }

    public void addCommander(Commander commander) {
        if (commander == null) {
            throw new IllegalArgumentException("Commander must not be null");
        }

        if(commanderNum < 3) {
            commanders[commanderNum] = commander;
            ++commanderNum;
        }
    }
}
