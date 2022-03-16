package Mechanic;

import Objects.Cartridge;
import Objects.Player;
import Objects.Word;

import javax.swing.*;
import java.awt.*;
import java.util.ConcurrentModificationException;

import static Mechanic.MainVariables.*;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintObject(new Color(0x0BE000), 0, heightOfFrame - 100, widthOfFrame, 10, "Rect", g);
        for (Player player : listOfPlayers) {
            paintObject(player.color, player.xOfObject, player.yOfObject, player.width, player.height, "Rect", g);
        }
        try {
            for (Cartridge cartridge : listOfCartridges) {
                paintObject(cartridge.color, cartridge.xOfObject, cartridge.yOfObject, cartridge.width, cartridge.height, "Rect", g);
            }
            for (Word word : listOfWords) {
                paintObject(word.color, word.xOfObject, word.yOfObject, word.width, word.height, "Oval", g);
                g.setColor(new Color(0));
                g.drawString(word.string, word.xOfObject, word.yOfObject);
            }
        } catch (ConcurrentModificationException ignored) { }
        for (int x = health; x > 0; x--) {
            paintObject(new Color(0xD80C00), x*100, heightOfFrame - 80, 80, 15, "Rect", g);
        }
    }

    private void paintObject(Color color, int x, int y, int w, int h, String shape, Graphics g) {
        g.setColor(color);
        switch (shape) {
            case "Rect":
                g.fillRect(x, y, w, h);
                break;
            case "Oval":
                g.fillOval(x, y, w, h);
                break;
        }
    }
}
