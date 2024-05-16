package org.kkhimself.java_base.service.impl;

import org.kkhimself.java_base.model.Account;
import org.kkhimself.java_base.dao.AccountMapper;
import org.kkhimself.java_base.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账号表 服务实现类
 * </p>
 *
 * @author baomidou
 * @since 2024-05-17
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
