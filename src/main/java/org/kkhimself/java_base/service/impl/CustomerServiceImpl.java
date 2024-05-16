package org.kkhimself.java_base.service.impl;

import org.kkhimself.java_base.model.Customer;
import org.kkhimself.java_base.dao.CustomerMapper;
import org.kkhimself.java_base.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2024-05-17
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
