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
import com.ruoyi.system.domain.DailyRecommendation;
import com.ruoyi.system.service.IDailyRecommendationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 今日推荐管理 Controller
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
@RestController
@RequestMapping("/system/dailyRecommendation")
public class DailyRecommendationController extends BaseController
{
    @Autowired
    private IDailyRecommendationService dailyRecommendationService;

    /**
     * 查询今日推荐管理 列表
     */
    @PreAuthorize("@ss.hasPermi('system:dailyRecommendation:list')")
    @GetMapping("/list")
    public TableDataInfo list(DailyRecommendation dailyRecommendation)
    {
        startPage();
        List<DailyRecommendation> list = dailyRecommendationService.selectDailyRecommendationList(dailyRecommendation);
        return getDataTable(list);
    }

    /**
     * 导出今日推荐管理 列表
     */
    @PreAuthorize("@ss.hasPermi('system:dailyRecommendation:export')")
    @Log(title = "今日推荐管理 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DailyRecommendation dailyRecommendation)
    {
        List<DailyRecommendation> list = dailyRecommendationService.selectDailyRecommendationList(dailyRecommendation);
        ExcelUtil<DailyRecommendation> util = new ExcelUtil<DailyRecommendation>(DailyRecommendation.class);
        util.exportExcel(response, list, "今日推荐管理 数据");
    }

    /**
     * 获取今日推荐管理 详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:dailyRecommendation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dailyRecommendationService.selectDailyRecommendationById(id));
    }

    /**
     * 新增今日推荐管理 
     */
    @PreAuthorize("@ss.hasPermi('system:dailyRecommendation:add')")
    @Log(title = "今日推荐管理 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DailyRecommendation dailyRecommendation)
    {
        return toAjax(dailyRecommendationService.insertDailyRecommendation(dailyRecommendation));
    }

    /**
     * 修改今日推荐管理 
     */
    @PreAuthorize("@ss.hasPermi('system:dailyRecommendation:edit')")
    @Log(title = "今日推荐管理 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DailyRecommendation dailyRecommendation)
    {
        return toAjax(dailyRecommendationService.updateDailyRecommendation(dailyRecommendation));
    }

    /**
     * 删除今日推荐管理 
     */
    @PreAuthorize("@ss.hasPermi('system:dailyRecommendation:remove')")
    @Log(title = "今日推荐管理 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dailyRecommendationService.deleteDailyRecommendationByIds(ids));
    }
}
