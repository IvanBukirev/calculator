public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);


        // Ошибка возникает при делении на ноль.
        // 1 - 1+2=3
        // 2 - 1-1=0
        // 3 - 3:0 - на ноль делить нельзя


    }
}