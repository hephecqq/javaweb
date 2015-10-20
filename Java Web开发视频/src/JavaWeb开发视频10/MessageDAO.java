package JavaWeb¿ª·¢ÊÓÆµ10;

import java.io.Serializable;

public class MessageDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name,email,title,content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
