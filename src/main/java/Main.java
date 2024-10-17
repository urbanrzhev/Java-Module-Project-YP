import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("24 часа Ле-Мана");
        Car[] cars = inputData();
        Trek.go(cars);
    }

    public static Car[] inputData() {
        Car[] cars = {new Car(), new Car(), new Car()};
        Scanner scanner = new Scanner(System.in);
        final int maxSpeed = 250;
        String data;
        boolean stop;
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины номер " + (i + 1));
            data = scanner.next();
            cars[i].setBrand(data.trim());
            stop = false;
            while (!stop) {
                System.out.println("Введите скорость машины номер " + (i + 1));
                data = scanner.next();
                for (int j = 1; j <= maxSpeed; j++) {
                    if (data.trim().equals((j + ""))) {
                        cars[i].setSpeed(j);
                        stop = true;
                        break;
                    }
                    if (j == maxSpeed) {
                        System.out.println("Скорость должна быть больше 0 и меньше 251");
                    }
                }
            }
        }
        scanner.close();
        return cars;
    }

}