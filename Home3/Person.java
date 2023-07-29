import java.util.Scanner;
import java.io.*;

public class Person {
    
    private String name;
    private int age;

    public Person() {
        // Конструктор по умолчанию
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fillDataFromConsole() {
        try (Scanner console = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите никнейм: ");
                String inputName = console.nextLine();

                if (!isNicknameUnique(inputName)) {
                    System.out.println("Никнейм уже занят. Пожалуйста, введите другой никнейм.");
                    continue;
                }

                this.name = inputName;
                break;
            }

            System.out.print("Введите возраст: ");
            this.age = console.nextInt();
        }
    }

    boolean isNicknameUnique(String nickname) {
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
        }//BufferedWriter для добавления записи на новую строку в файле
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt", true))) {
            writer.write(nickname + "," + age);//открываем файл "data.txt" и добавляем новую запись в файл
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return true;
    }

    // Геттеры и сеттеры для полей name и age
    // ...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
    }

    public String getNickname() {
        return null;
    }
}