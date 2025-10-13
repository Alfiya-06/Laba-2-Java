public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1. Точка координат");
        Point point1 = new Point(1, 6);
        Point point2 = new Point(4,22);
        Point point3 = new Point(-2,0);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);

        System.out.println("\nЗадача 2. Прямая");
        Point lineStart1 = new Point(1,4);
        Point lineEnd1 = new Point(23,8);
        Line line1 = new Line(lineStart1, lineEnd1);

        Point lineStart2 = new Point(5,10);
        Point lineEnd2 = new Point(25,10);
        Line line2 = new Line(lineStart2, lineEnd2);
        Line line3 = new Line(line1.getStart(), line2.getEnd());

        System.out.println("Исходные линии:");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        line1.getStart().setX(21);
        line1.getEnd().setY(12);
        line2.getStart().setX(8);
        line2.getEnd().setY(31);
        System.out.println("\nПосле изменения координат точек: ");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println("\nМеняем первую линию, но третья линия не меняется: ");
        line1.setStart(new Point(64, 8));
        line1.setEnd(new Point(32,35));
        System.out.println(line1);
        System.out.println(line3);

        System.out.println("\nЗадача 3. Студент");
        Student student1 = new Student("Вася", new int[]{3,4,5});
        System.out.println(student1);
        Student student2 = new Student("Петя", student1.getGrades());
        int[] petyaGrades = student2.getGrades();
        petyaGrades [0] = 5;
        student2.setGrades(petyaGrades);

        System.out.println("После изменения первой оценки Пети:");
        System.out.println(student1);
        System.out.println(student2);

        Student student3 = new Student("Андрей", student1.getGrades().clone());

        int[] vasyaGrades = student1.getGrades();
        vasyaGrades [0] = 2;
        student1.setGrades(vasyaGrades);

        System.out.println("\nПосле изменения оценки у Васи:");
        System.out.println(student1);
        System.out.println(student3);

        System.out.println("\nЗадача 4. Создаем точку");
        Point firstPoint = new Point(3,5);
        Point secondPoint = new Point(25,6);
        Point thirdPoint = new Point(7,8);

        System.out.println("Точка 1: " + firstPoint);
        System.out.println("Точка 2: " + secondPoint);
        System.out.println("Точка 3: " + thirdPoint);

        System.out.println("\nЗадача 5. Создаем Линию");
        Line line5first = new Line(1, 3, 23, 8);
        Line line5second = new Line(5, 10, 25, 10);
        Line line5third = new Line(line5first.getStart(), line5second.getEnd());

        System.out.println("Линия 1: " + line5first);
        System.out.println("Линия 2: " + line5second);
        System.out.println("Линия 3: " + line5third);

        System.out.println("\nЗадача 6. Длина линии.");
        Line line6_1 = new Line(1, 1, 10, 15);
        System.out.println("Линия: " + line6_1);
        System.out.println("Длина линии: " + line6_1.getLength());
        }
}