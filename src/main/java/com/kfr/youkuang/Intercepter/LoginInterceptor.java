package com.kfr.youkuang.Intercepter;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginInterceptor implements HandlerInterceptor {
    private static final String LOGIN_URL = "/login";

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        // 根据session中是否有userID判断是否登录
        boolean ok = httpServletRequest.getSession().getAttribute("userID") != null;

        // 拦截重复登录
        if (LOGIN_URL.equals(httpServletRequest.getRequestURI())) {
            if (ok) {
                //httpServletResponse.sendRedirect("/index");
                return false;
            } else {
                return true;
            }
        } else {
            if (ok) {
                return true;
            } else {
                //httpServletResponse.sendRedirect("/login");
                return false;
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
