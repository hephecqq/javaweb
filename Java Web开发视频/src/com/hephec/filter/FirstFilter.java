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
	//��ʼ������
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig=filterConfig;
		System.out.println(filterConfig+" ������...");
		System.out.println("init...");
	}

	//ִ�о���ķ���
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("�ͻ������󾭹�����...");
		chain.doFilter(request, response);
		System.out.println("�˺ź�����������������...");
		
		System.out.println("doFilter...");
	}

	//���ٹ�����
	@Override
	public void destroy() {
		System.out.println("destory...");
	}
	

}
