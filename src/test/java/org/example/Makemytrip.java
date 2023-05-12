package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Makemytrip extends Mmthelper
{
    @Test
    public void login()
    {
        WebElement username = getDriver().findElement(By.xpath("//input[@placeholder='From']"));
        username.sendKeys("New Delhi");

        WebElement password = getDriver().findElement(By.xpath("//input[@placeholder='To']"));
        password.sendKeys("Nagpur");

        WebElement search = getDriver().findElement(By.xpath("//a[@class=primaryBtn font24 latoBold widgetSearchBtn]"));
        search.click();

    }

}
