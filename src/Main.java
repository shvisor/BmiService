public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeter = 1.82;                                              /* рост в сантиметрах */
        int weightKilo = 102;                                              /* вес в килограммах */
        double index = service.calculate(heightMeter, weightKilo);
        System.out.println("Индекс массы тела: " + index + " кг/кв.м");
    }
}