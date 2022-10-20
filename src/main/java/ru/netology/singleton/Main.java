package ru.netology.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        logger.log("Введите входные данные для списка");
        int count = inputNumber("Введите размер списка: ");
        int maxValue = inputNumber("Введите верхнюю границу для значений: ");
        logger.log("Создаем и наполняем список");
        List<Integer> list = randomList(count, maxValue);
        logger.log("Вот случайный список: " + list);
        logger.log("Введите входные данные для фильтрации");
        int f = inputNumber("Введите порог для фильтра: ");
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> listFilter = filter.filterOut(list);
        logger.log("Прошло фильтр " + listFilter.size() + " элемента из " + list.size());
        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список: " + listFilter);
        logger.log("Завершаем программу");
    }

    public static List<Integer> randomList(int count, int maxValue) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }

    public static Integer inputNumber(String msg) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print(msg);
            try {
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                if (number <= 0) {
                    throw new IllegalArgumentException("Введено недопустимое число");
                } else {
                    break;
                }
            } catch (IllegalArgumentException e) {
                logger.log(e.toString());
            }
        }
        return number;
    }
}
