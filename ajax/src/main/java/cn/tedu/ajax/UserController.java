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
				
				jsonResult.setResult(1);//�û����������ȷ
				jsonResult.setUsername(username);
				jsonResult.setMessage("��ϲ�㣬��¼�ɹ�");
			}else {
				jsonResult.setResult(3);//�������
				jsonResult.setMessage("��ϲ�㣬�������");
			}
		}else {
			jsonResult.setResult(3);;//�û�������
			jsonResult.setMessage("��ϲ�㣬�û�������");
		}
		return jsonResult;
	}
}
