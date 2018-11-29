package com.example.demo.config;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * created by liuping on 2018/11/29
 */
//@Configuration
public class WebMvcConfigurer {

    /*public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptorAdapter() {
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + request.getServletPath();
                if(url.contains("/error")) {
                    response.sendRedirect("/swagger-ui.html");
                }
                return true;
            }
        }).addPathPatterns("/**");
    }*/
}
