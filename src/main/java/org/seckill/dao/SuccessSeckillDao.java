package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import org.seckill.entity.SuccessSeckill;

/**
 * Created by Wutl on 2016/6/11.
 */
public interface SuccessSeckillDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessSeckill(@Param("seckillId") long seckillId,@Param("userPhone") String userPhone);

    /**
     *
     * @param seckillId
     * @return
     */
    SuccessSeckill queryByIdWithSeckill(long seckillId);
}
