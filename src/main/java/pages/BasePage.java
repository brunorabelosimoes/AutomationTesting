package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import config.Driver;

public class BasePage {

	WebDriver driver = Driver.getDriver();

	
	public void acessarUrl() {
		driver.get("http://demo.automationtesting.in/Register.html");
	}

	public void acessarUrl(String url) {
		driver.get(url);
	}
	
	public void selecionarPorValue(WebElement elemento, String valor) {
		Select selectDateDays = new Select(elemento);
		selectDateDays.selectByValue(valor);
	}
	
	public void selecionarPorTexto(WebElement elemento, String texto) {
		Select selectDateDays = new Select(elemento);
		selectDateDays.selectByVisibleText(texto);
	}
}