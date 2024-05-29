package com.example.servlets4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;


import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author z0rka 06.02.2023
 * Custom servlet
 */
@Slf4j
public class CustomServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double x = Double.parseDouble(request.getParameter("x"));
        double y = Double.parseDouble(request.getParameter("y"));
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));

        double sum = 0.0;
        for (int i = 1; i <= 30; i++) {
            double term = Math.pow(-1, i) * i * Math.pow((Math.tan(x) + Math.cos(a) - Math.tan(b * y)), i) / (i * x);
            sum += term;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Result: " + sum + "</h2>");
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Calculator</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action=\"\" method=\"post\">");
        out.println("<label for=\"x\">x:</label>");
        out.println("<input type=\"text\" id=\"x\" name=\"x\"><br>");
        out.println("<label for=\"y\">y:</label>");
        out.println("<input type=\"text\" id=\"y\" name=\"y\"><br>");
        out.println("<label for=\"a\">a (in radians):</label>");
        out.println("<input type=\"text\" id=\"a\" name=\"a\"><br>");
        out.println("<label for=\"b\">b (in radians):</label>");
        out.println("<input type=\"text\" id=\"b\" name=\"b\"><br>");
        out.println("<button type=\"submit\">Calculate</button>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}

