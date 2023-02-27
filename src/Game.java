/*
    Skeleton Program for the AQA A Level Paper 1 Summer 2023 examination
    this code should be used in conjunction with the Preliminary Material
    written by the AQA Programmer Team
    developed in NetBeans IDE 12.6 environment

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Dastan ThisGame = new Dastan(6, 6, 4);
        ThisGame.playGame();
        Console.writeLine("Goodbye!");
        Console.readLine();
    }
}

