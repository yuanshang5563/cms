package org.ys.cms.web;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ys.cms.model.CmsLog;
import org.ys.cms.service.ICmsLogService;

@RestController
@RequestMapping("/CmsLogController")
public class CmsLogController {
	@Autowired
	private ICmsLogService cmsLogService;
	
	@GetMapping("/cmsLog/{cmsLogId}")
	public CmsLog getCmsLog(@PathVariable("cmsLogId") String cmsLogId){
		CmsLog cmsLog = null;
		if(StringUtils.isNotEmpty(cmsLogId)){
			cmsLog = cmsLogService.selectById(cmsLogId.trim());
		}
		return cmsLog;
	}
	
	@PostMapping("/cmsLog")
	public void postCmsLog(@RequestBody CmsLog cmsLog){
		if(null != cmsLog){
			if(null == cmsLog.getCreatedTime()){
				cmsLog.setCreatedTime(new Date());
			}
			if(null == cmsLog.getModifiedTime()){
				cmsLog.setModifiedTime(new Date());
			}			
			cmsLogService.insert(cmsLog);
		}
	}
	
	@PutMapping("/cmsLog")
	public void putCmsLog(@RequestBody CmsLog cmsLog){
		if(null != cmsLog && StringUtils.isNotEmpty(cmsLog.getCmsLogId())){
			if(null == cmsLog.getCreatedTime()){
				cmsLog.setCreatedTime(new Date());
			}
			cmsLog.setModifiedTime(new Date());			
			cmsLogService.updateById(cmsLog);
		}
	}	
	
	@DeleteMapping("/cmsLog/{cmsLogId}")
	public void deleteCmsLog(@PathVariable String cmsLogId){
		if(StringUtils.isNotEmpty(cmsLogId)){
			cmsLogService.deleteById(cmsLogId.trim());
		}
	}
}
