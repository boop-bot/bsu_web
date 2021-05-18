package by.bsu.task8.controller;

import by.bsu.task8.entity.AdCollection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

import by.bsu.task8.entity.Advertisement;
import com.google.gson.Gson;

@WebServlet("/ads/*")
public class Controller extends HttpServlet {
    private static final AdCollection AD_COLLECTION = new AdCollection();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        resp.setContentType("application/json");
        resp.getWriter().print((new Gson()).toJson(AD_COLLECTION.get(id)));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        String[] url = req.getRequestURI().split("/");
        if (url.length == 3 && url[2].equals("search")) {
            Gson gson = new Gson();
            resp.getWriter().print(AD_COLLECTION.getAll().stream().map(gson::toJson).collect(Collectors.joining("\n")));
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        String[] url = req.getRequestURI().split("/");
        if(url[2].equals("add")){
            resp.getWriter().print((new Gson()).toJson(AD_COLLECTION.add((new Gson()).fromJson(req.getReader().readLine(), Advertisement.class))));
        }
        if (url[2].equals("edit")){
            resp.getWriter().print((new Gson()).toJson(AD_COLLECTION.edit(req.getParameter("id"), (new Gson()).fromJson(req.getReader().readLine(), Advertisement.class))));
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        resp.setContentType("application/json");
        resp.getWriter().print((new Gson()).toJson(AD_COLLECTION.remove(id)));
    }
}
