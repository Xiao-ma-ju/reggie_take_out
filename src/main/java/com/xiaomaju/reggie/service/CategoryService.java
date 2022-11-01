package com.xiaomaju.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaomaju.reggie.entity.Category;

/**
 * @PROJECT_NAME: reggie_take_out
 * @DESCRIPTION:
 * @USER: CodeDeer
 * @DATE: 2022/11/1 8:27
 */
public interface CategoryService extends IService<Category> {
    /**
     * 根据id删除分类，删除之前要进行判断
     * @param ids
     */
    void remove(Long ids);
}
