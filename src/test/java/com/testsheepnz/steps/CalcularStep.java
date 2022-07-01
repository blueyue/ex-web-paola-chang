package com.testsheepnz.steps;

import com.testsheepnz.page.CalculadoraPage;
import org.openqa.selenium.WebDriver;

public class CalcularStep {
    private WebDriver driver;

    public CalcularStep(WebDriver driver) {
        this.driver = driver;
    }
    public void typeNro1(int nro1){
        this.driver.findElement(CalculadoraPage.nro1).sendKeys(String.valueOf(nro1));
    }
    public void typeNro2(int nro2){
        this.driver.findElement(CalculadoraPage.nro2).sendKeys(String.valueOf(nro2));
    }
    public void seleccionarOperador(int operacion){
        this.driver.findElement(CalculadoraPage.operacion).sendKeys(String.valueOf(operacion));
    }
    public void calcular(){
        this.driver.findElement(CalculadoraPage.btncalcular).click();
    }
    public void limpiar(){
        this.driver.findElement(CalculadoraPage.btnclear).click();
    }

}
