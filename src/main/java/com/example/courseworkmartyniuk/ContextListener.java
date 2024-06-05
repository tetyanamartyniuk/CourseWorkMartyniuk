package com.example.courseworkmartyniuk;

import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    private ThingDAO thingDao;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        thingDao = new ThingDAO();

        thingDao.addThing(new Thing("Ольга Іваненко", "Айфон 15 XS", "Київ, Печерський район",
                "Телефон Apple Iphone 15XS, має рожевий чохол з хелоу кіті, було знайдено біля магазину Фора, біля метро Печерська", new String[]{"телефон", "айфон", "гаджет", "печерська"}, false));
        thingDao.addThing(new Thing("Боднарчук Андрій", "Сумка PRADA", "Одеса",
                "Сумочка чорного кольору від бренду Прада, всередині був шкіряний гаманець червоного кольору, ключі, жуйка Орбіт та губна помада Nivea", new String[]{"сумка", "Прада", "Одеса", "брендова річ"}, false));
        thingDao.addThing(new Thing("Brigadir", "Футболка динамо", "Ковель",
                "jofvijdgperojeorkjfjff", new String[]{"road", "building", "Zhytomyr", "central road"}, false));
        thingDao.addThing(new Thing("Brigadir", "Ключі від квартири", "Ковель",
                "jofvijdgperojeorkjfjff", new String[]{"road", "building", "Zhytomyr", "central road"}, false));
        thingDao.addThing(new Thing("Brigadir", "Студентський квиток", "Львів",
                "jofvijdgperojeorkjfjff", new String[]{"road", "building", "Zhytomyr", "central road"}, false));
        thingDao.addThing(new Thing("Brigadir", "Айфон 13", "Ковель",
                "jofvijdgperojeorkjfjff", new String[]{"road", "building", "Zhytomyr", "central road"}, false));
        thingDao.addThing(new Thing("Brigadir", "лол", "Ковель",
                "jofvijdgperojeorkjfjff", new String[]{"road", "building", "Zhytomyr", "central road"}, false));
        thingDao.addThing(new Thing("Наталія","доля", "Видричі", "mkmjbvpofje" +
                "vnjefijveigjvejgvejg", new String[]{"kgkwrkgkg"}, false ));
        sce.getServletContext().setAttribute("thingDao", thingDao);
    }
}
