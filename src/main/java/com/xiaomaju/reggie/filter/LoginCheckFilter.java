package com.xiaomaju.reggie.filter;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION:
 * @USER: Lu
 * @DATE: 2022/10/23 17:34
 */

import com.alibaba.fastjson.JSON;
import com.xiaomaju.reggie.common.BaseContext;
import com.xiaomaju.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 检查用户是否已经完成登录
 */
@WebFilter(filterName = "loginCheckFilter", urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    // 路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        /*
        1、获取本次请求的URL
        2、判断本次请求是否需要处理
        3、如果不需要处理，则直接放行
        4、判断登录状态，如果已登录，则直接放行
        5、如果未登录，则直接返回未登录结果
         */

        // 1、获取本次请求的URL
        String requestUrl = request.getRequestURI();

        // 定义不需要处理的请求路径
        String[] urls = new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**"
        };

        // 2、判断本次请求是否需要处理
        boolean check = check(urls, requestUrl);

        // 3、如果不需要处理，则直接放行
        if (check) {
            log.info("本次请求{}不需要处理",requestUrl);
            filterChain.doFilter(request, response);
            return;
        }

        // 4、判断登录状态，如果已登录，则直接放行
        if (request.getSession().getAttribute("employee") != null) {
            log.info("用于已登录，用户ID为：{}",request.getSession().getAttribute("employee"));

            Long empId = (Long)request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(empId);

            filterChain.doFilter(request, response);
            return;
        }

        // 5、如果未登录则返回未登录结构，通过输出流方式向客户端页面相应数据
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
    }

    /**
     * 进行路径匹配,检查本次请求是否需要放行
     *
     * @param urls
     * @param requestURL
     * @return
     */
    public boolean check(String[] urls, String requestURL) {
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURL);
            if (match) {
                return true;
            }
        }
        return false;
    }
}
