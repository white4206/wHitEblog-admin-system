package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.BlogArticleTag;
import com.ruoyi.system.service.IBlogArticleTagService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 博客文章标签Controller
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@RestController
@RequestMapping("/system/blogArticleTag")
public class BlogArticleTagController extends BaseController
{
    @Autowired
    private IBlogArticleTagService blogArticleTagService;

    /**
     * 查询博客文章标签列表
     */
    @PreAuthorize("@ss.hasPermi('system:blogArticleTag:list')")
    @GetMapping("/list")
    public TableDataInfo list(BlogArticleTag blogArticleTag)
    {
        startPage();
        List<BlogArticleTag> list = blogArticleTagService.selectBlogArticleTagList(blogArticleTag);
        return getDataTable(list);
    }

    /**
     * 导出博客文章标签列表
     */
    @PreAuthorize("@ss.hasPermi('system:blogArticleTag:export')")
    @Log(title = "博客文章标签", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BlogArticleTag blogArticleTag)
    {
        List<BlogArticleTag> list = blogArticleTagService.selectBlogArticleTagList(blogArticleTag);
        ExcelUtil<BlogArticleTag> util = new ExcelUtil<BlogArticleTag>(BlogArticleTag.class);
        util.exportExcel(response, list, "博客文章标签数据");
    }

    /**
     * 获取博客文章标签详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:blogArticleTag:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(blogArticleTagService.selectBlogArticleTagById(id));
    }

    /**
     * 新增博客文章标签
     */
    @PreAuthorize("@ss.hasPermi('system:blogArticleTag:add')")
    @Log(title = "博客文章标签", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BlogArticleTag blogArticleTag)
    {
        return toAjax(blogArticleTagService.insertBlogArticleTag(blogArticleTag));
    }

    /**
     * 修改博客文章标签
     */
    @PreAuthorize("@ss.hasPermi('system:blogArticleTag:edit')")
    @Log(title = "博客文章标签", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BlogArticleTag blogArticleTag)
    {
        return toAjax(blogArticleTagService.updateBlogArticleTag(blogArticleTag));
    }

    /**
     * 删除博客文章标签
     */
    @PreAuthorize("@ss.hasPermi('system:blogArticleTag:remove')")
    @Log(title = "博客文章标签", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(blogArticleTagService.deleteBlogArticleTagByIds(ids));
    }
}
