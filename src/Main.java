public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 102;                           /* вес в килограммах */
        int height = 182;                           /* рост в сантиметрах */
        double bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + bmi + " кг/кв.м");
    }
}