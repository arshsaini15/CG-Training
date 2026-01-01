package CgLevel2;

public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();
        double perimeter = s1 + s2 + s3;
        double rounds = 5000 / perimeter; // 5km = 5000m
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
