package com.example.courseworkmartyniuk.ControllerServlets;
import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.ActionsWithThing;
import com.example.courseworkmartyniuk.ServiceLayer.Interfaces.UserInterface;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/search-things-by-keywords-servlet")
public class SearchThingsByKeyWordsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThingDAO dao = (ThingDAO) req.getServletContext().getAttribute("thingDao");

        String keyword = req.getParameter("keyword");
        UserInterface execute = new ActionsWithThing();

        String[] keywords = keyword != null ? keyword.split(",") : new String[0];

        List<Thing> searchResults = execute.searchByKeyWords(dao, keywords);

        req.setAttribute("allThings", searchResults);

        req.getRequestDispatcher("SearchByKeyWordsResult.jsp").forward(req, resp);
    }
}