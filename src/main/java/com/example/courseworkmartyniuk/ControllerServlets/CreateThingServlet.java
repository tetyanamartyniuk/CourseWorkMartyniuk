package com.example.courseworkmartyniuk.ControllerServlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.example.courseworkmartyniuk.DAOs.ThingDAO;

@WebServlet("/create-thing-servlet")
public class CreateThingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String publisher = request.getParameter("publisher");
            String name = request.getParameter("name");
            String place = request.getParameter("place");
            String info = request.getParameter("info");
            String keywordsInput = request.getParameter("keywords").trim();

            String[] keyWordsArray = keywordsInput.split("\\s*,\\s*");
            String keywordsWithCommas = String.join(", ", keyWordsArray);

            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Назва речі є обов'язковою");
            }
            if (publisher == null || publisher.trim().isEmpty()) {
                throw new IllegalArgumentException("Ім'я публікатора речі є обов'язковою");
            }


            ThingDAO dao = (ThingDAO) getServletContext().getAttribute("thingDao");

            boolean success = dao.createThing(publisher, name, place, info, keyWordsArray, true);

            if (success) {
                request.setAttribute("publisher", publisher);
                request.setAttribute("name", name);
                request.setAttribute("place", place);
                request.setAttribute("info", info);
                request.setAttribute("keywordsString", keywordsWithCommas);
                request.getRequestDispatcher("CreationSuccess.jsp").forward(request, response);
            } else {
                response.sendRedirect("error.jsp");
            }
        } catch (IllegalArgumentException e) {
            request.setAttribute("errorMessage", e.getMessage());
            request.getRequestDispatcher("error-missing-parameter.jsp").forward(request, response);
        }
    }
}











