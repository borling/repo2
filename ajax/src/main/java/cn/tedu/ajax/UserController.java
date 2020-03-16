package cn.tedu.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {
	@RequestMapping("login.do")
	@ResponseBody
	public JsonResult hah(String username,String password) {
		JsonResult jsonResult=new JsonResult();
		jsonResult.setResult(1);
		if("root".equals(username)) {
			if("1234".equals(password)) {
				
				jsonResult.setResult(1);//用户名密码均正确
				jsonResult.setUsername(username);
				jsonResult.setMessage("恭喜你，登录成功");
			}else {
				jsonResult.setResult(3);//密码错误
				jsonResult.setMessage("恭喜你，密码错误");
			}
		}else {
			jsonResult.setResult(3);;//用户名错误
			jsonResult.setMessage("恭喜你，用户名错误");
		}
		return jsonResult;
	}
}
