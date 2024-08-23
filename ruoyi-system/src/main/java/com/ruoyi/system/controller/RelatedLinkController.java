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
import com.ruoyi.system.domain.RelatedLink;
import com.ruoyi.system.service.IRelatedLinkService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 相关链接管理Controller
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@RestController
@RequestMapping("/system/relatedLink")
public class RelatedLinkController extends BaseController
{
    @Autowired
    private IRelatedLinkService relatedLinkService;

    /**
     * 查询相关链接管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:relatedLink:list')")
    @GetMapping("/list")
    public TableDataInfo list(RelatedLink relatedLink)
    {
        startPage();
        List<RelatedLink> list = relatedLinkService.selectRelatedLinkList(relatedLink);
        return getDataTable(list);
    }

    /**
     * 导出相关链接管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:relatedLink:export')")
    @Log(title = "相关链接管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RelatedLink relatedLink)
    {
        List<RelatedLink> list = relatedLinkService.selectRelatedLinkList(relatedLink);
        ExcelUtil<RelatedLink> util = new ExcelUtil<RelatedLink>(RelatedLink.class);
        util.exportExcel(response, list, "相关链接管理数据");
    }

    /**
     * 获取相关链接管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:relatedLink:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(relatedLinkService.selectRelatedLinkById(id));
    }

    /**
     * 新增相关链接管理
     */
    @PreAuthorize("@ss.hasPermi('system:relatedLink:add')")
    @Log(title = "相关链接管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RelatedLink relatedLink)
    {
        return toAjax(relatedLinkService.insertRelatedLink(relatedLink));
    }

    /**
     * 修改相关链接管理
     */
    @PreAuthorize("@ss.hasPermi('system:relatedLink:edit')")
    @Log(title = "相关链接管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RelatedLink relatedLink)
    {
        return toAjax(relatedLinkService.updateRelatedLink(relatedLink));
    }

    /**
     * 删除相关链接管理
     */
    @PreAuthorize("@ss.hasPermi('system:relatedLink:remove')")
    @Log(title = "相关链接管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(relatedLinkService.deleteRelatedLinkByIds(ids));
    }
}
