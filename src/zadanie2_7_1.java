import java.util.Scanner;

public class zadanie2_7_1 {
    //2. Решите логическую загадку. Советую решать ее без помощи интернета, чтобы полностью осознать логику задачи.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1, если Альберт знает месяц, либо 0, если не знает: ");
        String xAlb = scanner.nextLine(); // знания Альберта (1 или 0)
        System.out.print("Введите 1, если Бернард знает число, либо 0, если не знает: ");
        String yBer = scanner.nextLine(); // знания Бернарда (1 или 0)
        //char op = scanner.next().charAt(0);
        boolean xAlbKnow = xAlb.equals("1"); // знает или нет Альберт (true or false)
        boolean yBerKnow = yBer.equals("1"); // знает или нет Бернард (true or false)
        boolean bothKnow = xAlbKnow && yBerKnow; // если true, мы можем узнать день рождения, если false - нет
        System.out.println("Если false, Альберт не знает, если true, Альберт знает, у нас: " + xAlbKnow);
        System.out.println("Если false, Бернард не знает, если true, Бернард знает, у нас: " + yBerKnow);
        if (bothKnow) {
            System.out.println("Т.е. Альберт и Бернард оба знают, т.е. мы можем узнать день рождения");
            System.out.println("Сопоставим знания Альберта и Бернарда.");
            System.out.println("Введите день, который знает Бернард: ");
            String birthdayDay = scanner.nextLine();
            System.out.println("Введите месяц, который знает Альберт (в нужном падеже, т.е. 'июля', 'августа' и т.д.): ");
            String birthdayMonth = scanner.nextLine();
            System.out.println("Таким образом, день рождения: " + birthdayDay + " " + birthdayMonth);
        }
        if (!bothKnow) {
            System.out.println("Таким образом, Альберт и Бернард (или кто-то один из них) не знают, либо данные введены некорректно, т.е. мы не можем узнать день рождения");
        }
        System.out.println("Итоговый ответ на задание 2: Пример см. в коде.");
    }
}