package site.metacoding.demo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import site.metacoding.demo.domain.user.User;
import site.metacoding.demo.domain.user.UserDao;
import site.metacoding.demo.web.dto.req.user.LoginDto;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserDao userDao;
    private final HttpSession sessoin;

    @GetMapping({"/", "/main"})
    public String main(){
        return "main";
    }

    @GetMapping("/login")
    public String login(){
        return "user/login";
    }
    @PostMapping("/login")
    public String loginDo (LoginDto loginDto, HttpServletRequest req){
        User u = userDao.login(loginDto);
        if(u!=null){
            sessoin.setAttribute("principal", u);
            return "redirect:/main";
        } else {
            return "redirect:/login";
        }
    }
}
