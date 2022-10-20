package ru.averkiev.my_linked_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MenuController {

    private static int choiceUser = -1;         // Пользовательский выбор пункта меню.

    public static int getChoiceUser() {
        return choiceUser;
    }

    /**
     * Вывод главного меню пользователю.
     */
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

    /**
     * Вывод меню обновления пользователю.
     */
    public static void showUpdateMenu() {
        try {
            System.out.println("Меню обновления:");
            System.out.println("----------------------------------------");
            Thread.sleep(1000);
            System.out.println("1. Обновить имя миньона");
            Thread.sleep(300);
            System.out.println("2. Обновить возраст миньона");
            Thread.sleep(300);
            System.out.println("3. Обновить имя покровителя");
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

    /**
     * Скролл экрана для очистки.
     */
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

    /**
     * Симуляция загрузки действия.
     */
    public static void download() {
        try {
            Random random = new Random();
            for (int i = 0; i < 40; i++) {
                System.out.print(".");
                Thread.sleep((random.nextInt(10) + 50));
            }
            System.out.println();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Ввод пользователем выбранного пункта меню.
     */
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

    /**
     * Подготовка данных для добавления элемента.
     */
    public static void addElement() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите имя миньона: ");
            String minionName = reader.readLine();

            System.out.print("Введите возраст миньона: ");
            int ageMinion = Integer.parseInt(reader.readLine());

            System.out.print("Введите имя покровителя миньона: ");
            String patronName = reader.readLine();

            Minion minion = new Minion(minionName, ageMinion, patronName);

            Main.minionList.add(minion);

            System.out.println();
            System.out.println("Добавление элемента..");
            download();
            System.out.println("Новый миньон успешно добавлен!");

            System.out.println();
            System.out.print("Для продолжение нажмите Enter.");
            reader.readLine();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Подготовка данных для удаления элемента.
     */
    public static void deleteElement() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index;
        try {
            System.out.print("Введите индекс удаляемого миньона: ");
            while (true) {
                index = Integer.parseInt(reader.readLine());
                if (index >= 0) {
                    break;
                } else {
                    System.out.println("Введите положительный ID миньона!");
                }
            }

            boolean resultDeleteMinion = Main.minionList.delete(index);

            download();

            if (resultDeleteMinion) {
                System.out.println("Миньон успешно удален!");
            } else {
                System.out.println("С таким ID миньон не найден!");
            }

            System.out.println();
            System.out.print("Для продолжение нажмите Enter.");
            reader.readLine();

        } catch (IOException ex) {
            System.out.println("Введите целое число!");
        }
    }

    /**
     * Подготовка данных для обновления элемента.
     */
    public static void updateElement() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index;
        try {
            System.out.print("Введите индекс обновляемого миньона: ");
            while (true) {
                index = Integer.parseInt(reader.readLine());
                if (index >= 0) {
                    break;
                } else {
                    System.out.println("Введите положительный ID миньона!");
                }
            }

            clearMenu();
            showUpdateMenu();
            selectAction();

            boolean resultUpdateMinion = false;
            boolean isRightChoiceUser = false;

            Minion updateMinion = Main.minionList.get(index);

            while (!isRightChoiceUser) {
                switch (choiceUser) {
                    case 1 -> {
                        System.out.print("Введите имя миньона: ");
                        String minionName = reader.readLine();
                        updateMinion.setName(minionName);
                        resultUpdateMinion = Main.minionList.update(index, updateMinion);
                        isRightChoiceUser = true;
                    }
                    case 2 -> {
                        System.out.print("Введите возраст миньона: ");
                        int minionAge = Integer.parseInt(reader.readLine());
                        updateMinion.setAge(minionAge);
                        resultUpdateMinion = Main.minionList.update(index, updateMinion);
                        isRightChoiceUser = true;
                    }
                    case 3 -> {
                        System.out.print("Введите имя покровителя миньона: ");
                        String patronName = reader.readLine();
                        updateMinion.setPatron(patronName);
                        resultUpdateMinion = Main.minionList.update(index, updateMinion);
                        isRightChoiceUser = true;
                    }
                    case 0 -> {
                        return;
                    }
                    default -> {
                        System.out.println("Выберите из существующих пунктов меню.");
                        selectAction();
                    }
                }
            }

            if (resultUpdateMinion) {
                System.out.println("Миньон успешно обновлен!");
            } else {
                System.out.println("С таким ID миньон не найден!");
            }

            System.out.println();
            System.out.print("Для продолжение нажмите Enter.");
            reader.readLine();

        } catch (IOException ex) {
            System.out.println("Введите целое число!");
        }

    }

    public static void showList() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Main.minionList.showList();

        try {
            System.out.println();
            System.out.print("Для продолжение нажмите Enter.");
            reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
