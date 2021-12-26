package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner stroka = new Scanner(System.in);
        System.out.println("Отгадай загадку: \n Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 0; i < 3; i++) {
            String otgadka = stroka.nextLine();
            if (otgadka.equalsIgnoreCase("Подсказка")) {
                switch (i){
                    case 0:
                        System.out.println("Это не лук. У тебя только одна попытка");
                        i++;
                        break;
                    case 1:
                        System.out.println("Подсказка уже недоступна");
                        break;
                    case 2:
                        System.out.println("Подсказка уже недоступна\nОбидно, приходи в другой раз");
                        break;
                }
            }
            else if (otgadka.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else if (i < 2) {
                System.out.println("Подумай еще!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}


//Задание:
//Напишите программу-загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.
// Ответ: “Заархивированный вирус”.
//У пользователя есть 3 попытки, чтобы отгадать загадку.
//Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
//Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
//Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
//Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. Если на первой
// попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
//Если пользователь, использовавший подсказку, ошибется,
//вывести “Обидно, приходи в другой раз” и завершить работу.