package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IdentityTagMapper;
import com.ruoyi.system.domain.IdentityTag;
import com.ruoyi.system.service.IIdentityTagService;

/**
 * 身份标签Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@Service
public class IdentityTagServiceImpl implements IIdentityTagService 
{
    @Autowired
    private IdentityTagMapper identityTagMapper;

    /**
     * 查询身份标签
     * 
     * @param id 身份标签主键
     * @return 身份标签
     */
    @Override
    public IdentityTag selectIdentityTagById(Long id)
    {
        return identityTagMapper.selectIdentityTagById(id);
    }

    /**
     * 查询身份标签列表
     * 
     * @param identityTag 身份标签
     * @return 身份标签
     */
    @Override
    public List<IdentityTag> selectIdentityTagList(IdentityTag identityTag)
    {
        return identityTagMapper.selectIdentityTagList(identityTag);
    }

    /**
     * 新增身份标签
     * 
     * @param identityTag 身份标签
     * @return 结果
     */
    @Override
    public int insertIdentityTag(IdentityTag identityTag)
    {
        return identityTagMapper.insertIdentityTag(identityTag);
    }

    /**
     * 修改身份标签
     * 
     * @param identityTag 身份标签
     * @return 结果
     */
    @Override
    public int updateIdentityTag(IdentityTag identityTag)
    {
        return identityTagMapper.updateIdentityTag(identityTag);
    }

    /**
     * 批量删除身份标签
     * 
     * @param ids 需要删除的身份标签主键
     * @return 结果
     */
    @Override
    public int deleteIdentityTagByIds(Long[] ids)
    {
        return identityTagMapper.deleteIdentityTagByIds(ids);
    }

    /**
     * 删除身份标签信息
     * 
     * @param id 身份标签主键
     * @return 结果
     */
    @Override
    public int deleteIdentityTagById(Long id)
    {
        return identityTagMapper.deleteIdentityTagById(id);
    }
}
