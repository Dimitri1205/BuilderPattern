package com.company;

import java.awt.*;

public class BedroomBuilder implements Builder {
    private Dimension dimension;
    private int ceilingHeight;  
    private int floorNumber;
    private Color color;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;


    @Override
    public BedroomBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }


    @Override
    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }


    @Override
    public BedroomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }


    @Override
    public BedroomBuilder setColor(Color color) {
        this.color = color;
        return this;
    }


    @Override
    public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }


    @Override
    public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public BedroomBuilder setIsDouble(boolean isDouble) {
        this.isDouble = isDouble;
        return this;
    }

    public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
        this.hasEnsuite = hasEnsuite;
        return this;
    }

    public Bedroom createBedroom() {
        return new Bedroom(dimension, ceilingHeight, floorNumber, color, numberOfWindows, numberOfDoors, isDouble, hasEnsuite);
    }
}