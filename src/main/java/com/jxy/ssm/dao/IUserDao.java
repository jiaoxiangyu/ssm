/**        
 * @author: 焦祥宇 
 * @date:   createDate：2017年7月11日 下午2:42:16   
 * @Description:  
 * 
 */  
package com.jxy.ssm.dao;

import com.jxy.ssm.entity.User;

/**
 * @author Administrator
 *
 */
public interface IUserDao {
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
