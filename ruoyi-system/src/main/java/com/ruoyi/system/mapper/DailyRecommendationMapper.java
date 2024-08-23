package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DailyRecommendation;

/**
 * 今日推荐管理 Mapper接口
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
public interface DailyRecommendationMapper 
{
    /**
     * 查询今日推荐管理 
     * 
     * @param id 今日推荐管理 主键
     * @return 今日推荐管理 
     */
    public DailyRecommendation selectDailyRecommendationById(Long id);

    /**
     * 查询今日推荐管理 列表
     * 
     * @param dailyRecommendation 今日推荐管理 
     * @return 今日推荐管理 集合
     */
    public List<DailyRecommendation> selectDailyRecommendationList(DailyRecommendation dailyRecommendation);

    /**
     * 新增今日推荐管理 
     * 
     * @param dailyRecommendation 今日推荐管理 
     * @return 结果
     */
    public int insertDailyRecommendation(DailyRecommendation dailyRecommendation);

    /**
     * 修改今日推荐管理 
     * 
     * @param dailyRecommendation 今日推荐管理 
     * @return 结果
     */
    public int updateDailyRecommendation(DailyRecommendation dailyRecommendation);

    /**
     * 删除今日推荐管理 
     * 
     * @param id 今日推荐管理 主键
     * @return 结果
     */
    public int deleteDailyRecommendationById(Long id);

    /**
     * 批量删除今日推荐管理 
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDailyRecommendationByIds(Long[] ids);
}