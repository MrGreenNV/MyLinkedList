package ru.averkiev.my_linked_list;

public class Main {

    static MyLinkedList minionList = new MyLinkedList();

    public static void main(String[] args) {
        MenuController.clearMenu();
        MenuController.showMainMenu();
        MenuController.selectAction();
        MenuController.download();

        while (true) {
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
            MenuController.clearMenu();
            MenuController.showMainMenu();
            MenuController.selectAction();
            MenuController.download();
        }
    }
}
