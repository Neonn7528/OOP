
/*Фаил для проверки работы Person. Записывает ли в txt и 
 * проверяет ли уникальность никнейма.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.setProperty("console.encoding", "UTF-8");

        try (Scanner console = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите никнейм: ");
                String inputName = console.nextLine();

                if (!isNicknameUnique(inputName)) {
                    System.out.println("Никнейм уже занят. Пожалуйста, введите другой никнейм.");
                    continue;
                }
                break;
            }
        }
    }

    static boolean isNicknameUnique(String nickname) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String storedNickname = parts[0];
                // Если никнейм уже существует в хранилище данных, он не является уникальным
                if (storedNickname.equals(nickname)) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } // BufferedWriter для добавления записи на новую строку в файле
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true))) {

            writer.write(nickname);// открываем файл "data.txt" и добавляем новую запись в файл
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

}
