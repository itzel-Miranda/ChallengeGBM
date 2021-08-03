import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.challenge.pom.MainPage;
import com.challenge.pom.ResultsPage;

public class SearchTest {
	
	private WebDriver driver;
	MainPage mainPage;
	ResultsPage resultsPage;
	
	@Before
	public void setUp() {
		mainPage = new MainPage(driver);
		driver= mainPage.chromeDriver();
		mainPage.visit("https://www.amazon.com.mx/");
		resultsPage = new ResultsPage(driver);
		
	}
	
	@Test
	public void getResultsForPantallas() throws InterruptedException {
		mainPage.performSearch("Pantallas");
		// En la página se muestran 60 resultados (48 normales mas 12 patrocinados)
		System.out.println("Total de resultados para pantalla="+resultsPage.getResultsNumber());
		assertEquals(60,resultsPage.getResultsNumber());
	}

	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
