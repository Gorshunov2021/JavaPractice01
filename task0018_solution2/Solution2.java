package task0018_solution2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Зарплата через 5 лет
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        // создаем объект класса BufferedReader для считывания с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter name: ");
        // объявляем переменную name типа String и присваиваем ей значение
        // строки, считанной с клавиатуры с помощью метода readLine
        String name = reader.readLine();
        // объявляем переменную money типа String и присваиваем ей значение
        // строки, считанной с клавиатуры с помощью метода readLine
		  System.out.println("Enter summ money: ");
        String money = reader.readLine();
        // объявляем переменную years типа String и присваиваем ей значение
        // строки, считанной с клавиатуры с помощью метода readLine
		  System.out.println("Enter year: ");
        String years = reader.readLine();
        // складываем (конкатенируем) из строк фразу и выводим ее на экран
        System.out.println(name + " получает " + money + " через " + years + " лет.");
    }
}