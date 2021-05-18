package cn.day01.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
    共享数据：
        域对象：一个有作用范围的对象，可以在范围内共享数据
        request域:代表一次请求的范围，一般用于请求转发的多个资源中共享数据
        方法：
            void setAttribute(String name,Object obj)：存储数据
            Object getAttitude(String name)：通过键获取值
            void removeAttitude(String name)：通过键移除键值对
 */

@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo88被访问了");
        //转发到demo9
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo7");
//        requestDispatcher.forward(request,response);

        request.setAttribute("msg","hello");
        request.getRequestDispatcher("/requestDemo9").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
