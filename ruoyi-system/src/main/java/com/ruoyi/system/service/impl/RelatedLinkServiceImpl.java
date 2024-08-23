package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RelatedLinkMapper;
import com.ruoyi.system.domain.RelatedLink;
import com.ruoyi.system.service.IRelatedLinkService;

/**
 * 相关链接管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@Service
public class RelatedLinkServiceImpl implements IRelatedLinkService 
{
    @Autowired
    private RelatedLinkMapper relatedLinkMapper;

    /**
     * 查询相关链接管理
     * 
     * @param id 相关链接管理主键
     * @return 相关链接管理
     */
    @Override
    public RelatedLink selectRelatedLinkById(Long id)
    {
        return relatedLinkMapper.selectRelatedLinkById(id);
    }

    /**
     * 查询相关链接管理列表
     * 
     * @param relatedLink 相关链接管理
     * @return 相关链接管理
     */
    @Override
    public List<RelatedLink> selectRelatedLinkList(RelatedLink relatedLink)
    {
        return relatedLinkMapper.selectRelatedLinkList(relatedLink);
    }

    /**
     * 新增相关链接管理
     * 
     * @param relatedLink 相关链接管理
     * @return 结果
     */
    @Override
    public int insertRelatedLink(RelatedLink relatedLink)
    {
        return relatedLinkMapper.insertRelatedLink(relatedLink);
    }

    /**
     * 修改相关链接管理
     * 
     * @param relatedLink 相关链接管理
     * @return 结果
     */
    @Override
    public int updateRelatedLink(RelatedLink relatedLink)
    {
        return relatedLinkMapper.updateRelatedLink(relatedLink);
    }

    /**
     * 批量删除相关链接管理
     * 
     * @param ids 需要删除的相关链接管理主键
     * @return 结果
     */
    @Override
    public int deleteRelatedLinkByIds(Long[] ids)
    {
        return relatedLinkMapper.deleteRelatedLinkByIds(ids);
    }

    /**
     * 删除相关链接管理信息
     * 
     * @param id 相关链接管理主键
     * @return 结果
     */
    @Override
    public int deleteRelatedLinkById(Long id)
    {
        return relatedLinkMapper.deleteRelatedLinkById(id);
    }
}
