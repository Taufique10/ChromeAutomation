package com.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConfig {

    public static WebDriver driver;

    public static void main(String[] args) {

    }
    public static void launch_Chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();


    }
}

