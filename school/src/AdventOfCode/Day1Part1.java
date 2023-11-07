package school.src.AdventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day1Part1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Projekte\\java\\school\\src\\input\\dayOneInput.txt");
        Scanner scanner = new Scanner(file);
        String calories = "";
        int caloriesPerElf = 0;
        ArrayList<Integer> elfList = new ArrayList<>();
     
        while(scanner.hasNext()){
            calories = scanner.nextLine();
            if(!calories.equals("")){
                 caloriesPerElf += Integer.parseInt(calories);
            }
            else{
                elfList.add(caloriesPerElf);
                caloriesPerElf = 0;
            }
        }
        Collections.sort(elfList, Collections.reverseOrder());
        System.out.println(elfList.get(0));
    }
}
