package cn.day01.web.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
/*
    请求转发：一种在服务器内部的资源跳转方式
        1：通过request对象获取请求转发器对象：RequestDispatcher getRequestDispatcher(String path)
        2：通过RequestDispatcher对象进行转发：forward(ServletRequest request,ServletResponse response)
    特点：
        1：浏览器地址栏路径不发生变化
        2：只能转发到当前服务器内部资源中
        3：转发是一次请求
 */

@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo66被访问了");
        //转发到demo7
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo7");
//        requestDispatcher.forward(request,response);
        request.getRequestDispatcher("/requestDemo7").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
