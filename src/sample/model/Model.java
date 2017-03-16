package sample.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Model {
    public static final int SIZE = 4;
    public static final int DIMENSION = 2;
    /*
    public void switchButtons(int indexButtonPressed, int indexHole, ArrayList<ImageView> imageViewList, ArrayList<Image> imageList) {

    }
    */

    public boolean canMove(int indexButtonPressed, int indexHole) {
        if (indexButtonPressed < 0 || indexButtonPressed >= SIZE) {
            return false;                                   // No such position
        }
        int diff = indexHole - indexButtonPressed;
        if (diff == -1) {                                   // Slide tile left (hole goes right)
            return indexButtonPressed % DIMENSION != 0;     // ... unless tile is on left edge
        } else if (diff == +1) {                            // Slide tile right (hole goes left)
            return indexHole % DIMENSION != 0;              // ... unless hole is on left edge
        } else {
            return Math.abs(diff) == DIMENSION;             // Slide vertically
        }
    }

    public int getIndexHole(ArrayList<ImageView> imageViewList, ArrayList<Image> imageList) {
        for (int i=0 ; i < 4 ; i++) {
            ImageView imageViewOnIndexI = imageViewList.get(i);
            Image emptyImg = imageList.get(3);
            if(imageViewOnIndexI.getImage().equals(emptyImg)) {
                return i;
            }
        }
        return -5;
    }
}
