package ru.averkiev.my_linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import static ru.averkiev.my_linked_list.Main.minionList;

public class MenuController {

    private static int choiceUser = -1;

    public static int getChoiceUser() {
        return choiceUser;
    }

    public static void showMainMenu() {
        try {
            System.out.println("Главное меню:");
            System.out.println("----------------------------------------");
            Thread.sleep(1000);
            System.out.println("1. Добавить элемент");
            Thread.sleep(300);
            System.out.println("2. Удалить элемент");
            Thread.sleep(300);
            System.out.println("3. Обновить элемент");
            Thread.sleep(300);
            System.out.println("4. Показать список элементов");
            Thread.sleep(300);
            System.out.println("----------------------------------------");
            Thread.sleep(300);
            System.out.println("0. Завершить программу");
            System.out.println();
            Thread.sleep(600);
            System.out.print("=> ");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void showAddMenu() {
        try {
            System.out.println("Главное меню:");
            System.out.println("----------------------------------------");
            Thread.sleep(1000);
            System.out.println("1. Добавить элемент");
            Thread.sleep(300);
            System.out.println("2. Удалить элемент");
            Thread.sleep(300);
            System.out.println("3. Обновить элемент");
            Thread.sleep(300);
            System.out.println("4. Показать список элементов");
            Thread.sleep(300);
            System.out.println("----------------------------------------");
            Thread.sleep(300);
            System.out.println("0. Назад");
            System.out.println();
            Thread.sleep(600);
            System.out.print("=> ");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void clearMenu() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void download() {
        try {
            Random random = new Random();
            System.out.println();
            for (int i = 0; i < 40; i++) {
                System.out.print(".");
                Thread.sleep((random.nextInt(100) + 50));
            }
            System.out.println();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void selectAction() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                choiceUser = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException ex) {
                System.out.println("Введите целое число!");
            }
        }
    }

    public static void addElement() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите имя миньона: ");
            String minionName = reader.readLine();

            System.out.print("Введите имя покровителя миньона: ");
            String patronName = reader.readLine();

            Villain patron = new Villain(patronName);
            Minion minion = new Minion(minionName, patron);

            minionList.add(minion);

            download();
            System.out.println("Новый миньон успешно добавлен!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void deleteElement() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long id = -1;
        try {
            System.out.print("Введите ID удаляемого миньона: ");
            while (true) {
                id = Integer.parseInt(reader.readLine());
                if (id > 0) {
                    break;
                } else {
                    System.out.println("Введите положительный ID миньона!");
                }
            }

            boolean resultDeleteMinion = minionList.delete(id);

            download();

            if (resultDeleteMinion) {
                System.out.println("Миньон успешно удален!");
            } else {
                System.out.println("С таким ID миньон не найден!");
            }

        } catch (IOException ex) {
            System.out.println("Введите целое число!");
        }
    }

    public static void updateElement() {

        // Скопировать часть из deleteElement;

    }

    public static void showList() {
        minionList.showList();
    }

}
