package com.example.courseworkmartyniuk.ControllerServlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.example.courseworkmartyniuk.ServiceLayer.ActionsWithThing;
import com.example.courseworkmartyniuk.DAOs.ThingDAO;
@WebServlet("/delete-thing-servlet")
public class DeleteThingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String place = request.getParameter("place");
        String info = request.getParameter("info");

        ThingDAO dao = (ThingDAO) getServletContext().getAttribute("thingDao");
        boolean success = dao.deleteThing(name, place, info);

        if (success) {
            response.sendRedirect("user-page-servlet");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}

