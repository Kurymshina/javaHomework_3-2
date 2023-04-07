public class BmiService {
    public int calculate(double m, double kg) {
        return (int) (kg / (m * m));
    }
}