import java.util.Scanner;

class Main {
    public static int earnings;
    public static int speandings;

    public static int taxEarningsMinusSpeandings(int earnings, int speandings) {
        int tax1 = (earnings - speandings) * 15 / 100;
        if (tax1 > 0) {
            return tax1;
        } else {
            return 0;
        }
    }

    public static int taxEarningsSixPercents(int earnings, int speandings) {
        int tax2 = (earnings) * 6 / 100;
        if (tax2 > 0) {
            ;
            return tax2;
        } else {
            return 0;
        }

    }

    public static void result() {
        int tax6 = taxEarningsSixPercents(earnings, speandings);
        int tax15 = taxEarningsMinusSpeandings(earnings, speandings);
        int difference1 = tax15 - tax6;
        int difference2 = tax6 - tax15;

        if (tax15 > tax6) {
            System.out.println("Советуем выбрать систему УСН Доходы 6%");
            System.out.println("Ваш налог составит: " + tax6 + " рублей");
            System.out.println("Налог по другой системе составит: " + tax15 + " рублей");
            System.out.println("Экономия:" + difference1 + " рублей");
        } else {
            System.out.println("Советуем выбрать систему Доход минус Расход");
            System.out.println("Ваш налог составит: " + tax15 + " рублей");
            System.out.println("Налог по другой системе составит: " + tax6 + " рублей");
            System.out.println("Экономия:" + difference2 + " рублей");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию и введите её номер: ");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            System.out.println("Для завершения программы введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    earnings += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Введите сумму расхода: ");
                    speandings += Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    result();
                    break;
                default:
                    System.out.println("Такой операции нет");
            }

        }
    }
}