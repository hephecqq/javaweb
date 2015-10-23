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
	 * ��java.servlet.http���У�������һ����ΪHttpServletResponsWrapper����
	 * ����Ķ����ʾһ�� �Զ������Ӧ������ʵ����HttpServletResponse�ӿڣ��乹�췽��ͨ��
	 * �����HttpServletResponse���͵Ĳ���������Ӧת��Ϊ�Զ������Ӧ
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
