package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by Wutl on 2016/6/11.
 */
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber (@Param("seckillId") long seckillId ,@Param("killTime")  Date killTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 查询所有秒杀
     * 通过param注解告诉mybatis 传入参数对应的是什么。。。。。
     * 对应xml语句中 形成的表述
     * @return
     */
    List<Seckill> queryAll(@Param("offset")String offset, @Param("limit")int limit);
}
