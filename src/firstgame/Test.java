/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgame;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static util.Operation.*;

/**
 *
 * @author hector
 */
public class Test {

    static final int NUMBER_PLAY = 1000000;
    static final int NUMBER_ROLL_DICE = 4;
    static final int NUMBER_WINER = 6;

    public static void main(String[] args) {
        int countWin = 0, countLose = 0, price = 1;
        float mean = 0.0f, variance = 0.0f, standardDeviation = 0.0f;
        
        List<Integer> winList = new ArrayList<>();

        for (int i = 0; i < NUMBER_PLAY; i++) {
            for (int j = 0; j < NUMBER_ROLL_DICE; j++) {
                int[] result = rollDice(1);
                if (result[0] == NUMBER_WINER) {
                    winList.add(i);
                    countWin++;
                    break;
                } else {
                    countLose++;
                }
            }
        }

        System.out.println("\n=================================");
        System.out.println("HITS : " + winList.size());

        mean = getMean(winList);
        System.out.println("MEAN : " + mean);

        variance = getVariance(mean, winList);
        System.out.println("VARIANCE : " + BigDecimal.valueOf(variance));

        standardDeviation = getStandardDeviation(variance);
        System.out.println("STANDARD DEVIATION : " + standardDeviation);

        System.out.println("=================================");
    }
}
