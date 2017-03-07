package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginControl implements Controller{
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("可以访问载入的对象：" + user.print());
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//需要把参数传入下一视图
		ModelMap model = new ModelMap();
		if("admin".equals(email) && "admin".equals(password)){
			model.put("msg", email);
			return new ModelAndView("success",model);
		}
		model.put("msg", "用户名或密码错误");
		return new ModelAndView("login",model);
//		return new ModelAndView("redirect:/login.jsp",model);//地址栏中带参数，重定向的方式
	}
	
	private User user;
	public void setUser(User user) {
		this.user = user;
	}
	
}
