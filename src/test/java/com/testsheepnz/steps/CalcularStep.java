package com.testsheepnz.steps;

import com.testsheepnz.page.CalculadoraPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CalcularStep {
    private WebDriver driver;

    public CalcularStep(WebDriver driver) {
        this.driver = driver;
    }
    public void typeNro1(int nro1){
        this.driver.findElement(CalculadoraPage.nro1).sendKeys(String.valueOf(nro1));
    }
    public void typeNro1(String nro1){
        this.driver.findElement(CalculadoraPage.nro1).sendKeys(nro1);
    }
    public void typeNro2(int nro2){
        this.driver.findElement(CalculadoraPage.nro2).sendKeys(String.valueOf(nro2));
    }
    public void seleccionarOperador(int operacion){

        Select select = new Select(this.driver.findElement(CalculadoraPage.operacion));
        select.selectByIndex(operacion);
        /*
        WebElement select = this.driver.findElement(CalculadoraPage.operacion);

        List<WebElement> options = select.findElements(By.tagName("option"));
        for(int i = 0 ;i<options.size();i++){
            if (options.get(i).equals(String.valueOf(operacion))){
                options.get(i).isSelected();
            }
        }*/
    }
    public void calcular(){
        this.driver.findElement(CalculadoraPage.btncalcular).click();
    }
    public void limpiar(){
        this.driver.findElement(CalculadoraPage.btnclear).click();
    }
    public void chkbox(){
        this.driver.findElement(CalculadoraPage.integerSelect).click();
    }

    public String respuesta(){
        return this.driver.findElement(CalculadoraPage.respuesta).getAttribute("value");
    }
    public String errormsg(){
        return this.driver.findElement(CalculadoraPage.error).getText();
    }


}
