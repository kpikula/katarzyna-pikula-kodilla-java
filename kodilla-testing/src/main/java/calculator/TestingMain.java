package calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(10, 5);

        if (resultAdd == 15 ) {
            System.out.println("Kalkulator działa poprawnie, wynik dodawania to: " + resultAdd);
        } else {
            System.out.println(("Kalkulator nie działa poprawnie. Poprawny wynik dodawania to: " + resultAdd));
        }

        int resultSubstract = calculator.substract(10, 5);
        if (resultSubstract == 5 ) {
            System.out.println("Kalkulator działa poprawnie, wynik odejmowania to: " + resultSubstract);
        } else {
            System.out.println(("Kalkulator nie działa poprawnie. Poprawny wynik odejmowania to: " + resultSubstract));
        }
    }
}
