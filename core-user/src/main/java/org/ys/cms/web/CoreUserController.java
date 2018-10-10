package org.ys.cms.web;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ys.cms.constant.CmsLogType;
import org.ys.cms.feign.CmsLogFeignClient;
import org.ys.cms.model.CmsLog;
import org.ys.cms.model.CoreUser;
import org.ys.cms.service.ICoreUserService;
import org.ys.cms.utils.IDGenerator;

@RestController
@RequestMapping("/CoreUserController")
public class CoreUserController {
	@Autowired
	private ICoreUserService coreUserService;
	@Autowired
	private CmsLogFeignClient cmsLogFeignClient;
//	@Autowired
//	private RestTemplate restTemplate;
	
	@PostMapping("/coreUser")
	//@Transactional(rollbackFor=Exception.class)
	public CoreUser postCoreUser(){
		CoreUser coreUser = new CoreUser();
		coreUser.setCoreUserId(IDGenerator.generateUUID());
		coreUser.setBirthday(new Date());
		coreUser.setCommentInfo("测试数据");
		coreUser.setPassword("123456");
		coreUser.setPhone("13211112222");
		coreUser.setSex("男");
		coreUser.setUserName("管理员");
		coreUser.setCreatedTime(new Date());
		coreUser.setModifiedTime(new Date());
		coreUserService.insert(coreUser);
		
		//保存日志
		CmsLog cmsLog = new CmsLog();
		cmsLog.setCmsLogId(IDGenerator.generateUUID());
		cmsLog.setLogType(CmsLogType.LOG_TYPE_INSERT);
		cmsLog.setUser(coreUser.getUserName());
		cmsLog.setModule("microservice-core-user");
		cmsLog.setCreatedTime(new Date());
		cmsLog.setModifiedTime(new Date());
		cmsLog.setLogInfo("新增管理员id="+coreUser.getCoreUserId());
		cmsLogFeignClient.postCmsLog(cmsLog);
		return coreUser;
	}
	
//	@GetMapping("/coreUser/{coreUserId}")
//	@HystrixCommand(fallbackMethod="getCmsLogFallback")
//	public CmsLog getCoreUser(@PathVariable("coreUserId") String coreUserId){
//		return restTemplate.getForObject("http://localhost:9100/CmsLogController/cmsLog/"+coreUserId, CmsLog.class);
//	}
//	
//	public CmsLog getCmsLogFallback(String coreUserId){
//		return new CmsLog();
//	}
	
//	@RequestMapping(value="/coreUser/{coreUserId}",method=RequestMethod.GET)
//	public CmsLog getCoreUser(@PathVariable("coreUserId") String coreUserId){
//		CmsLog cmsLog = cmsLogFeignClient.getCmsLog(coreUserId);
//		return cmsLog;
//	}
	
	@RequestMapping(value="/coreUser/{coreUserId}",method=RequestMethod.GET)
	public CoreUser getCoreUser(@PathVariable("coreUserId") String coreUserId){
		CoreUser coreUser = null;
		if(StringUtils.isNotEmpty(coreUserId)){
			coreUser = coreUserService.selectById(coreUserId.trim());
		}
		return coreUser;
	}	
	@RequestMapping(value="/cmsLog/{cmsLogId}",method=RequestMethod.GET)
	public CmsLog getCmsLog(@PathVariable("cmsLogId") String cmsLogId){
		CmsLog cmsLog = cmsLogFeignClient.getCmsLog(cmsLogId);
		return cmsLog;
	}	
}
