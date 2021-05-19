import com.example.springdocker.MyMathCalc;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/**
 * created by Mimi Santana
 * Date: 2021-05-14
 * Time: 13:08
 * Project: spring-docker-demo
 * Copyright: MIT
 */


public class MathCalcTest {


    @Test
    void adding(){
        MyMathCalc m = new MyMathCalc();

        int expected = 2;
        int actual = m.add(1,1);
        assertEquals(expected, actual);
    }
    @Test
    void multiply(){
        MyMathCalc m = new MyMathCalc();

        int expected = 10;
        int actual = m.multiply(2,5);
        assertEquals(expected,actual);
    }

    @Test
    void divide(){
        MyMathCalc m = new MyMathCalc();

        int expected = 2;
        double actual = m.divide(4,2);
        assertEquals(expected,actual);
    }

    @Test
    void calcThrows(){
        MyMathCalc m = new MyMathCalc();

        assertThrows(ArithmeticException.class, ()-> m.divide(3,0));
    }





}
