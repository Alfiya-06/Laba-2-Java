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
        if (grades == null || grades.length == 0) {
            System.out.println("Ошибка! Оценка не может быть пустой.");
            this.grades = new int[]{3};
        } else {
            this.grades = checkGrades(grades);
        }
    }

    private int[] checkGrades(int[] input) {
        for (int i = 0; i < input.length; i++){
            if (input[i] < 1 || input[i] > 5) {
                System.out.println("Ошибка! оценка " + input[i] + " недопустима " +
                        " установлена оценка 3");
                input[i] = 3;
            }
        }
        return input;
    }

    public Student(String name, int[] grades) {
        setName(name);
        setGrades(grades);
    }

    @Override
    public String toString() {
        return name + ":" + Arrays.toString(grades);
    }
}