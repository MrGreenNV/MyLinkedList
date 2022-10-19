package ru.averkiev.my_linked_list;

/**
 * Основной класс
 */
public class Main {
    // Инициализация списка элементов
    static MyLinkedList minionList = new MyLinkedList();

    public static void main(String[] args) {

        // Основной цикл работы программы. Крутится пока пользователь не выберет выход из программы.
        while (true) {
            MenuController.clearMenu();
            MenuController.showMainMenu();
            MenuController.selectAction();
            MenuController.download();
            switch (MenuController.getChoiceUser()) {
                case 1 -> MenuController.addElement();
                case 2 -> MenuController.deleteElement();
                case 3 -> MenuController.updateElement();
                case 4 -> MenuController.showList();
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Выберите из существующих пунктов меню.");
                    MenuController.selectAction();
                }
            }
        }
    }
}