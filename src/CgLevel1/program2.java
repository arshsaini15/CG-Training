package CgLevel1;

public class program2 {
    public static void main(String[] args) {
        int mathMarks = 94, physicsMarks = 95, chemistryMarks = 96;

        double percentage = ((mathMarks + physicsMarks + chemistryMarks) / 300.0) * 100;

        System.out.println(percentage + "%");
    }
}
