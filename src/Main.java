public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 182;                                              /* рост в сантиметрах */
        int weight = 102;                                              /* вес в килограммах */
        double bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + bmi + " кг/кв.м");
    }
}