package org.kkhimself.java_base.service.impl;

import org.kkhimself.java_base.model.Role;
import org.kkhimself.java_base.dao.RoleMapper;
import org.kkhimself.java_base.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2024-05-17
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
