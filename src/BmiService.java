public class BmiService {
    public double calculate(double h, double w) {       /* тип double, чтоб в промежуточных расчетах не было округления иначе результат улетает */
        double count;
        count = w / Math.pow(h / 100, 2);               /* ИМТ = вес / рост ^ 2 (рост в метрах) */
        double result = Math.round(count * 10d) / 10d;  /* округление до 1 знака после запятой */
        return result;
    }
}