package ru.job4j.tracker;

/**
 * UserAction.
 *
 * @author Maxim Vanny.
 * @version 2.0
 * @since 0.1
 */
public interface UserAction {
    /**
     * Метод возвращает ключ опции.
     * @return ключ
     */
    int key();
    /**
     * Основной метод.
     * @param input объект типа Input
     * @param tracker объект типа Tracker
     */
    void execute(Input input, ITracker tracker);
    /**
     * Метод возвращает информацию о данном пункте меню.
     * @return Строка меню
     */
    String info();
}
