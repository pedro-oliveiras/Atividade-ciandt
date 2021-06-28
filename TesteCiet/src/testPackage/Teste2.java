package testPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste2 {
	
	static void teste2() {
		
		/*Funcionalidade: Busca no Banco de categorias
		Cenário: Busca por categoria específica
		Dado que navego para a página de busca do banco de categorias
		E digito 'Science: Computers' no campo de busca
		Quando clico no botão de buscar
		Então visualizo uma lista de postagens da categoria solicitada
		E verifico o controle de paginação*/
		
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
		
		//alterando o tipo de busca
		WebElement selection = driver.findElement(By.id("type"));
		selection.sendKeys("Category");
		
		//clicando no botao de busca
		WebElement botaobusca = driver.findElement(By.className("btn-default"));
		botaobusca.click();
		
		//encontrando o elemento de paginacao
		WebElement paginacao = driver.findElement(By.className("pagination-lg"));		
		String result = paginacao.getText();
		
		//imprimindo mensagem de existencia
		if(result.contentEquals("1")) 
		{
			System.out.println("Erro ao encontrar paginação.");
		}
		else 
		{
			System.out.println("Controle de paginação ok!");
		}
		
		//fechando o chrome
		driver.close();		
		
	}

}
