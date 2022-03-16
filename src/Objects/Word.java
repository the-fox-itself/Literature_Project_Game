package Objects;

import java.awt.*;

public class Word extends GameObject {
    public Word(String s, Color c, boolean isT, int x, int y, int w, int h) {
        string = s;
        color = c;
        isTrue = isT;
        xOfObject = x;
        yOfObject = y;
        width = w;
        height = h;
    }

    public String string;
    public boolean isSelected = false;
    public boolean isTrue;
}
