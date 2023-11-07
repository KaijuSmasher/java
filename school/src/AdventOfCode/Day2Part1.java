package school.src.AdventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Projekte\\java\\school\\src\\input\\dayTwoInput.txt");
        Scanner scanner = new Scanner(file);
        String round = "";
        int npc = 0;
        int you = 0;
        int score = 0;
        while (scanner.hasNext()) {
            round = scanner.nextLine();
            for (int i = 0; i < round.length(); i++) {
                char player = round.charAt(i);
                switch (player) {
                    case 'A':
                        npc = 1;
                        break;
                    case 'B':
                        npc = 2;
                        break;
                    case 'C':
                        npc = 3;
                        break;
                    case 'X':
                        you = 1;
                        break;
                    case 'Y':
                        you = 2;
                        break;
                    case 'Z':
                        you = 3;
                        break;
                }
            }
                boolean win = ((you == 1 && npc == 3) || (you == 2 && npc == 1) || (you == 3 && npc == 2));
                boolean draw = ((you == 1 && npc == 1) || (you == 2 && npc == 2) || (you == 3 && npc == 3));
                if (win) {
                    you += 6;
                } else if (draw) {
                    you += 3;
                }
                score += you;
        }
        System.out.println(score);
    }
}
