package by.bsu.task8.entity;

import org.testng.annotations.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.List;

import static org.testng.Assert.*;

public class AdCollectionTest {
    private Advertisement advertisement;
    AdCollection adCollection;

    @BeforeTest
    public void setUp() {
        adCollection = new AdCollection();
        advertisement = new Advertisement();
        advertisement.setId("1");
        advertisement.setDescription("Аквапарк \"Фристайл\": аквазона от 15 руб/3 часа, аквазона + 6 бань от 35 руб/до 6 часов");
        advertisement.setCreationDate(LocalDate.of(2021, 1,20));
        advertisement.setWebLink("www.free-style.by/");
        advertisement.setVendor("Аквапарк \"Фристайл\"");
        advertisement.setPhotoLink("https://www.free-style.by/assets/img/akvapark/photo/%D0%9E%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD%D0%B5%D1%80%20%D0%92%D0%BB%D0%B0%D0%B4%20%D0%91%D0%BE%D1%80%D0%B8%D1%81%D0%B5%D0%B2%D0%B8%D1%87%20(26)-min.jpg");
        advertisement.setDeadlineDate(LocalDate.of(2021, 8,1));
        advertisement.setDiscount(30);
        advertisement.setRating(4.2f);
        advertisement.setHashTags(List.of("Развлечения", "Аквапарки", "Бассейны", "Спорт", "Здоровье"));
    }

    @Test
    public void addTest() {
        assertTrue(adCollection.add(advertisement));
    }

    @Test
    public void validateTestOk() {
        assertTrue(adCollection.validate(advertisement));
    }

    @Test
    public void validateTestFalse() {
        LocalDate date = LocalDate.of(2030, 10, 10);
        advertisement.setCreationDate(date);
        assertFalse(adCollection.validate(advertisement));
    }

    @AfterTest
    public void tearDown() {
        advertisement = null;
        adCollection = null;
    }
}