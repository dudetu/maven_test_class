import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceStationTest {

    PoliceStation policeStation = new PoliceStation();

    @Test
    public void test() {

        int expected = 3;
        int actual = policeStation.summarizeTwoCrimes(2, 2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Одно позитивное число, результат удовлетворяет правилам")
    public void summarizeTwoCrimes_onePositiveNumber_success() {
        //given
        int firstCrime = 2;
        int secondCrime = -4;
        int expected = 2;
        PoliceStation policeStation = new PoliceStation();


        //when
        int actual = policeStation.summarizeTwoCrimes(firstCrime, secondCrime);


        //then
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {

        int expected = 0;
        int actual = policeStation.summarizeTwoCrimes(0, 0);

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        int actual = policeStation.findAge(-10, 2);
    }

    @Test
    public void test4() {
        double actual = policeStation.summarizeTwoCrimes(0.2, 1.8);

        assertEquals(0.1, actual, 1e-10);
    }

}
