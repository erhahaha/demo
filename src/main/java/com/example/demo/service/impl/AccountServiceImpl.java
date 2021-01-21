package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.AccountMapper;
import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import com.example.demo.utils.PageRequest;
import com.example.demo.utils.PageResult;
import com.example.demo.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class AccountServiceImpl implements AccountService {

    @Autowired(required = false)
    private AccountMapper accountMapper;
    @Override
    public PageResult findPage(Map<String,Object> para) {
        PageRequest pageQuery = new PageRequest();
        pageQuery.setPageNum((Integer) para.get("pageNum"));
        pageQuery.setPageSize((Integer) para.get("pageSize"));
        Account account = JSON.parseObject(JSON.toJSONString(para.get("Account")), Account.class);
        return PageUtils.getPageResult(pageQuery, getPageInfo(pageQuery, account));
    }

    /**
     * 调用分页插件完成分页
     * @param pageQuery
     * @return
     */
    private PageInfo<Account> getPageInfo(PageRequest pageRequest, Account account) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Account> accounts = accountMapper.selectPage(account);
        return new PageInfo<Account>(accounts);
    }
}
