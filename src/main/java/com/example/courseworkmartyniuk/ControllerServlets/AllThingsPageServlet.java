package com.example.courseworkmartyniuk.ControllerServlets;
import com.example.courseworkmartyniuk.DAOs.ThingDAO;
import com.example.courseworkmartyniuk.ServiceLayer.Thing;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/all-things-page-servlet")
public class AllThingsPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ThingDAO dao = (ThingDAO) req.getServletContext().getAttribute("thingDao");
        List<Thing> allThings = dao.viewAllThings();
        req.setAttribute("allThings", allThings);
        req.getRequestDispatcher("allThingsPage.jsp").forward(req, resp);
    }
}


