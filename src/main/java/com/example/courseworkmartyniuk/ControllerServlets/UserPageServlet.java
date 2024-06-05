package com.example.courseworkmartyniuk.ControllerServlets;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.ServletException;


@WebServlet("/user-page-servlet")
public class UserPageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ThingDAO dao = (ThingDAO) getServletContext().getAttribute("thingDao");

        List<Thing> userThings = dao.getUserThings();

        request.setAttribute("userThings", userThings);

        request.getRequestDispatcher("UserThingPage.jsp").forward(request, response);
    }
}
