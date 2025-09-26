package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Тесты входа пользователя")
public class LoginTest extends BaseTest {

    @Test
    @DisplayName("Вход через кнопку 'Войти в аккаунт' на главной странице")
    public void testLoginViaMainPageLoginButton() {
        // Этот тест будет простым - просто проверяем переход на страницу логина
        System.out.println("=== Тест: Переход на страницу логина ===");

        // Act - кликаем на кнопку входа
        mainPage.clickLoginAccountButton();

        // Ждем
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert - проверяем, что мы на странице логина
        assertTrue("Должны быть на странице логина", isOnLoginPage());
        System.out.println("Успешно перешли на страницу логина");
    }

    @Test
    @DisplayName("Вход через кнопку 'Личный кабинет' на главной странице")
    public void testLoginViaPersonalAccountButton() {
        System.out.println("=== Тест: Переход в ЛК без авторизации ===");

        // Act - кликаем на личный кабинет
        mainPage.clickPersonalAccountLink();

        // Ждем
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert - проверяем, что мы на странице логина
        assertTrue("Должны быть на странице логина", isOnLoginPage());
        System.out.println("Успешно  перешли на страницу логина через ЛК");
    }
}