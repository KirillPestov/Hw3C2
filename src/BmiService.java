public class BmiService {
    public int calculate(int weight, double height) {

        double a = weight / (height * height);
        int bmi = (int) a;

        return bmi;

    }
}
