public class Trek {

    public static void go(Car[] cars) {
        Car pedestal = cars[0];
        if (pedestal.getDistance() < cars[1].getDistance()) {
            pedestal = cars[1];
        }
        if (pedestal.getDistance() < cars[2].getDistance()) {
            pedestal = cars[2];
        }
        System.out.println("Самая быстрая машина : " + pedestal.getBrand());
    }
}
