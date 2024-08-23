package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BlogArticleTagMapper;
import com.ruoyi.system.domain.BlogArticleTag;
import com.ruoyi.system.service.IBlogArticleTagService;

/**
 * 博客文章标签Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@Service
public class BlogArticleTagServiceImpl implements IBlogArticleTagService 
{
    @Autowired
    private BlogArticleTagMapper blogArticleTagMapper;

    /**
     * 查询博客文章标签
     * 
     * @param id 博客文章标签主键
     * @return 博客文章标签
     */
    @Override
    public BlogArticleTag selectBlogArticleTagById(Long id)
    {
        return blogArticleTagMapper.selectBlogArticleTagById(id);
    }

    /**
     * 查询博客文章标签列表
     * 
     * @param blogArticleTag 博客文章标签
     * @return 博客文章标签
     */
    @Override
    public List<BlogArticleTag> selectBlogArticleTagList(BlogArticleTag blogArticleTag)
    {
        return blogArticleTagMapper.selectBlogArticleTagList(blogArticleTag);
    }

    /**
     * 新增博客文章标签
     * 
     * @param blogArticleTag 博客文章标签
     * @return 结果
     */
    @Override
    public int insertBlogArticleTag(BlogArticleTag blogArticleTag)
    {
        return blogArticleTagMapper.insertBlogArticleTag(blogArticleTag);
    }

    /**
     * 修改博客文章标签
     * 
     * @param blogArticleTag 博客文章标签
     * @return 结果
     */
    @Override
    public int updateBlogArticleTag(BlogArticleTag blogArticleTag)
    {
        return blogArticleTagMapper.updateBlogArticleTag(blogArticleTag);
    }

    /**
     * 批量删除博客文章标签
     * 
     * @param ids 需要删除的博客文章标签主键
     * @return 结果
     */
    @Override
    public int deleteBlogArticleTagByIds(Long[] ids)
    {
        return blogArticleTagMapper.deleteBlogArticleTagByIds(ids);
    }

    /**
     * 删除博客文章标签信息
     * 
     * @param id 博客文章标签主键
     * @return 结果
     */
    @Override
    public int deleteBlogArticleTagById(Long id)
    {
        return blogArticleTagMapper.deleteBlogArticleTagById(id);
    }
}
