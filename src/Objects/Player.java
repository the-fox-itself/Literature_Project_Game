package Objects;

import java.awt.*;
import java.util.ArrayList;

public class Player extends GameObject {
    public Player(ArrayList<String> buttonR, ArrayList<String> buttonL, ArrayList<String> buttonJ, ArrayList<String> buttonS, Color c, int x, int y, int w, int h) {
        listOfButtonsRight = buttonR;
        listOfButtonsLeft = buttonL;
        listOfButtonsJump = buttonJ;
        listOfButtonsShoot = buttonS;
        color = c;
        xOfObject = x;
        yOfObject = y;
        width = w;
        height = h;
    }
    public Player() {}

    public ArrayList<String> listOfButtonsRight;
    public ArrayList<String> listOfButtonsLeft;
    public ArrayList<String> listOfButtonsJump;
    public ArrayList<String> listOfButtonsShoot;
    public ArrayList<Cartridge> listOfPlayerCartridges;

    public String direction = "";
}
