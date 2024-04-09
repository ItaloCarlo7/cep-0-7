package config;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IniciarTeste extends Drivers {

	
	
	static String ambiente = "https://buscacepinter.correios.com.br/app/endereco/index.php";
	
	
	public static void configurarAmbiente () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();		
		
		
	}
	
	public static void encerrarTeste() {
		//driver.quit();
	}
	
	
	
}
