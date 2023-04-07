public class Main {
    public static void main(String[] args) {
        BmiService bmiCheck = new BmiService();
        System.out.println("ИМТ = " + bmiCheck.calculate(1.87, 98));
    }
}
