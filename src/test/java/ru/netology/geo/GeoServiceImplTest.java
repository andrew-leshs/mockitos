package ru.netology.geo;

import junit.framework.TestCase;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest extends TestCase {

    public void testByIp() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        assertEquals(new Location("New York", Country.USA, null,  0).getCountry(),
                geoService.byIp("96.125.78.58").getCountry());
    }
}