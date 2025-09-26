package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Тесты регистрации пользователя")
public class RegistrationTest extends BaseTest {

    @Test
    @DisplayName("Переход на страницу регистрации")
    public void testNavigateToRegistrationPage() {
        System.out.println("=== Тест: Переход на страницу регистрации ===");

        // Act - переходим на страницу регистрации
        mainPage.clickLoginAccountButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        loginPage.clickRegisterLink();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert - проверяем, что мы на странице регистрации
        assertTrue("Должны быть на странице регистрации",
                driver.getCurrentUrl().contains("/register"));
        System.out.println("Успешно перешли на страницу регистрации");
    }

    @Test
    @DisplayName("Переход на страницу восстановления пароля")
    public void testNavigateToPasswordRecoveryPage() {
        System.out.println("=== Тест: Переход на страницу восстановления пароля ===");

        // Act - переходим на страницу восстановления пароля
        mainPage.clickLoginAccountButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        loginPage.clickForgotPasswordLink();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert - проверяем, что мы на странице восстановления пароля
        assertTrue("Должны быть на странице восстановления пароля",
                driver.getCurrentUrl().contains("/forgot-password"));
        System.out.println("Успешно перешли на страницу восстановления пароля");
    }
}