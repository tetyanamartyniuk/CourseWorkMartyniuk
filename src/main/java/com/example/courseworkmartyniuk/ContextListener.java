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
                "Телефон Apple Iphone 15XS, має рожевий чохол з хелоу кіті, було знайдено біля магазину Фора, біля метро Печерська", new String[]{"телефон", "айфон", "гаджет", "печерська"}, false,"380457683123"));
        thingDao.addThing(new Thing("Боднарчук Андрій", "Сумка PRADA", "Одеса",
                "Сумочка чорного кольору від бренду Прада, всередині був шкіряний гаманець червоного кольору, ключі, жуйка Орбіт та губна помада Nivea", new String[]{"сумка", "Прада", "Одеса", "брендова річ"}, false, "380665786214"));
        thingDao.addThing(new Thing("Іван Марченко", "Футболка динамо", "Ковель",
                "Дуже класна футболка, яку загубив фанат", new String[]{"футболка", "динамо", "Ковель", "спортивна футболка"}, false,"380257894512"));
        thingDao.addThing(new Thing("Олена Іванчук", "Ключі від квартири", "Ковель",
                "Ключі від квартири з червоним брелком", new String[]{"ключі", "червоний брелок", "Ковель", "зв'язка ключів"}, false,"380664789632"));
        thingDao.addThing(new Thing("Сизоненко Анна", "Студентський квиток", "Київ, Андріївський узвіз",
                "студентський квиток КПІ, на ім'я Сизоненко Анни Олегівни", new String[]{"студентський", "білет", "КПІ", "студентка"}, false,"380753264585"));
        thingDao.addThing(new Thing("Кіптик Анастасія", "Айфон 13", "Ковель",
                "Знайшли телефон з чорним чохлом, під ним була картка ПриватБанку", new String[]{"телефон", "айфон", "карта", "ПриватБанк"}, false, "380998564994"));
        thingDao.addThing(new Thing("Мартинюк Тетяна", "Сумка JW pei", "Київ",
                "Знайшли сумку JW pei чорного кольору, в ній була картка, вологі серветки та дзеркальце", new String[]{"JW pei", "сумка", "Київ", "стильна сумка"}, false,"380992564714"));
        thingDao.addThing(new Thing("Наталія","Сережка Pandora", "Одеса",
                "Срібні сережки з камінчиком від бренду Pandora, знайшли на пляжі поблизу Аркадії", new String[]{"сережки", "срібло", "Pandora"}, false,"380754581245"));
        sce.getServletContext().setAttribute("thingDao", thingDao);
    }
}
