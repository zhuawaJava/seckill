package com.geekq.provider.mapper;

import com.geekq.api.entity.GoodsVoOrder;
import com.geekq.api.entity.MiaoshaGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author
 */
public interface GoodsMapper {

    public List<GoodsVoOrder> listGoodsVo();

    public GoodsVoOrder getGoodsVoByGoodsId(@Param("goodsId") long goodsId);

    public int reduceStock(MiaoshaGoods g);

}
