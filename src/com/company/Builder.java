package com.company;

import java.awt.*;

public interface Builder {
    Builder setDimension(Dimension dimension);

    Builder setCeilingHeight(int ceilingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setColor(Color color);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setNumberOfDoors(int numberOfDoors);
}
