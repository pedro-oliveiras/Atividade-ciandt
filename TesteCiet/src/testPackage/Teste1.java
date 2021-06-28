package testPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste1 {
	
	static void teste1() {
		
		/*Funcionalidade: Busca no Banco de Questões
		Cenário: Busca por questão inexistente
		Dado que navego para a página de busca do banco de questões
		E digito 'Science: Computers' no campo de busca
		Quando clico no botão de buscar
		Então visualizo uma mensagem de erro com o texto 'No questions found.'*/		

		//iniciando webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\jogos\\Chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		//adicionando temporizador
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//abrindo o site
                driver.get("https://opentdb.com");		
		
        	//encontrando o botao browse
		WebElement caixabrowse = driver.findElement(By.className("fa-bars"));
		caixabrowse.click();
		
		//pesquisando o tema desejado
		WebElement caixabusca = driver.findElement(By.id("query"));
		caixabusca.sendKeys("Science: Computers");
		
		//clicando no botao de busca
		WebElement botaobusca = driver.findElement(By.className("btn-default"));
		botaobusca.click();		
		
		//pegando a mensagem de erro
		WebElement alerta = driver.findElement(By.className("alert-danger"));
		String resultado = alerta.getText();
		
		//imprimindo mensagem de erro
		System.out.println("Resultado do teste: " + resultado);
		
		//fechando o chrome
		driver.close();		
		
	}
}
