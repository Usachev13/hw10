public class Main {
    public static void main(String[] args) {

        System.out.println("HW 10 start!");
        task1();
        task2();
        task3();
    }

    /* task1 */
    public static void task1() {
        System.out.println("Task 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

    }

    /* task2 */

    public static void task2() {
        System.out.println("Task 2");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName. toUpperCase());
    }

    /* task3 */
    public static void task3() {
        System.out.println("Task 3");

        String fullName = "Иванов Cемён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}