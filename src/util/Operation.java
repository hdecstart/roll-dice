/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;

/**
 *
 * @author hector
 */
public class Operation {

    public static int[] rollDice(int number_dice) {
        int[] result = new int[number_dice];
        //int result = (int) (Math.random() * 6 + 1);
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 6 + 1);
        }
        return result;
    }

    public static float getMean(List<Integer> elements) {
        float sum = 0.0f;
        for (Integer integer : elements) {
            sum += integer;
        }
        return (sum / elements.size());
    }

    public static float getVariance(float mean, List<Integer> elements) {
        float tempVariance = 0.0f;
        for (Integer integer : elements) {
            tempVariance += (float) Math.pow((integer - mean), 2);
        }
        return (tempVariance / (elements.size() - 1));
    }

    public static float getStandardDeviation(float variance) {
        return (float) Math.sqrt(variance);
    }
}
