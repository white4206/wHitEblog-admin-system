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
import com.ruoyi.system.domain.IdentityTag;
import com.ruoyi.system.service.IIdentityTagService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 身份标签Controller
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@RestController
@RequestMapping("/system/identityTag")
public class IdentityTagController extends BaseController
{
    @Autowired
    private IIdentityTagService identityTagService;

    /**
     * 查询身份标签列表
     */
    @PreAuthorize("@ss.hasPermi('system:identityTag:list')")
    @GetMapping("/list")
    public TableDataInfo list(IdentityTag identityTag)
    {
        startPage();
        List<IdentityTag> list = identityTagService.selectIdentityTagList(identityTag);
        return getDataTable(list);
    }

    /**
     * 导出身份标签列表
     */
    @PreAuthorize("@ss.hasPermi('system:identityTag:export')")
    @Log(title = "身份标签", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IdentityTag identityTag)
    {
        List<IdentityTag> list = identityTagService.selectIdentityTagList(identityTag);
        ExcelUtil<IdentityTag> util = new ExcelUtil<IdentityTag>(IdentityTag.class);
        util.exportExcel(response, list, "身份标签数据");
    }

    /**
     * 获取身份标签详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:identityTag:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(identityTagService.selectIdentityTagById(id));
    }

    /**
     * 新增身份标签
     */
    @PreAuthorize("@ss.hasPermi('system:identityTag:add')")
    @Log(title = "身份标签", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IdentityTag identityTag)
    {
        return toAjax(identityTagService.insertIdentityTag(identityTag));
    }

    /**
     * 修改身份标签
     */
    @PreAuthorize("@ss.hasPermi('system:identityTag:edit')")
    @Log(title = "身份标签", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IdentityTag identityTag)
    {
        return toAjax(identityTagService.updateIdentityTag(identityTag));
    }

    /**
     * 删除身份标签
     */
    @PreAuthorize("@ss.hasPermi('system:identityTag:remove')")
    @Log(title = "身份标签", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(identityTagService.deleteIdentityTagByIds(ids));
    }
}
