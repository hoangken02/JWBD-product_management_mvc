package com.kenit.productmvc.controller;

import com.kenit.productmvc.model.Product;
import com.kenit.productmvc.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchServlet", value = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    private ProductServiceImpl productService = new ProductServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println("name"+ name);
        List<Product> products = productService.SearchByName(name);
        System.out.println(products);
        RequestDispatcher requestDispatcher;
        if (products!= null){
            request.setAttribute("products",products);
            requestDispatcher = request.getRequestDispatcher("product/search.jsp");
        }else {
            requestDispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        requestDispatcher.forward(request,response);

    }
}
