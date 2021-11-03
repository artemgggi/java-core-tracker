package ru.job4j.collection.LinkedList;

import java.util.LinkedList;

/**
 * Класс описывает работу простейшей очереди по приоритету, которая работает
 * по принципе FIFO
 * @author  Artem
 * @version 1.0
 */

public class PriorityQueue {
    /**
     * Хранение задание осуществляется в коллекции типа LinkedList
     */
    private final LinkedList<Task> tasks = new LinkedList<>();

    /**
     *  Метод принимает на вход заявку и добавляет её в очередь
     *  Если встречаются 2 задания с одинаковым приоритетом, то в очереди
     *  они распределяются по принципе FIFO.
     * @param task задача которая добавляется в очередь
     */

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                tasks.add(element);
                break;
            } else {
                index++;
            }
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод позволяет получить первую задачу в очереди
     * @return возвращает задачу из головы очереди или null, если очередь пуста
     */

    public Task take() {
        return tasks.poll();
    }
}
