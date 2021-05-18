package by.bsu.task5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "firstTestServlet", value = "/test1")
public class FirstTestServlet extends HttpServlet {
    private static final String SERVLET = "/status";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher =  request.getRequestDispatcher(SERVLET);
        dispatcher.forward(request, response);
    }
}
