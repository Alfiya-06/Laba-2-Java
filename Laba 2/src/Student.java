import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Ошибка! Имя не может быть пустым. Установлено имя по умолчанию: Неизвестный");
            this.name = "Неизвестный";
        }
    }

    public void setGrades(int[] grades) {
        if (grades != null) {
            this.grades = grades;
        } else {
            System.out.println("Ошибка! Оценка не может быть пустой.");
            this.grades = new int[]{2};
        }
    }

    public Student(String name, int[] grades) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Ошибка! Имя не может быть пустым. Установлено имя по умолчанию: Неизвестный");
            this.name = "Неизвестный";
        }
        if (grades != null) {
            this.grades = grades;
        } else {
            System.out.println("Ошибка! Оценка не может быть пустой.");
            this.grades = new int[]{2};
        }
    }

    @Override
    public String toString() {
        return name + ":" + Arrays.toString(grades);
    }
}