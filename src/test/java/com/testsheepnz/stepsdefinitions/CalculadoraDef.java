package com.testsheepnz.stepsdefinitions;


import com.testsheepnz.page.CalculadoraPage;
import com.testsheepnz.steps.CalcularStep;
import com.testsheepnz.steps.ResultadoStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculadoraDef {

    private WebDriver driver;
    private Scenario scenario;

    @Before(order=0)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Poaty\\IdeaProjects\\pruebas\\ex-web-paola-chang\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Before(order=1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @Dado("que me encuentro en la pagina de la calculadora")
    public void queMeEncuentroEnLaPaginaDeLaCalculadora() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenshot();
    }
    @Cuando("sumo el nro {int} y el {int}")
    public void sumoElNroYEl(int nro1, int nro2) {
        CalcularStep calcularStep = new CalcularStep(driver);
        calcularStep.typeNro1(nro1);
        calcularStep.typeNro2(nro2);
        calcularStep.seleccionarOperador(0);
        calcularStep.chkbox();
        calcularStep.calcular();
    }

    @Cuando("resto el nro {int} y el {int}")
    public void restoElNroYEl(int arg0, int arg1) {
        CalcularStep calcularStep = new CalcularStep(driver);
        calcularStep.typeNro1(arg0);
        calcularStep.typeNro2(arg1);
        calcularStep.seleccionarOperador(1);
        calcularStep.calcular();
    }

    @Cuando("multiplico el nro {int} y el {int}")
    public void multiplicoElNroYEl(int nro1, int nro2) {
        CalcularStep calcularStep = new CalcularStep(driver);
        calcularStep.typeNro1(nro1);
        calcularStep.typeNro2(nro2);
        calcularStep.seleccionarOperador(2);
        calcularStep.calcular();
    }

    @Cuando("divido el nro {int} y el {int}")
    public void dividoElNroYEl(int nro1, int nro2) {
        CalcularStep calcularStep = new CalcularStep(driver);
        calcularStep.typeNro1(nro1);
        calcularStep.typeNro2(nro2);
        calcularStep.seleccionarOperador(3);
        calcularStep.calcular();
    }

    /*@Cuando("resto el nro {string} y el {int}")
    public void restoElNroYEl(String nro1, int nro2) {
        
    }*/
    @Cuando("resto el nro {string} y el {int} de forma erronea")
    public void restoElNroYElDeFormaErronea(String nro1, int nro2) {

        CalcularStep calcularStep = new CalcularStep(driver);
        calcularStep.typeNro1(nro1);
        calcularStep.typeNro2(nro2);
        calcularStep.seleccionarOperador(1);
        calcularStep.calcular();
    }
    /*public ResultadoStep resultadoStep  (WebDriver driver){
        return new ResultadoStep(driver);
    }*/

    public CalcularStep calcularStep (WebDriver driver){
        return new CalcularStep(driver);
    }
    @Entonces("obtendré como respuesta {int}")
    public void obtendréComoRespuesta(int respuesta) {
        String valor = calcularStep(driver).respuesta();
        Assertions.assertEquals(String.valueOf(respuesta),valor);
        calcularStep(driver).limpiar();
    }



    public void screenshot(){
        byte[] evidencia = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia,"image/png","evidencia");
    }


    @Entonces("obtendré como respuesta error")
    public void obtendréComoRespuestaError() {
        String valor = calcularStep(driver).errormsg();
        Assertions.assertEquals("Number 1 is not a number",valor);
        calcularStep(driver).limpiar();
    }



}
