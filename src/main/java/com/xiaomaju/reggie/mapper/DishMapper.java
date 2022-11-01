package com.xiaomaju.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaomaju.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION:
 * @USER: CodeDeer
 * @DATE: 2022/11/1 12:51
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
