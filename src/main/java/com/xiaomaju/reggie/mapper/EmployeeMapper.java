package com.xiaomaju.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaomaju.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION:
 * @USER: Lu
 * @DATE: 2022/10/23 13:17
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
