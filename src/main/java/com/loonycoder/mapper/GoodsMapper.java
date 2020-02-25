package com.loonycoder.mapper;

import com.github.pagehelper.Page;
import com.loonycoder.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther loonycoder
 * @date 2019/03/16
 */
@Mapper
public interface GoodsMapper {

    List<Goods> findAll();

    Page<Goods> findByPage(Goods goods);

    List<Goods> findById(Long id);

    void create(Goods goods);

    void update(Goods goods);

    void delete(Long id);
}
