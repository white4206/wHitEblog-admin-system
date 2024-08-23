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
import com.ruoyi.system.domain.IpAddress;
import com.ruoyi.system.service.IIpAddressService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * IP地址 Controller
 * 
 * @author ruoyi
 * @date 2024-08-21
 */
@RestController
@RequestMapping("/system/ipAddress")
public class IpAddressController extends BaseController
{
    @Autowired
    private IIpAddressService ipAddressService;

    /**
     * 查询IP地址 列表
     */
    @PreAuthorize("@ss.hasPermi('system:ipAddress:list')")
    @GetMapping("/list")
    public TableDataInfo list(IpAddress ipAddress)
    {
        startPage();
        List<IpAddress> list = ipAddressService.selectIpAddressList(ipAddress);
        return getDataTable(list);
    }

    /**
     * 导出IP地址 列表
     */
    @PreAuthorize("@ss.hasPermi('system:ipAddress:export')")
    @Log(title = "IP地址 ", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, IpAddress ipAddress)
    {
        List<IpAddress> list = ipAddressService.selectIpAddressList(ipAddress);
        ExcelUtil<IpAddress> util = new ExcelUtil<IpAddress>(IpAddress.class);
        util.exportExcel(response, list, "IP地址 数据");
    }

    /**
     * 获取IP地址 详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ipAddress:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ipAddressService.selectIpAddressById(id));
    }

    /**
     * 新增IP地址 
     */
    @PreAuthorize("@ss.hasPermi('system:ipAddress:add')")
    @Log(title = "IP地址 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody IpAddress ipAddress)
    {
        return toAjax(ipAddressService.insertIpAddress(ipAddress));
    }

    /**
     * 修改IP地址 
     */
    @PreAuthorize("@ss.hasPermi('system:ipAddress:edit')")
    @Log(title = "IP地址 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody IpAddress ipAddress)
    {
        return toAjax(ipAddressService.updateIpAddress(ipAddress));
    }

    /**
     * 删除IP地址 
     */
    @PreAuthorize("@ss.hasPermi('system:ipAddress:remove')")
    @Log(title = "IP地址 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ipAddressService.deleteIpAddressByIds(ids));
    }
}
