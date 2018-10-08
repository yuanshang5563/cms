package org.ys.cms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ys.cms.config.FeignConfig;
import org.ys.cms.hystrix.CmsLogHystrixClientFallback;
import org.ys.cms.model.CmsLog;

@Component
@FeignClient(value="microservice-cms-log",configuration=FeignConfig.class,fallback=CmsLogHystrixClientFallback.class)
public interface CmsLogFeignClient {
	
	@RequestMapping(value = "/CmsLogController/cmsLog/{cmsLogId}", method = RequestMethod.GET)
	public CmsLog getCmsLog(@PathVariable("cmsLogId") String cmsLogId);
	
//	@RequestMapping(value = "/CmsLogController/cmsLog", method = RequestMethod.POST)
//	public void postCmsLog(@RequestBody CmsLog cmsLog);
//	
//	@RequestMapping(value = "/CmsLogController/cmsLog", method = RequestMethod.PUT)
//	public void putCmsLog(@RequestBody CmsLog cmsLog);
//	
//	@RequestMapping(value = "/CmsLogController/cmsLog/{cmsLogId}", method = RequestMethod.DELETE)
//	public void deleteCmsLog(@PathVariable("cmsLogId") String cmsLogId);
}
