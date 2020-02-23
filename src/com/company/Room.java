package com.company;

import java.awt.*;

public class Room {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color color;
    private int numberOfWindows;
    private int numberOfDoors;

    public Room(Dimension dimension, int ceilingHeight, int floorNumber, Color color, int numberOfWindows, int numberOfDoors) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.color = color;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }
}
