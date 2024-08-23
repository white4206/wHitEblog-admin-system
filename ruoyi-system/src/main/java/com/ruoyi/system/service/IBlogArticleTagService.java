package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BlogArticleTag;

/**
 * 博客文章标签Service接口
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
public interface IBlogArticleTagService 
{
    /**
     * 查询博客文章标签
     * 
     * @param id 博客文章标签主键
     * @return 博客文章标签
     */
    public BlogArticleTag selectBlogArticleTagById(Long id);

    /**
     * 查询博客文章标签列表
     * 
     * @param blogArticleTag 博客文章标签
     * @return 博客文章标签集合
     */
    public List<BlogArticleTag> selectBlogArticleTagList(BlogArticleTag blogArticleTag);

    /**
     * 新增博客文章标签
     * 
     * @param blogArticleTag 博客文章标签
     * @return 结果
     */
    public int insertBlogArticleTag(BlogArticleTag blogArticleTag);

    /**
     * 修改博客文章标签
     * 
     * @param blogArticleTag 博客文章标签
     * @return 结果
     */
    public int updateBlogArticleTag(BlogArticleTag blogArticleTag);

    /**
     * 批量删除博客文章标签
     * 
     * @param ids 需要删除的博客文章标签主键集合
     * @return 结果
     */
    public int deleteBlogArticleTagByIds(Long[] ids);

    /**
     * 删除博客文章标签信息
     * 
     * @param id 博客文章标签主键
     * @return 结果
     */
    public int deleteBlogArticleTagById(Long id);
}
