package features;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;

public class SeleniumTestData {
    private static Dotenv dotenv  = Dotenv.load();

    public static WebDriver webDriver;
    public static String baseUrl = dotenv.get("TEST_BASE_URL");
    public static String testUser = dotenv.get("TEST_USER");
    public static String testPass = dotenv.get("TEST_PASS");
}
