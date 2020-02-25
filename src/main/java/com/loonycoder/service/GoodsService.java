package com.loonycoder.service;


import com.loonycoder.entity.Goods;
import com.loonycoder.entity.PageBean;

/**
 * @auther loonycoder
 * @date 2019/03/16
 */
public interface GoodsService extends BaseService<Goods> {

    /**
     * 分页查询
     * @param goods 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Goods goods, int pageCode, int pageSize);
}
