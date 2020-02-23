package com.company;

import java.awt.*;

public class RoomBuilder {
    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color color;
    private int numberOfWindows;
    private int numberOfDoors;

    private RoomListBuilder roomListBuilder;

    public RoomBuilder() {}

    public RoomBuilder(RoomListBuilder roomListBuilder) {
        this.roomListBuilder = roomListBuilder;
    }

    public RoomBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public RoomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public RoomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public RoomBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public RoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public RoomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Room createRoom() {
        return new Room(dimension, ceilingHeight, floorNumber, color, numberOfWindows, numberOfDoors);
    }

    public RoomListBuilder addRoomToTheList () {
        Room room = createRoom();
        this.roomListBuilder.addRoom(room);
        return this.roomListBuilder;
    }
}