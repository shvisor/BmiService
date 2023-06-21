public class BmiService {
    public double calculate(double height, int weight) {       /* тип double, чтоб в промежуточных расчетах не было округления иначе результат улетает */
        double index = weight / Math.pow(height, 2);               /* ИМТ = вес / рост ^ 2 (рост в метрах) */
        return (int) index;
    }
}