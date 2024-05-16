package org.kkhimself.java_base.service.impl;

import org.kkhimself.java_base.model.Resource;
import org.kkhimself.java_base.dao.ResourceMapper;
import org.kkhimself.java_base.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2024-05-17
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

}
