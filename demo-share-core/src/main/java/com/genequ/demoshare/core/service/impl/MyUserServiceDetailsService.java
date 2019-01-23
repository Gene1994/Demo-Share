package com.genequ.demoshare.core.service.impl;

import com.genequ.demoshare.core.mapper.UserMapper;
import com.genequ.demoshare.core.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;


/**
 * @author: create by Gene1994
 * @date:2018/12/11
 */

@Service("iUserService")
public class MyUserServiceDetailsService implements UserDetailsService, IUserService{

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User(s, "123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
