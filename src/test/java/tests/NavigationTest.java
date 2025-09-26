package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Тесты навигации")
public class NavigationTest extends BaseTest {

    @Test
    @DisplayName("Переход по вкладкам конструктора")
    public void testConstructorTabsNavigation() {
        System.out.println("=== Тест: Навигация по вкладкам конструктора ===");

        // Act & Assert - проверяем переход по вкладкам
        try {
            // Переходим к соусам
            mainPage.clickSaucesSection();
            Thread.sleep(1000);
            assertTrue("Должна быть активна вкладка 'Соусы'", mainPage.isSaucesSectionActive());

            // Переходим к начинкам
            mainPage.clickFillingsSection();
            Thread.sleep(1000);
            assertTrue("Должна быть активна вкладка 'Начинки'", mainPage.isFillingsSectionActive());

            // Возвращаемся к булкам
            mainPage.clickBunsSection();
            Thread.sleep(1000);
            assertTrue("Должна быть активна вкладка 'Булки'", mainPage.isBunsSectionActive());

            System.out.println("Навигация по вкладкам работает корректно");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Test
    @DisplayName("Переход на главную через логотип")
    public void testNavigateToMainViaLogo() {
        System.out.println("=== Тест: Переход через логотип ===");

        // Сначала переходим на страницу логина
        mainPage.clickLoginAccountButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Act - кликаем на логотип
        mainPage.clickLogo();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert - должны быть на главной странице
        assertTrue("Должны быть  на главной странице", isOnMainPage());
        System.out.println("Успешно вернулись на главную через логотип");
    }
}