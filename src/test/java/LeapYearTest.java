import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.LeapYear;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeapYearTest {

  LeapYear leapYear;

  @BeforeEach
  public void setUp(){
    leapYear = new LeapYear();
  }

  @Test
  public void shouldReturnLeapYearTrue_For1996() {
    assertTrue(leapYear.isLeapYear(1996));
  }

  @Test
  public void shouldReturnLeapYearFalse_For2001() {
    assertFalse(leapYear.isLeapYear(2001));
  }

  @Test
  public void shouldReturnLeapYearFalse_For2002() {
    assertFalse(leapYear.isLeapYear(2002));
  }
}


