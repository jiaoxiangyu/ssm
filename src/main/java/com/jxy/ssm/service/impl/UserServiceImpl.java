/**        
 * @author: 焦祥宇 
 * @date:   createDate：2017年7月11日 下午2:44:14   
 * @Description:  
 * 
 */  
package com.jxy.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jxy.ssm.dao.IUserDao;
import com.jxy.ssm.entity.User;
import com.jxy.ssm.service.IUserService;

/**
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {		
		return this.userDao.selectByPrimaryKey(userId);
	}

}
