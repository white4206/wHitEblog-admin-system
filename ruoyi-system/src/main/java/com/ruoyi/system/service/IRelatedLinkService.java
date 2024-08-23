package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.RelatedLink;

/**
 * 相关链接管理Service接口
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
public interface IRelatedLinkService 
{
    /**
     * 查询相关链接管理
     * 
     * @param id 相关链接管理主键
     * @return 相关链接管理
     */
    public RelatedLink selectRelatedLinkById(Long id);

    /**
     * 查询相关链接管理列表
     * 
     * @param relatedLink 相关链接管理
     * @return 相关链接管理集合
     */
    public List<RelatedLink> selectRelatedLinkList(RelatedLink relatedLink);

    /**
     * 新增相关链接管理
     * 
     * @param relatedLink 相关链接管理
     * @return 结果
     */
    public int insertRelatedLink(RelatedLink relatedLink);

    /**
     * 修改相关链接管理
     * 
     * @param relatedLink 相关链接管理
     * @return 结果
     */
    public int updateRelatedLink(RelatedLink relatedLink);

    /**
     * 批量删除相关链接管理
     * 
     * @param ids 需要删除的相关链接管理主键集合
     * @return 结果
     */
    public int deleteRelatedLinkByIds(Long[] ids);

    /**
     * 删除相关链接管理信息
     * 
     * @param id 相关链接管理主键
     * @return 结果
     */
    public int deleteRelatedLinkById(Long id);
}
