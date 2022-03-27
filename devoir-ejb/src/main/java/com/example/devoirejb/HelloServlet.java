package com.example.devoirejb;

import myBeans.statelessBean;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @EJB
    statelessBean obj;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + obj.hello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}