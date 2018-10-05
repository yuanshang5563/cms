package org.ys.cms.web;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ys.cms.model.CoreUser;
import org.ys.cms.service.ICoreUserService;

@RestController
@RequestMapping("/CoreUserController")
public class CoreUserController {
	@Autowired
	private ICoreUserService coreUserService;
	
	@RequestMapping("/addUser")
	public CoreUser addUser(){
		CoreUser coreUser = new CoreUser();
		coreUser.setCoreUserId(UUID.randomUUID().toString());
		coreUser.setBirthday(new Date());
		coreUser.setCommentInfo("测试数据");
		coreUser.setPassword("123456");
		coreUser.setPhone("13211112222");
		coreUser.setSex("男");
		coreUser.setUserName("管理员");
		coreUserService.insert(coreUser);
		return coreUser;
	}
}
