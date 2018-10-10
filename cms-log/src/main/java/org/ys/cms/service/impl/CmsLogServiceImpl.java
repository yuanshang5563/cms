package org.ys.cms.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.ys.cms.dao.CmsLogMapper;
import org.ys.cms.model.CmsLog;
import org.ys.cms.service.ICmsLogService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YS
 * @since 2018-10-06
 */
@Service("cmsLogService")
public class CmsLogServiceImpl extends ServiceImpl<CmsLogMapper, CmsLog> implements ICmsLogService {

}
