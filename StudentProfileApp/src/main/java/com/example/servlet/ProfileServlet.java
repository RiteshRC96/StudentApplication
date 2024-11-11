package main.java.com.example.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String department = request.getParameter("department");
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("department", department);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
