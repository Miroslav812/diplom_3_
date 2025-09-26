package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Тесты выхода из аккаунта")
public class LogoutTest extends BaseTest {

    @Test
    @DisplayName("Переход в личный кабинет без авторизации")
    public void testNavigateToPersonalAccountWithoutLogin() {
        // Этот тест проверяет переход в ЛК без авторизации
        System.out.println("=== Тест: Переход  в ЛК без авторизации ===");

        // Act - переходим в личный кабинет
        mainPage.clickPersonalAccountLink();

        // Ждем
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert - должны быть перенаправлены на логин
        assertTrue("Должны быть на странице логина", isOnLoginPage());
        System.out.println("Успешно перенаправлены на страницу логина");
    }
}