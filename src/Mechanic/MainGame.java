package Mechanic;

import Objects.Cartridge;
import Objects.GameObject;
import Objects.Player;
import Objects.Word;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

import static Mechanic.MainVariables.*;

class MainGame {
    void prePreparation() {
        mainFrame.setSize(widthOfFrame, heightOfFrame);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(null);

        mainFrame.add(buttonStart);
        buttonStart.setBounds(widthOfFrame/2-400, heightOfFrame/3*2, 800, 120);
        buttonStart.setFont(f80);
        buttonStart.addActionListener(new Start());
        buttonStart.setVisible(false);

        mainFrame.add(labelWelcome);
        labelWelcome.setBounds(widthOfFrame/2-700, heightOfFrame/5-100, 1400, 100);
        labelWelcome.setFont(f80);
        labelWelcome.setVisible(false);

        mainFrame.add(labelProject);
        labelProject.setBounds(widthOfFrame/2-700, heightOfFrame/3, 1400, 20);
        labelProject.setFont(f20);
        labelProject.setVisible(false);
        mainFrame.add(labelProjectType);
        labelProjectType.setBounds(widthOfFrame/2-650, heightOfFrame/3+40, 1400, 20);
        labelProjectType.setFont(f20);
        labelProjectType.setVisible(false);
        mainFrame.add(labelAuthor);
        labelAuthor.setBounds(widthOfFrame/2-650, heightOfFrame/3+120, 1400, 20);
        labelAuthor.setFont(f20);
        labelAuthor.setVisible(false);

        mainFrame.add(labelRules);
        labelRules.setBounds(widthOfFrame/2+200, heightOfFrame/3-80, 1400, 20);
        labelRules.setFont(f20);
        labelRules.setVisible(false);
        mainFrame.add(labelRules1);
        labelRules1.setBounds(widthOfFrame/2+150, heightOfFrame/3-40, 1400, 20);
        labelRules1.setFont(f20);
        labelRules1.setVisible(false);
        mainFrame.add(labelRules2);
        labelRules2.setBounds(widthOfFrame/2+150, heightOfFrame/3, 1400, 20);
        labelRules2.setFont(f20);
        labelRules2.setVisible(false);
        mainFrame.add(labelRules3);
        labelRules3.setBounds(widthOfFrame/2+150, heightOfFrame/3+40, 1400, 20);
        labelRules3.setFont(f20);
        labelRules3.setVisible(false);
        mainFrame.add(labelRules4);
        labelRules4.setBounds(widthOfFrame/2+150, heightOfFrame/3+80, 1400, 20);
        labelRules4.setFont(f20);
        labelRules4.setVisible(false);
        mainFrame.add(labelRules5);
        labelRules5.setBounds(widthOfFrame/2+150, heightOfFrame/3+120, 1400, 20);
        labelRules5.setFont(f20);
        labelRules5.setVisible(false);
        mainFrame.add(labelRules6);
        labelRules6.setBounds(widthOfFrame/2+150, heightOfFrame/3+160, 1400, 20);
        labelRules6.setFont(f20);
        labelRules6.setVisible(false);

        mainFrame.add(labelStart);
        labelStart.setBounds(widthOfFrame/3, heightOfFrame/3+240, 1400, 30);
        labelStart.setFont(f30);
        labelStart.setVisible(false);

        mainFrame.add(labelItIsYou);
        labelItIsYou.setBounds(widthOfFrame/5-300, heightOfFrame/2+300, 1400, 30);
        labelItIsYou.setFont(f20);
        labelItIsYou.setVisible(false);

        mainFrame.add(labelGameGoal);
        labelGameGoal.setBounds(widthOfFrame/2-600, heightOfFrame/3-100, 1400, 20);
        labelGameGoal.setFont(f20);
        labelGameGoal.setVisible(false);

        mainFrame.add(labelRulesGame);
        labelRulesGame.setBounds(widthOfFrame/2-750, heightOfFrame/3-60, 1400, 30);
        labelRulesGame.setFont(f20);
        labelRulesGame.setVisible(false);

        mainFrame.add(labelRulesGame1);
        labelRulesGame1.setBounds(widthOfFrame/2-750, heightOfFrame/3-20, 1400, 30);
        labelRulesGame1.setFont(f20);
        labelRulesGame1.setVisible(false);

        mainFrame.add(labelRulesGame2);
        labelRulesGame2.setBounds(widthOfFrame/2-750, heightOfFrame/3+20, 1400, 30);
        labelRulesGame2.setFont(f20);
        labelRulesGame2.setVisible(false);

        mainFrame.add(labelRulesGame3);
        labelRulesGame3.setBounds(widthOfFrame/2-750, heightOfFrame/3+60, 1400, 30);
        labelRulesGame3.setFont(f20);
        labelRulesGame3.setVisible(false);

        mainFrame.add(labelRulesGame4);
        labelRulesGame4.setBounds(widthOfFrame/2-750, heightOfFrame/3+100, 1400, 30);
        labelRulesGame4.setFont(f20);
        labelRulesGame4.setVisible(false);

        mainFrame.add(labelRulesGame5);
        labelRulesGame5.setBounds(widthOfFrame/2-750, heightOfFrame/3+140, 1400, 30);
        labelRulesGame5.setFont(f20);
        labelRulesGame5.setVisible(false);

        mainFrame.add(labelRulesGame6);
        labelRulesGame6.setBounds(widthOfFrame/2-750, heightOfFrame/3+180, 1400, 30);
        labelRulesGame6.setFont(f20);
        labelRulesGame6.setVisible(false);

        mainFrame.add(labelOver);
        labelOver.setFont(f80);
        labelOver.setVisible(false);
        mainFrame.add(buttonAgain);
        buttonAgain.setBounds(widthOfFrame/3, heightOfFrame/2+100, 500, 70);
        buttonAgain.setFont(f30);
        buttonAgain.addActionListener(new StartAgain());
        buttonAgain.setVisible(false);

        mainFrame.add(labelStart1);
        labelStart1.setBounds(widthOfFrame/3, heightOfFrame/2+200, 1400, 30);
        labelStart1.setFont(f30);
        labelStart1.setVisible(false);

        mainFrame.add(labelPause);
        labelPause.setBounds(widthOfFrame/3+100, heightOfFrame/3, 1400, 100);
        labelPause.setFont(f80);
        labelPause.setVisible(false);

        listOfTrueStrings.add("Родственники");
        listOfTrueStrings.add("Место рождения");
        listOfTrueStrings.add("Близкие друзья");
        listOfTrueStrings.add("Увлечения");
        listOfTrueStrings.add("Любовь");
        listOfTrueStrings.add("Жизненный опыт");
        listOfTrueStrings.add("Любимые занятия");
        listOfTrueStrings.add("Традиции");
        listOfTrueStrings.add("Религия");
        listOfTrueStrings.add("Родина");
        listOfTrueStrings.add("Важные утраты");
        listOfTrueStrings.add("Незбывшаяся любовь");
        listOfTrueStrings.add("Важные моменты жизни");
        listOfTrueStrings.add("Возраст писателя");
        listOfTrueStrings.add("Мечты");

        listOfFalseStrings.add("Цвет снега");
        listOfFalseStrings.add("Президент другой страны");
        listOfFalseStrings.add("Соседи");
        listOfFalseStrings.add("Директор школы");
        listOfFalseStrings.add("Знакомые");
        listOfFalseStrings.add("Количество бумаги");
        listOfFalseStrings.add("Количество бумаги");
        listOfFalseStrings.add("Событие в другом городе");
        listOfFalseStrings.add("Запах еды в столовой");
        listOfFalseStrings.add("Вкус еды в обед");
        listOfFalseStrings.add("Сила притяжения Земли");

        preparation();
    }
    void preparation() {
        isStart = true;
        mainFrame.setLayout(null);
        mainFrame.removeKeyListener(new FrameKeyListener());

        listOfPlayers.subList(0, listOfPlayers.size()).clear();
        listOfWords.subList(0, listOfWords.size()).clear();
        listOfCartridges.subList(0, listOfCartridges.size()).clear();

        health = 5;

        buttonStart.setVisible(true);
        labelWelcome.setVisible(true);
        labelProject.setVisible(true);
        labelProjectType.setVisible(true);
        labelAuthor.setVisible(true);
        labelRules.setVisible(true);
        labelRules1.setVisible(true);
        labelRules2.setVisible(true);
        labelRules3.setVisible(true);
        labelRules4.setVisible(true);
        labelRules5.setVisible(true);
        labelRules6.setVisible(true);
        labelStart.setVisible(true);

        mainFrame.setVisible(true);
        mainFrame.repaint();
    }
    private void startGame() {
        isStart = false;
        buttonStart.setVisible(false);
        labelWelcome.setVisible(false);
        labelProject.setVisible(false);
        labelProjectType.setVisible(false);
        labelAuthor.setVisible(false);
        labelStart.setVisible(false);

        labelItIsYou.setVisible(true);
        labelGameGoal.setVisible(true);
        labelRulesGame.setVisible(true);
        labelRulesGame1.setVisible(true);
        labelRulesGame2.setVisible(true);
        labelRulesGame3.setVisible(true);
        labelRulesGame4.setVisible(true);
        labelRulesGame5.setVisible(true);
        labelRulesGame6.setVisible(true);
        labelStart1.setVisible(true);

        mainFrame.setLayout(new BorderLayout());
        mainFrame.getContentPane().add(new DrawPanel());
        mainFrame.addKeyListener(new FrameKeyListener());

        createNewPerson("d","D","в","В","a","A","ф","Ф","w","W","ц","Ц"," ",new Color(0xD80C00),50,20,20);

        isRunnable = true;
        //
        Runnable runnable = () -> {
            while (isRunnable) {
                if (!isPause) {
                    for (Player player : listOfPlayers) {
                        UnderBarrier(player, "Moving");
                        boolean isRight = false;
                        for (String string1 : player.listOfButtonsRight) {
                            if (listOfPressedButtons.indexOf(string1) != -1) {
                                isRight = true;
                            }
                        }
                        boolean isLeft = false;
                        for (String string2 : player.listOfButtonsLeft) {
                            if (listOfPressedButtons.indexOf(string2) != -1) {
                                isLeft = true;
                            }
                        }
                        if (isRight && !isLeft) {
                            player.xOfObject = player.xOfObject + speedOfPlayers;
                        }
                        if (isLeft && !isRight) {
                            player.xOfObject = player.xOfObject - speedOfPlayers;
                        }
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //
        Runnable runnableRepaint = () -> {
            while (isRunnable) {
                if (isRepaint) {
                    mainFrame.repaint();
                }
                if (!isCtrl) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        threadRepaint = new Thread(runnableRepaint);
        threadRepaint.start();

        //
        Runnable runnableShoot = () -> {
            while (isRunnable) {
                if (!isPause) {
                    for (Player player : listOfPlayers) {
                        for (String string1 : player.listOfButtonsShoot) {
                            if (listOfPressedButtons.indexOf(string1) != -1) {
                                final Cartridge[] cartridge = {new Cartridge(new Color(0x646464), player.xOfObject, player.yOfObject, 20, 10)};
                                listOfCartridges.add(cartridge[0]);

                                Runnable runnableCartridges = () -> {
                                    while (cartridge[0].yOfObject > 0) {
                                        cartridge[0].yOfObject -= 2;
                                        if (!listOfWords.isEmpty()) {
                                            try {
                                                for (Word word : listOfWords) {
                                                    if (isCollision(word, cartridge[0])) {
                                                        if (health > 0 && health < 15) {
                                                            if (word.isTrue && !word.isSelected) {
                                                                word.color = new Color(0x21D817);
                                                                health++;
                                                                if (health >= 15) {
                                                                    win();
                                                                }
                                                                word.isSelected = true;
                                                            } else if (!word.isTrue && !word.isSelected) {
                                                                word.color = new Color(0xDB0010);
                                                                health--;
                                                                if (health <= 0) {
                                                                    lose();
                                                                }
                                                                word.isSelected = true;
                                                            }
                                                            try {
                                                                Thread.sleep(500);
                                                            } catch (InterruptedException e) {
                                                                e.printStackTrace();
                                                            }
                                                            listOfCartridges.remove(cartridge[0]);
                                                            listOfWords.remove(word);
                                                            break;
                                                        }
                                                    }
                                                }
                                            } catch (ConcurrentModificationException | NullPointerException | NoSuchElementException ignored) { }
                                        }
                                        try {
                                            Thread.sleep(1);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    listOfCartridges.remove(cartridge[0]);
                                };
                                Thread threadShoot = new Thread(runnableCartridges);
                                threadShoot.start();

                                if (!isCtrl) {
                                    try {
                                        Thread.sleep(100);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    try {
                                        Thread.sleep(50);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }
                } else {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread threadShoot = new Thread(runnableShoot);
        threadShoot.start();

        //
        for (Player player : listOfPlayers) {
            Runnable runnableJump = () -> {
                while (isRunnable) {
                    if (!isPause) {
                        boolean isJump = false;
                        for (String string3 : player.listOfButtonsJump) {
                            if (listOfPressedButtons.indexOf(string3) != -1) {
                                isJump = true;
                            }
                        }
                        if (isJump) {
                            for (int x = 0; x < 60; x++) {
                                player.yOfObject--;
                                if (!isCtrl) {
                                    try {
                                        Thread.sleep(2);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    try {
                                        Thread.sleep(1);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                if (x < 20) {
                                    player.yOfObject--;
                                }
                                if (x < 30) {
                                    player.yOfObject--;
                                }
                            }
                            if (!isCtrl) {
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                try {
                                    Thread.sleep(50);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            for (int x = 0; x < 60; x++) {
                                player.yOfObject++;
                                if (!isCtrl) {
                                    try {
                                        Thread.sleep(2);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    try {
                                        Thread.sleep(1);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                                if (x >= 30) {
                                    player.yOfObject++;
                                }
                                if (x >= 40) {
                                    player.yOfObject++;
                                }
                            }
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };
            Thread threadJump = new Thread(runnableJump);
            threadJump.start();

            mainFrame.repaint();
            mainFrame.setVisible(false);
            mainFrame.setVisible(true);
        }
    }
    private void win() {
        labelOver.setVisible(true);
        buttonAgain.setVisible(true);
        labelOver.setText("Вы выиграли!");
        labelOver.setBounds(widthOfFrame/3-40, heightOfFrame/3, 1400, 80);
    }
    private void lose() {
        labelOver.setVisible(true);
        buttonAgain.setVisible(true);
        labelOver.setText("Вы проиграли");
        labelOver.setBounds(widthOfFrame/3-50, heightOfFrame/3, 1400, 80);
    }
    private void AbsoluteStart() {
        labelItIsYou.setVisible(false);
        labelGameGoal.setVisible(false);
        labelRules.setVisible(false);
        labelRules1.setVisible(false);
        labelRules2.setVisible(false);
        labelRules3.setVisible(false);
        labelRules4.setVisible(false);
        labelRules5.setVisible(false);
        labelRules6.setVisible(false);
        labelRulesGame.setVisible(false);
        labelRulesGame1.setVisible(false);
        labelRulesGame2.setVisible(false);
        labelRulesGame3.setVisible(false);
        labelRulesGame4.setVisible(false);
        labelRulesGame5.setVisible(false);
        labelRulesGame6.setVisible(false);
        labelStart1.setVisible(false);

        final int[] help = {0};
        Runnable runnableWords2 = () -> {
            while (isRunnable) {
                if (!isPause) {
                    if (help[0] == 0 && listOfWords.size() < 7) {
                        int randBool = (int) (Math.random() * 2);
                        boolean b = true;
                        int randomX = 0;
                        while (b && !listOfWords.isEmpty()) {
                            randomX = (int) (Math.random() * (widthOfFrame - 200));
                            b = false;
                            for (Word word : listOfWords) {
                                for (int x = word.xOfObject - word.width - 30; x < word.xOfObject + word.width + 30; x++) {
                                    if (randomX == x) {
                                        b = true;
                                        break;
                                    }
                                }
                            }
                        }
                        int random;
                        Word word = null;
                        switch (randBool) {
                            case 0:
                                random = (int) (Math.random() * listOfTrueStrings.size());

                                word = new Word(listOfTrueStrings.get(random), new Color(0xFFD200), true, randomX, 0, 120, 60);
                                break;
                            case 1:
                                random = (int) (Math.random() * listOfFalseStrings.size());

                                word = new Word(listOfFalseStrings.get(random), new Color(0xFFD200), false, randomX, 0, 120, 60);
                                break;
                        }

                        listOfWords.add(word);
                    }
                    if (!isCtrl) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            Thread.sleep(15);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (!listOfWords.isEmpty()) {
                        try {
                            for (Word word : listOfWords) {
                                word.yOfObject += 3;
                                if (word.yOfObject > heightOfFrame)
                                    listOfWords.remove(word);
                            }
                        } catch (ConcurrentModificationException ignore) {
                        }
                    }
                    help[0]++;
                    if (help[0] == 20) {
                        help[0] = 0;
                    }
                } else {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread threadWords2 = new Thread(runnableWords2);
        threadWords2.start();
    }

    private void createNewPerson(String r1, String r2, String r3, String r4, String l1, String l2, String l3, String l4, String j1, String j2, String j3, String j4, String s1, Color c, int x, int w, int h) {
        ArrayList<String> listOfButtonsRight = new ArrayList<>();
        listOfButtonsRight.add(r1);
        listOfButtonsRight.add(r2);
        listOfButtonsRight.add(r3);
        listOfButtonsRight.add(r4);

        ArrayList<String> listOfButtonsLeft = new ArrayList<>();
        listOfButtonsLeft.add(l1);
        listOfButtonsLeft.add(l2);
        listOfButtonsLeft.add(l3);
        listOfButtonsLeft.add(l4);

        ArrayList<String> listOfButtonsJump = new ArrayList<>();
        listOfButtonsJump.add(j1);
        listOfButtonsJump.add(j2);
        listOfButtonsJump.add(j3);
        listOfButtonsJump.add(j4);

        ArrayList<String> listOfButtonsShoot = new ArrayList<>();
        listOfButtonsShoot.add(s1);

        Player player = new Player(listOfButtonsRight, listOfButtonsLeft, listOfButtonsJump, listOfButtonsShoot, c, x, heightOfFrame - 120, w, h);

        listOfPlayers.add(player);
    }

    private boolean isCollision(GameObject gameObject1, GameObject gameObject2) {
        for (int x = gameObject1.xOfObject; x <= gameObject1.xOfObject + gameObject1.width; x++) {
            if (x == gameObject2.xOfObject) {
                for (int y = gameObject1.yOfObject; y <= gameObject1.yOfObject + gameObject1.height; y++) {
                    if (y == gameObject2.yOfObject) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private void UnderBarrier(GameObject gameObject, String method) {
        if (gameObject.xOfObject <= -1 - gameObject.width) {
            if ("Moving".equals(method)) {
                gameObject.xOfObject = widthOfFrame;
            }
        } else if (gameObject.xOfObject >= widthOfFrame + 1) {
            if ("Moving".equals(method)) {
                gameObject.xOfObject = 0 - gameObject.width;
            }
        }
    }

    private class FrameKeyListener extends KeyAdapter implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (listOfPressedButtons.indexOf(String.valueOf(e.getKeyChar())) == -1) {
                listOfPressedButtons.add(String.valueOf(e.getKeyChar()));
                lastPressedButton = String.valueOf(e.getKeyChar());

                for (Player player : listOfPlayers) {
                    for (String string : player.listOfButtonsRight) {
                        if (String.valueOf(e.getKeyChar()).equals(string)) {
                            player.direction = "Right";
                        }
                    }
                }
                for (Player player : listOfPlayers) {
                    for (String string : player.listOfButtonsLeft) {
                        if (String.valueOf(e.getKeyChar()).equals(string)) {
                            player.direction = "Left";
                        }
                    }
                }
            }
            if (e.getKeyChar() == '\n') {
                if (!isStart) {
                    isStart = true;
                    AbsoluteStart();
                }
            }
            if (e.getExtendedKeyCode() == 0x11) {
                isCtrl = true;
                speedOfPlayers = 2;
            }
            if (e.getExtendedKeyCode() == 0x10) {
                labelPause.setVisible(true);
                isPause = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (listOfPressedButtons.indexOf(String.valueOf(e.getKeyChar())) != -1)
                listOfPressedButtons.remove(String.valueOf(e.getKeyChar()));

            if (e.getExtendedKeyCode() == 0x11) {
                isCtrl = false;
                speedOfPlayers = 1;
            }
            if (e.getExtendedKeyCode() == 0x10) {
                labelPause.setVisible(false);
                isPause = false;
            }
        }
    }

    private class Start implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startGame();
        }
    }
    private class StartAgain implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent em) {
            isRunnable = false;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            labelOver.setVisible(false);
            buttonAgain.setVisible(false);
            preparation();
        }
    }
}
