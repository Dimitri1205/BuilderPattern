package com.company;

import java.awt.*;

public class Bedroom {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color color;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Bedroom(Dimension dimension, int ceilingHeight, int floorNumber, Color color, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.color = color;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }
}
