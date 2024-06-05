package com.example.courseworkmartyniuk.DAOs;

import com.example.courseworkmartyniuk.ServiceLayer.Thing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ThingDAO {
    private final ArrayList<Thing> dataBase = new ArrayList<>();
    private final ArrayList<Thing> userThings = new ArrayList<>();

    public boolean createThing(String publisher, String name, String place, String info, String[] keywords, boolean userAdded) {
        Thing newThing = new Thing(publisher, name, place, info, keywords, userAdded);
        if (!dataBase.contains(newThing)) {
            if (userAdded) {
                userThings.add(newThing);
            }
            return dataBase.add(newThing);
        }
        return false;
    }

    public boolean deleteThing(String name, String place, String info) {
        Iterator<Thing> iterator = dataBase.iterator();
        while (iterator.hasNext()) {
            Thing t = iterator.next();
            if (t.getName().equals(name) && t.getPlace().equals(place) && t.getInfo().equals(info) ) {
                iterator.remove();
                if (t.isUserAdded()) {
                    userThings.remove(t);
                }
            }
        }return true;
    }
    public ArrayList<Thing> getDataBase() {
        return dataBase;
    }

    public boolean addThing(Thing thing) {
        if (!dataBase.contains(thing)) {
            if (thing.isUserAdded()) {
                userThings.add(thing);
            }
            return dataBase.add(thing);
        }
        return false;
    }

    public List<Thing> getUserThings() {
        return new ArrayList<>(userThings);
    }


    public Thing searchById(String name, String place, String publisher, String info) {
        for (Thing t : dataBase) {
            if (t.getName().equals(name) && t.getPlace().equals(place) && t.getPublisher().equals(publisher) && t.getInfo().equals(info)) {
                return t;
            }
        }
        return null;
    }

    public List<Thing> viewAllThings() {
        return new ArrayList<>(dataBase);
    }
}


