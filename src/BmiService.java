public class BmiService {
    public double calculate(double w, double h) {  /* тип double, чтоб в промежуточных расчетах не было округления иначе результат не бъется */
        double count;
        count = w / Math.pow(h / 100, 2);          /* ИМТ = вес / рост ^ 2 (рост в метрах) */
        long result = Math.round(count);           /* на тип int редактор ругался, предлагая тип long */
        return result;
    }
}