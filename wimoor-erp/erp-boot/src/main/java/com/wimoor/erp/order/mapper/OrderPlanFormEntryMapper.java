package com.wimoor.erp.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.erp.order.pojo.entity.OrderPlanForm;
import com.wimoor.erp.order.pojo.entity.OrderPlanFormEntry;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderPlanFormEntryMapper extends BaseMapper<OrderPlanFormEntry> {

}
