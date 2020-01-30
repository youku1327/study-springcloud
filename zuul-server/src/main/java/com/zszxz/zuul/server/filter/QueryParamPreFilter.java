package com.zszxz.zuul.server.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

/**
 * @Author lsc
 * <p> 前置过滤器示例 </p>
 */
@Component
public class QueryParamPreFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String filterType() {
        return  PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        // 读者可以拿到请求上下文做业务判断是否执行过滤器
       return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("----pre filter  be excuted");
        //// 获得当前request 请求上下文
        RequestContext ctx = RequestContext.getCurrentContext();
        // 获得 request
        HttpServletRequest request = ctx.getRequest();
        // 获得远程主机 ip
        String remoteHost = request.getRemoteHost();
        // 获得请求参数
        String username = request.getParameter("username");
        // 打印日志信息
        logger.info("the remote host is {} and params is {}",remoteHost,username);
        // 设置 key
        if (username!=null){
            ctx.put("zszxz", "you can set service");
        }
        return null;
    }
}
