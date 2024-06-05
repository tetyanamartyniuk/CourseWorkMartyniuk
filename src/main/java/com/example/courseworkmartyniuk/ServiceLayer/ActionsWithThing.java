package com.example.courseworkmartyniuk.ServiceLayer;

import java.util.List;
import java.util.ArrayList;
import com.example.courseworkmartyniuk.ServiceLayer.Interfaces.UserInterface;
import com.example.courseworkmartyniuk.DAOs.ThingDAO;

public class ActionsWithThing implements UserInterface {

    public ArrayList<Thing> viewAllThings(ThingDAO dao) {
        return dao.getDataBase();
    }

    @Override
    public List<Thing> searchByKeyWords(ThingDAO dao, String[] keywords) {
        List<Thing> result = new ArrayList<>();
        for (Thing t : dao.getDataBase()) {
            for (String keyword : keywords) {
                for (String kw : t.getKeyWords()) {
                    if (kw.equalsIgnoreCase(keyword)) {
                        result.add(t);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public ArrayList<Thing> searchByPlace(ThingDAO dao, String place) {
        ArrayList<Thing> result = new ArrayList<>();
        ArrayList<Thing> thingList = viewAllThings(dao);
        String placeLowerCase = place.toLowerCase();
        for (Thing t : thingList) {
            String thingPlace = t.getPlace().toLowerCase();
            if (thingPlace.contains(placeLowerCase)) {
                result.add(t);
            }
        }
        return result;
    }

    public ArrayList<Thing> searchByName(ThingDAO dao, String name) {
        ArrayList<Thing> nameResult = new ArrayList<>();
        ArrayList<Thing> thingList = viewAllThings(dao);
        String searchNameLower = name.toLowerCase();

        for (Thing t : thingList) {
            String fullNameLower = t.getName().toLowerCase();

            if (fullNameLower.equals(searchNameLower)) {
                nameResult.add(t);
                continue;
            }
            String[] words = fullNameLower.split("\\s+");

            for (String word : words) {
                if (word.equals(searchNameLower)) {
                    nameResult.add(t);
                    break;
                }
            }
        }
        return nameResult;
    }


}
