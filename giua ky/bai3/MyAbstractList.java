package thicuoiky.bai3;

import java.util.AbstractList;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {

    }

    public boolean checkBoundaries(int index, int limit) {
        for (int i = 0; i <= limit; i++) {
            if (i == index) {
                return true;
            }
        }
        return false;
    }

    public String toString(int limit) {
        for(int i = 0; i < limit; i++) {
            
        }
        return null;
    }

}
