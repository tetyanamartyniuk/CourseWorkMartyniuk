package com.example.courseworkmartyniuk.ServiceLayer.Interfaces;
import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;
import java.util.ArrayList;
import java.util.List;

public interface UserInterface {
    List<Thing> searchByKeyWords(ThingDAO dao, String[] keywords);

    ArrayList<Thing> viewAllThings(ThingDAO dao);
    ArrayList<Thing> searchByPlace(ThingDAO dao, String place);

}
