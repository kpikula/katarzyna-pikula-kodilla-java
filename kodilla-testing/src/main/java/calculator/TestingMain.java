package calculator;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();
            if (result.equals("theForumUser")) {
                System.out.println("test OK");
            } else {
                System.out.println("Error!");
            }

            // Testing Calculator class
            Calculator calculator = new Calculator();
            int addResult = calculator.add(180, 19);
            int subResult = calculator.subtract(200, 150);
            if (addResult == 199) {
                System.out.println("Calculator test OK");
            } else {
                System.out.println("Calculator has error!");
            }
        }
    }
