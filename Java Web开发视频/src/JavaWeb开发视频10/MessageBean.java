package JavaWeb������Ƶ10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MessageBean {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private MessageDAO dao;
	
	public void addMessage(){
		//���Message�����ݿ�
	}
	public MessageDAO takeMessage(){
		//�����ݿ��л�ȡMessage
		return null;
		
	}
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public Statement getStmt() {
		return stmt;
	}
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	public MessageDAO getDao() {
		return dao;
	}
	public void setDao(MessageDAO dao) {
		this.dao = dao;
	}
	
}
