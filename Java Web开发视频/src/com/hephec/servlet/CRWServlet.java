package com.hephec.servlet;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet implementation class CRWServlet
 */
@WebServlet("/CRWServlet")
public class CRWServlet extends HttpServletResponseWrapper{
	
	private CharArrayWriter output;
	/**
	 * 在java.servlet.http包中，包含了一个名为HttpServletResponsWrapper的类
	 * 该类的对象表示一个 自定义的响应对象，它实现了HttpServletResponse接口，其构造方法通过
	 * 传入的HttpServletResponse类型的参数，将响应转换为自定义的响应
	 * */
	public CRWServlet(HttpServletResponse response) {
		super(response);
		this.output=new CharArrayWriter();
		
	}

	@Override
	public String toString() {
			return output.toString();
	}
	public PrintWriter getWriter(){
		
		return new PrintWriter(output);
	}
  
}
