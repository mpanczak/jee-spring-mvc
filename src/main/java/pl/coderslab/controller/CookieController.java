package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {
    @GetMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    String createCookie(@PathVariable String value1, @PathVariable String value2, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);

        cookie1.setPath("/");
        cookie2.setPath("/");

        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return "cookies";
    }
    @GetMapping("/getcookiesUtils")
    @ResponseBody
    String readCookies(HttpServletRequest request) {
        Cookie c1 = WebUtils.getCookie(request, "cookie1");
        Cookie c2 = WebUtils.getCookie(request, "cookie2");
        return c1.getName() + ": " + c1.getValue().toString() + "<br>" + c2.getName() + ": " + c2.getValue().toString();
    }


    @GetMapping("/getcookiesAdn")
    @ResponseBody
    String readCookies(@CookieValue("cookie1") String c1, @CookieValue("cookie2") String c2) {
        return "cookie1" + ": " + c1 + "<br>" + "cookie2" + ": " + c2;
    }

}
