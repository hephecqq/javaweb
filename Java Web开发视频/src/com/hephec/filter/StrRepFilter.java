package com.hephec.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import com.hephec.servlet.CRWServlet;

public class StrRepFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		response.setCharacterEncoding("gb2312");
		PrintWriter out=response.getWriter();
		CRWServlet wrapper=new CRWServlet((HttpServletResponse)response);
		chain.doFilter(request, response);
		String resStr=wrapper.toString().trim();
		String newStr="";
		if(resStr.indexOf("»ìµ°")>0){
			newStr=resStr.replace("»ìµ°", "**");
					
		}
		out.print(newStr);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	

}
