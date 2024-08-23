package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DailyRecommendationMapper;
import com.ruoyi.system.domain.DailyRecommendation;
import com.ruoyi.system.service.IDailyRecommendationService;

/**
 * 今日推荐管理 Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@Service
public class DailyRecommendationServiceImpl implements IDailyRecommendationService 
{
    @Autowired
    private DailyRecommendationMapper dailyRecommendationMapper;

    /**
     * 查询今日推荐管理 
     * 
     * @param id 今日推荐管理 主键
     * @return 今日推荐管理 
     */
    @Override
    public DailyRecommendation selectDailyRecommendationById(Long id)
    {
        return dailyRecommendationMapper.selectDailyRecommendationById(id);
    }

    /**
     * 查询今日推荐管理 列表
     * 
     * @param dailyRecommendation 今日推荐管理 
     * @return 今日推荐管理 
     */
    @Override
    public List<DailyRecommendation> selectDailyRecommendationList(DailyRecommendation dailyRecommendation)
    {
        return dailyRecommendationMapper.selectDailyRecommendationList(dailyRecommendation);
    }

    /**
     * 新增今日推荐管理 
     * 
     * @param dailyRecommendation 今日推荐管理 
     * @return 结果
     */
    @Override
    public int insertDailyRecommendation(DailyRecommendation dailyRecommendation)
    {
        dailyRecommendation.setCreateTime(DateUtils.getNowDate());
        return dailyRecommendationMapper.insertDailyRecommendation(dailyRecommendation);
    }

    /**
     * 修改今日推荐管理 
     * 
     * @param dailyRecommendation 今日推荐管理 
     * @return 结果
     */
    @Override
    public int updateDailyRecommendation(DailyRecommendation dailyRecommendation)
    {
        return dailyRecommendationMapper.updateDailyRecommendation(dailyRecommendation);
    }

    /**
     * 批量删除今日推荐管理 
     * 
     * @param ids 需要删除的今日推荐管理 主键
     * @return 结果
     */
    @Override
    public int deleteDailyRecommendationByIds(Long[] ids)
    {
        return dailyRecommendationMapper.deleteDailyRecommendationByIds(ids);
    }

    /**
     * 删除今日推荐管理 信息
     * 
     * @param id 今日推荐管理 主键
     * @return 结果
     */
    @Override
    public int deleteDailyRecommendationById(Long id)
    {
        return dailyRecommendationMapper.deleteDailyRecommendationById(id);
    }
}
