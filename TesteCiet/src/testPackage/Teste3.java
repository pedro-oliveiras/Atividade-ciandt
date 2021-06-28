package testPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste3 {
	
	static void teste3() {
		
		/*Funcionalidade: Busca no Banco de Usuários
		Cenário: Busca por usuário específico
		Dado que navego para a página de busca do banco de usuários
		E digito 'Coldflame' no campo de busca
		Quando clico no botão de buscar
		Então visualizo uma lista de postagens do usuário*/
		
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
		caixabusca.sendKeys("Coldflame");
		
		//alterando o tipo de busca
		WebElement selection = driver.findElement(By.id("type"));
		selection.sendKeys("User");
		
		//clicando no botao de busca
		WebElement botaobusca = driver.findElement(By.className("btn-default"));
		botaobusca.click();		
		
		//verificando se a busca foi realizada corretamente
		WebElement teste = driver.findElement(By.linkText("Coldflame"));
		String testes = teste.getText();
		
		//imprimindo mensagem
		if(testes.contentEquals("Coldflame"))
		{
			System.out.println("Busca realizada com sucesso.");
		}
		else 
		{
			System.out.println("Erro ao buscar elemento.");
		}
		
		driver.close();		
	}
}
