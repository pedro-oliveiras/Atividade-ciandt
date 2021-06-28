package testPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste2 {
	
	static void teste2() {
		
		/*Funcionalidade: Busca no Banco de categorias
		Cen�rio: Busca por categoria espec�fica
		Dado que navego para a p�gina de busca do banco de categorias
		E digito 'Science: Computers' no campo de busca
		Quando clico no bot�o de buscar
		Ent�o visualizo uma lista de postagens da categoria solicitada
		E verifico o controle de pagina��o*/
		
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
			System.out.println("Erro ao encontrar pagina��o.");
		}
		else 
		{
			System.out.println("Controle de pagina��o ok!");
		}
		
		//fechando o chrome
		driver.close();		
		
	}

}
