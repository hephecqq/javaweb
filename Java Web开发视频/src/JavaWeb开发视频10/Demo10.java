package JavaWeb开发视频10;

/**
 * 两种模式的分工方法：
 * 
 * 	1.JSP+JavaBean：模式1
 * 		JSP实现页面的显示，并且响应请求，调用JavaBean处理数据
 * 
 * 	2.JSP+JavaBean+Servlet：模式2
 * 
 * 		正两种模式最大区别就是个中组件的分工不同
 * 
 * 
 * */

public class Demo10 {
	/**
	 * 案例背景：
	 * 	即将开发的是一个BBS留言板，一般来说，几乎每个网站都有留言的功能
	 * 	它可以使一个典型的Web开放案例：
	 * 	在留言时，用户需要输入留言的标题，留言者姓名，email和留言内容
	 * 
	 * */
	public static void main(String[] args) {
		/**
		 * 用JavaBean来表示留言板数据，留言板输入的数据咋存入数据
		 * 之前，一般现将其存入JavaBean中，从数据库取出来的数据被JSP使用之前
		 * 也是现将其放在JavaBean中，这就是该JavaBean的主要功能
		 * 在编写这种JavaBean时，一般是将数据库中的字段与JavaBean的书属性对应起来，一个字段对应一个属性，每个属性都有get和set方法
		 * 
		 * */
		
		/**
		 * 执行数据库操作的JavaBean
		 * 由于在这种模式中没有Servlet，所有智能通过
		 * JavaBean去连接数据库，执行数据库操作，并且将执行的结构返回到jsp页面去显示
		 * 编写这个类JavaBean，一般是使每个方法都去完成特定的功能
		 * 从而完成方法jsp的调用
		 * 
		 * */
		
		/**
		 * 发表留言板界面
		 * 用HTML文件俩创建留言板界面，功能是在浏览器端显示用户输入留言的界面
		 * 当用户点击“提交”按钮，他就将数据传递给JSP,JavaBean等其他组件去处理
		 * 
		 * */
		
		/**
		 * 处理添加留言的jsp页面
		 * 	由于没有Servlet，JSP文件除了完成客户端显示功能之外，还需要调用
		 * 	JavaBean来完成数据处理的操作，这个页面注意是调用JavaBean
		 * 	去执行向数据库添加留言记录的操作
		 * 
		 * */
	}
}
