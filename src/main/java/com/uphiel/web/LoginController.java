package com.uphiel.web;

import com.uphiel.domain.User;
import com.uphiel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index.do")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginCheck.do")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        boolean isValidUser =
                userService.hasMatchUser(loginCommand.getUserName(),
                        loginCommand.getPassword());
        String loginSuc = isValidUser ? "Successfully" : "Failed";
        System.out.println("分支开始+++++");
        if (!isValidUser) {
            System.out.println("进入分支true");
            System.out.println("Login " + loginSuc);
            return new ModelAndView("forward:index.html", "error", "wrong");
        } else {
            User user = userService.findUserByUserName(loginCommand.getUserName());
            user.setLastIp(request.getRemoteAddr());
            System.out.println(request.getRemoteAddr());
            System.out.println(user.getUserName());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }

    
}
