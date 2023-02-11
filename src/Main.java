// Программа расчёта суммы расходов по тарифу
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = 100; // стоимость тарифа Кости;
        int B = 10; // размер тарифа в мегабайтах Кости
        int C = 12; // стоимость каждого лишнего мегабайта;
        System.out.println("Введите размер интернет-трафика Кости в следующем месяце: ");
        int D = scanner.nextInt();

        if (D > B) {
            int E = D - B; //разница между потребленным трафиком и допустимым
            int F = E * C; //общая сумма за переиспользованный трафик
            int G = F + A; //общая сумма расходов
            System.out.println(G);
        } else if (D<=B) {
            System.out.println(A);
        }

    }
}