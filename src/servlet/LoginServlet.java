package servlet;

import banyuan.service.UserService;
import banyuan.service.impl.UserServiceImpl;
import club.banyuan.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        String url = "login.jsp";
//        UserService userService = new UserServiceImpl();
//        try {
//            User user = userService.login(username,password);
//            if(user!=null) {
//                request.setAttribute("user",user);
//                url ="index.jsp";
//            }
//            else{
//                request.setAttribute("errorMsg","用户名或密码错误");
//            }
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        }
//        request.getRequestDispatcher(url).forward(request,response);
//    }

        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + password);
        String url = "login.jsp";
        UserService userService = new UserServiceImpl();
        session.setMaxInactiveInterval(10);
        try {
            User user = userService.login(username,password);
            System.out.println(user);
            if (user != null) {
                session.setAttribute("user",user);
                url = "index.jsp";
            }
            else {
                session.setAttribute("errorMsg","用户名密码错误");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("111");
        request.getRequestDispatcher(url).forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
