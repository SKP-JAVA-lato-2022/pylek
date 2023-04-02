import forest.Forest;

import java.awt.*;

public class Main {

    private static int CANVAS_SIZE = 1000;
    private static int TREES_TO_DRAW = 150000;
    private static int TREE_TYPES = 2;
    public static void main(String[] args) {
        Forest forest = new Forest();

        for(int i=0; i< Math.floor(TREES_TO_DRAW/TREE_TYPES); i++){
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "dąb letni",
                    Color.GREEN,"");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "dąb jesienny",
                    Color.ORANGE,"");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);


    }

    private static int random(int min, int max){
        return  min + (int)(Math.random()*(max-min+1));
    }
}