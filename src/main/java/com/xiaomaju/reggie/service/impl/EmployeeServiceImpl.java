package com.xiaomaju.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomaju.reggie.entity.Employee;
import com.xiaomaju.reggie.mapper.EmployeeMapper;
import com.xiaomaju.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION:
 * @USER: Lu
 * @DATE: 2022/10/23 13:19
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
