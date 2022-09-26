package ru.netology.i18n;

import junit.framework.TestCase;
import ru.netology.entity.Country;

public class LocalizationServiceImplTest extends TestCase {

    public void testLocale() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        assertEquals("Welcome", localizationService.locale(Country.BRAZIL));
    }
}