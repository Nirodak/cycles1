import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "3,300,400"
    })
    public void testSqrService(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.sqrtCalc(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
