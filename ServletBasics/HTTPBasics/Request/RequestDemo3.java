package cn.day01.web.request;
//演示获取请求头数据
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestDemo3")
public class RequestDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有请求头名称:user-agent
        String header = request.getHeader("user-agent");
        //判断header的浏览器版本
        if(header.contains("Chrome")){
            //谷歌
            System.out.println("谷歌来了");
        }else if(header.contains("FireFox")){
            //火狐
            System.out.println("火狐来了");
        }

    }
}
