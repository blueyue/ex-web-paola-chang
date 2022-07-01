package com.testsheepnz.steps;


import com.testsheepnz.page.CalculadoraPage;
import com.testsheepnz.page.ResultadoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoStep {


    private WebDriver driver;

    public ResultadoStep(WebDriver driver) {
        this.driver = driver;
    }
    public String respuesta(){
        return this.driver.findElement(CalculadoraPage.respuesta).getAttribute("text");
    }
}
