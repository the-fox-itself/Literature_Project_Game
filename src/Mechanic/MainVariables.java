package Mechanic;

import Objects.Cartridge;
import Objects.Player;
import Objects.Word;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class MainVariables {
    public static ArrayList<String> listOfPressedButtons = new ArrayList<>();
    public static ArrayList<Player> listOfPlayers = new ArrayList<>();
    public static ArrayList<Cartridge> listOfCartridges = new ArrayList<>();
    public static ArrayList<Word> listOfWords = new ArrayList<>();

    public static ArrayList<String> listOfTrueStrings = new ArrayList<>();
    public static ArrayList<String> listOfFalseStrings = new ArrayList<>();

    static JFrame mainFrame = new JFrame("Игра \"Поиск авторского замысла\"");

    static JButton buttonStart = new JButton("Старт");
    static JLabel labelWelcome = new JLabel("Игра \"Поиск авторского замысла\"");
    static JLabel labelProject = new JLabel("Творческое задание по Литературе 7 класса домашней школы Фоксфорд.");
    static JLabel labelProjectType = new JLabel("Тип задания: 1. Компьютерная игра \"В поисках автора\".");
    static JLabel labelAuthor = new JLabel("Создатель игры: Ставр Стрелов.");
    static JLabel labelRules = new JLabel("Управление в игре:");
    static JLabel labelRules1 = new JLabel("d (в) - Передвижение вправо");
    static JLabel labelRules2 = new JLabel("a (ф) - Передвижение влево");
    static JLabel labelRules3 = new JLabel("w (ц) - Прыжок");
    static JLabel labelRules4 = new JLabel("Пробел - Стрельба");
    static JLabel labelRules5 = new JLabel("Ctrl (зажатие) - Ускорение игры");
    static JLabel labelRules6 = new JLabel("Shift (зажатие) - Пауза");
    static JLabel labelStart = new JLabel("Нажмите на Старт, чтобы начать!");

    static JLabel labelItIsYou = new JLabel("Это - ваш персонаж!");
    static JLabel labelGameGoal = new JLabel("Описание игры:");
    static JLabel labelRulesGame = new JLabel("С неба будут падать слова, обозначающие информацию об авторе.");
    static JLabel labelRulesGame1 = new JLabel("Попадай в информацию, которая поможет раскрыть смысл какого-либо произведения.");
    static JLabel labelRulesGame2 = new JLabel("Примеры правильных: Семья автора, Интересы автора и т.д.");
    static JLabel labelRulesGame3 = new JLabel("Под тобой есть линия из красных квадратов - твои жизни.");
    static JLabel labelRulesGame4 = new JLabel("Отвечаешь неправильно - минус жизнь, правильно - плюс жизнь.");
    static JLabel labelRulesGame5 = new JLabel("Для победы нужно заполнить жизнями всю строку.");
    static JLabel labelRulesGame6 = new JLabel("Если твои жизни закончатся - ты проиграешь!");
    static JLabel labelStart1 = new JLabel("Когда будешь готов - жми Enter!");

    static JLabel labelPause = new JLabel("Пауза");

    static JLabel labelOver = new JLabel();
    static JButton buttonAgain = new JButton("Еще раз?");

    static Font f20 = new Font("", Font.BOLD, 20);
    static Font f25 = new Font("", Font.BOLD, 25);
    static Font f30 = new Font("", Font.BOLD, 30);
    static Font f35 = new Font("", Font.BOLD, 35);
    static Font f40 = new Font("", Font.BOLD, 40);
    static Font f80 = new Font("", Font.BOLD, 80);

//    public static Dimension frameSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static int widthOfFrame = 1800;
    public static int heightOfFrame = 950;

    public static boolean isRepaint = true;
    public static boolean isRunnable = true;
    public static boolean isPause = false;
    public static boolean isWords = false;
    public static boolean isCtrl = false;
    public static String lastPressedButton;
    public static boolean isStart = false;

    public static double g = 9.8;
    public static int FWeight;

    public static int speedOfPlayers = 1;

    public static int time = 0;

    public static Thread threadRepaint;

    public static int health = 5;
}
