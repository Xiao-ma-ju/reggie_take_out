package com.xiaomaju.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomaju.reggie.entity.Dish;
import com.xiaomaju.reggie.mapper.DishMapper;
import com.xiaomaju.reggie.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION:
 * @USER: CodeDeer
 * @DATE: 2022/11/1 12:56
 */
@Service
@Slf4j
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
