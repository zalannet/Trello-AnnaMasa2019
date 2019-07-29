package com.telran.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateBoardTest extends TestBase {
    @Test
    public void boadrdCreationTest() throws InterruptedException {
        clickOnLoginButton();
        fillUserForm("zalannet@yandex.ru", "hjrhjr27");
        confirmLoginButton();
        pause(10_000);

        clickOnPlusButtonOnHeader();
        selectCreateBoardFromDropDown();
        fillBoardCreationForm();
        confirmBoardCreation();
        clickOnHomeButtonOnHeader();


    }

    private void selectCreateBoardFromDropDown() {
        click(By.xpath("//*[@data-test-id='header-create-board-button']"));
    }

    private void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("[name = add]"));
    }

}
