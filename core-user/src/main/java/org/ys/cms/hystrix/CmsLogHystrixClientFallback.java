package org.ys.cms.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.ys.cms.feign.CmsLogFeignClient;
import org.ys.cms.model.CmsLog;

@Component
public class CmsLogHystrixClientFallback implements CmsLogFeignClient{
	 //private static final Logger LOGGER = LoggerFactory.getLogger(CmsLogHystrixClientFallback.class);

	@Override
	public CmsLog getCmsLog(String cmsLogId) {
		//LOGGER.warn("进入CmsLogHystrixClientFallback");
		return new CmsLog();
	}

//	@Override
//	public void postCmsLog(CmsLog cmsLog) {
//		//LOGGER.warn("进入CmsLogHystrixClientFallback");
//	}
//
//	@Override
//	public void putCmsLog(CmsLog cmsLog) {
//		//LOGGER.warn("进入CmsLogHystrixClientFallback");
//	}
//
//	@Override
//	public void deleteCmsLog(String cmsLogId) {
//		//LOGGER.warn("进入CmsLogHystrixClientFallback");
//	}

}
