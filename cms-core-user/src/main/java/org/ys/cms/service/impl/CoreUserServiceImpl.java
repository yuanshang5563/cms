package org.ys.cms.service.impl;

import org.ys.cms.dao.CoreUserMapper;
import org.ys.cms.model.CoreUser;
import org.ys.cms.service.ICoreUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YS
 * @since 2018-10-05
 */
@Service("coreUserService")
public class CoreUserServiceImpl extends ServiceImpl<CoreUserMapper, CoreUser> implements ICoreUserService {

}
