public class BmiService {
    public double calculate(double w, double h) {
        double count;
        count = w / Math.pow(h / 100, 2);          /* ИМТ = вес / рост ^ 2 (рост в метрах) */
        long result = Math.round(count);
        return result;
    }
}