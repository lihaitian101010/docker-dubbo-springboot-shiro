package com.bonc.ttms.gaming.server.utills;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author:Li Haitian
 * @Desc :
 * @Date :2018/9/10  17:33
 */

public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
