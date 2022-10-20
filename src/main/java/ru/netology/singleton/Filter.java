package ru.netology.singleton;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer number : source) {
            if (number < treshold) {
                logger.log("Элемент " + number + " не подходит");
            } else {
                logger.log("Элемент " + number + " подходит");
                result.add(number);
            }
        }
        return result;
    }
}
