package ru.interes.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.plugin2.message.GetAuthenticationMessage;

import javax.servlet.http.HttpServletResponse;

@Controller
public class Cookie {
    private GetAuthenticationMessage request;

    public Cookie(String foo, String bar) {
    }

    @RequestMapping("/")
    public String hello(
            @CookieValue(value = "w_ps", defaultValue = "-") String w_ps_c) {
         String cook=w_ps_c;
    }

    @RequestMapping("/greeting")
    public String buy( HttpServletResponse response) {

        response.addCookie(new Cookie("foo", "bar"));

           }
}
