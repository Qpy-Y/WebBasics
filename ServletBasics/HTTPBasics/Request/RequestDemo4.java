package cn.day01.web.request;
//演示获取请求头数据
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有请求头名称:referer
        String referer = request.getHeader("referer");
        System.out.println(referer);

        //防盗链
        if(referer.contains("/HTML3")){
            System.out.println("播放");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("播放");
        }else{
            System.out.println("律师函警告");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("律师函警告");
        }
    }
}
