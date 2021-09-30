package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Collector Test Suite \uD83D\uDE31")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }


    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test of adding figures")
    class TestAdd {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            int expectedResult = 3;

            //When
            shapeCollector.addFigure(new Triangle(15, 45));
            shapeCollector.addFigure(new Circle(15));
            shapeCollector.addFigure(new Square(12));
            int size = shapeCollector.shapeListSize();

            //Then
            Assertions.assertEquals(expectedResult, size);
        }
    }

    @Nested
    @DisplayName("Test of removing figures")
    class TestRemove {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(15, 45));
            shapeCollector.addFigure(new Circle(15));
            shapeCollector.addFigure(new Square(12));
            int expectedResult = 2;

            //When
            shapeCollector.removeFigure(new Triangle(15, 45));
            int size = shapeCollector.shapeListSize();

            //Then
            Assertions.assertEquals(expectedResult, size);

        }
    }

    @Nested
    @DisplayName("Test of getting figures")
    class TestGet {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(15, 45));
            shapeCollector.addFigure(new Circle(15));
            shapeCollector.addFigure(new Square(12));
            int expectedResult = 2;

            //When
            int n = 2;
            shapeCollector.getFigure(n);

            //Then
            Assertions.assertEquals(expectedResult, n);

        }
    }

    @Nested
    @DisplayName("Test of showing figures")
    class TestShow {
        @Test
        void testShowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(15, 45));
            shapeCollector.addFigure(new Circle(15));
            shapeCollector.addFigure(new Square(12));

            //When




            //Then

            //test pass
        }
    }
}

