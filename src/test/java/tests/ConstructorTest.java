package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

@DisplayName("Тесты конструктора")
public class ConstructorTest extends BaseTest {

    @Test
    @DisplayName("Переход к разделу 'Булки'")
    public void testNavigateToBunsSection() {
        System.out.println("=== Тест: Переход к разделу 'Булки' ===");

        // Сначала переходим к другому разделу, затем возвращаемся к булкам
        try {
            // Переходим к соусам
            System.out.println("Переходим к разделу 'Соусы'");
            mainPage.clickSaucesSection();
            Thread.sleep(2000);

            // Теперь переходим к булкам
            System.out.println("Переходим к разделу 'Булки'");
            mainPage.clickBunsSection();
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert
        assertTrue("Должна быть активна вкладка 'Булки'",
                mainPage.isBunsSectionActive());
        System.out.println("Раздел 'Булки' активен");
    }

    @Test
    @DisplayName("Переход к разделу 'Соусы'")
    public void testNavigateToSaucesSection() {
        System.out.println("=== Тест: Переход к разделу 'Соусы' ===");

        // Act
        try {
            mainPage.clickSaucesSection();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert
        assertTrue("Должна быть активна вкладка 'Соусы'",
                mainPage.isSaucesSectionActive());
        System.out.println("Раздел 'Соусы' активен");
    }

    @Test
    @DisplayName("Переход к разделу 'Начинки'")
    public void testNavigateToFillingsSection() {
        System.out.println("=== Тест: Переход к разделу 'Начинки' ===");

        // Act
        try {
            mainPage.clickFillingsSection();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Assert
        assertTrue("Должна быть активна вкладка 'Начинки'",
                mainPage.isFillingsSectionActive());
        System.out.println("Раздел 'Начинки' активен");
    }

    @Test
    @DisplayName("Навигация по всем разделам конструктора")
    public void testAllConstructorSectionsNavigation() {
        System.out.println("=== Тест: Навигация по всем разделам ===");

        try {
            // 1. Переходим к соусам
            System.out.println("1. Переходим к разделу 'Соусы'");
            mainPage.clickSaucesSection();
            Thread.sleep(1000);
            assertTrue("Должна быть активна вкладка 'Соусы'", mainPage.isSaucesSectionActive());

            // 2. Переходим к начинкам
            System.out.println("2. Переходим к разделу 'Начинки'");
            mainPage.clickFillingsSection();
            Thread.sleep(1000);
            assertTrue("Должна быть активна вкладка 'Начинки'", mainPage.isFillingsSectionActive());

            // 3. Возвращаемся к булкам
            System.out.println("3. Возвращаемся к разделу 'Булки'");
            mainPage.clickBunsSection();
            Thread.sleep(1000);
            assertTrue("Должна быть активна вкладка 'Булки'", mainPage.isBunsSectionActive());

            System.out.println("Навигация по всем разделам работает корректно");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}