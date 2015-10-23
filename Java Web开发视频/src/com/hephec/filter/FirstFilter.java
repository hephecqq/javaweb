package com.hephec.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter{

		private FilterConfig filterConfig;
	//初始化方法
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig=filterConfig;
		System.out.println(filterConfig+" 创建了...");
		System.out.println("init...");
	}

	//执行具体的方法
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("客户的请求经过这里...");
		chain.doFilter(request, response);
		System.out.println("账号和密码请求处理经过这里...");
		
		System.out.println("doFilter...");
	}

	//销毁过滤器
	@Override
	public void destroy() {
		System.out.println("destory...");
	}
	

}
