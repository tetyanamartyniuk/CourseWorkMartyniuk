package com.example.courseworkmartyniuk.ControllerServlets;

import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.ActionsWithThing;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet( "/search-things-by-place-servlet")

public class SearchByPlaceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThingDAO dao = (ThingDAO) req.getServletContext().getAttribute("thingDao");
        String place = req.getParameter("place");
        List<Thing> thingByPlaceList = new ActionsWithThing().searchByPlace(dao, place);
        req.setAttribute("thingByPlaceList", thingByPlaceList);
        req.getRequestDispatcher("SearchByPlaceResult.jsp").forward(req, resp);
    }
}
