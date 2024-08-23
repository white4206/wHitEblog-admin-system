package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.IdentityTag;

/**
 * 身份标签Mapper接口
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
public interface IdentityTagMapper 
{
    /**
     * 查询身份标签
     * 
     * @param id 身份标签主键
     * @return 身份标签
     */
    public IdentityTag selectIdentityTagById(Long id);

    /**
     * 查询身份标签列表
     * 
     * @param identityTag 身份标签
     * @return 身份标签集合
     */
    public List<IdentityTag> selectIdentityTagList(IdentityTag identityTag);

    /**
     * 新增身份标签
     * 
     * @param identityTag 身份标签
     * @return 结果
     */
    public int insertIdentityTag(IdentityTag identityTag);

    /**
     * 修改身份标签
     * 
     * @param identityTag 身份标签
     * @return 结果
     */
    public int updateIdentityTag(IdentityTag identityTag);

    /**
     * 删除身份标签
     * 
     * @param id 身份标签主键
     * @return 结果
     */
    public int deleteIdentityTagById(Long id);

    /**
     * 批量删除身份标签
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIdentityTagByIds(Long[] ids);
}
