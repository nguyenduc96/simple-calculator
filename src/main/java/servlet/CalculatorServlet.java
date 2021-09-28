package servlet;

import model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet ", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Calculator calculator =  new Calculator();
        double first = Double.parseDouble(request.getParameter("first"));
        double second = Double.parseDouble(request.getParameter("second"));
        char opera = request.getParameter("operator").charAt(0);

        PrintWriter writer = response.getWriter();
        writer.print("<h1>Result : </h1>");

        try {
            double result = calculator.calculator(first, second, opera);
            writer.print("<h2> " + first + " " + opera + " " + second + " = " + result + "</h2>");
        } catch (Exception e) {
            writer.print("Error : " + e.getMessage());
        }
    }
}
