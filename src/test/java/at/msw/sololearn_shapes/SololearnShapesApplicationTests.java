package at.msw.sololearn_shapes;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SololearnShapesApplicationTests {



    @Test
    void contextLoads() {
    }

    Square square = new Square();

    @Test
    void testArea() {
        // arrange
        double width = 2;
        // act
        double result = this.square.area(width);
        // assert
        assertEquals(4, result);
    }

}
