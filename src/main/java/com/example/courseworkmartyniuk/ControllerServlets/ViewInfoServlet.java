package com.example.courseworkmartyniuk.ControllerServlets;

import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/view-info-servlet")
public class ViewInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String place = req.getParameter("place");
        String publisher = req.getParameter("publisher");
        String info = req.getParameter("info");

        ThingDAO thingDao = (ThingDAO) getServletContext().getAttribute("thingDao");
        Thing thing = thingDao.searchById(name, place, publisher, info);

        if (thing != null) {
            String keywords = String.join(", ", thing.getKeyWords());

            req.setAttribute("thing", thing);
            req.setAttribute("keywords", keywords);
            if (thing.isUserAdded()){
                req.getRequestDispatcher("ViewInfoForUser.jsp").forward(req,resp);
            }else{
                req.getRequestDispatcher("ViewInfo.jsp").forward(req, resp);
            }
        } else {
            req.setAttribute("errorMessage", "Річ не знайдена");
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }
}










