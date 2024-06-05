package com.example.courseworkmartyniuk.ControllerServlets;

import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;
import com.example.courseworkmartyniuk.ServiceLayer.ActionsWithThing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet( "/search-things-servlet")
public class SearchByNameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThingDAO dao = (ThingDAO) req.getServletContext().getAttribute("thingDao");
        String name = req.getParameter("name");
        List<Thing> thingList = new ActionsWithThing().searchByName(dao, name);
        req.setAttribute("thingList", thingList);
        req.getRequestDispatcher("SearchByNameResult.jsp").forward(req, resp);
    }
}

