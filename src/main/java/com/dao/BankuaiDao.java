package com.dao;

import com.entity.BankuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BankuaiView;

/**
 * 板块信息 Dao 接口
 *
 * @author 
 */
public interface BankuaiDao extends BaseMapper<BankuaiEntity> {

   List<BankuaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
