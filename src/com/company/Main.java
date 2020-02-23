package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
        Bedroom bedroom = new Bedroom(new Dimension(200, 100), 132, 2,Color.BLUE, 2, 1, true, true);
        */

        Bedroom bedroom = new BedroomBuilder()
                                            .setDimension(new Dimension(200, 100))
                                            .setCeilingHeight(132)
                                            .setFloorNumber(2)
                                            .setColor(Color.BLUE)
                                            .setNumberOfWindows(2)
                                            .setNumberOfDoors(1)
                                            .setIsDouble(true)
                                            .setHasEnsuite(true)
                                            .createBedroom();


        Room room0 = new RoomBuilder().setCeilingHeight(150).setColor(Color.ORANGE)
                .setDimension(new Dimension(200, 200))
                .setNumberOfDoors(1).setNumberOfWindows(2).createRoom();

        Room room1 = new RoomBuilder().setCeilingHeight(150).setColor(Color.BLUE)
                .setDimension(new Dimension(300, 200))
                .setNumberOfDoors(1).setNumberOfWindows(3).createRoom();

        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room0);
        roomList.add(room1);

        House house0 = new House(roomList);



       ////////

        ArrayList<Room> rooms = new RoomListBuilder().addList()
                .addRoom().setColor(Color.BLUE).setDimension(new Dimension(100, 100)).addRoomToTheList()
                .addRoom().setColor(Color.YELLOW).setCeilingHeight(120).addRoomToTheList()
                .addRoom().setCeilingHeight(120).setFloorNumber(1).setColor(Color.gray).addRoomToTheList()
                .buildList();

        House house1 = new House(rooms);



    }
}
