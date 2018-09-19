package com.bonc.ttms.gaming.server.web.admin.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bonc.ttms.gaming.server.commons.constant.DubboVersionConstant;
import com.bonc.ttms.gaming.server.domain.product.entity.ProductType;
import com.bonc.ttms.gaming.server.service.admin.api.product.ProductTypeService;
import com.bonc.ttms.gaming.server.web.admin.common.web.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RequestMapping("/type/")
@Controller
public class ProductTypeController {
    @Reference(version = DubboVersionConstant.DUBBO_GAMING_SERVICE_SERVER_ADMIN)
    private ProductTypeService productTypeService;

    @RequestMapping("listUI")
    public String listUI() {
        return "product/type_list";
    }

    @RequestMapping("editUI")
    public String editUI() {
        return "product/type_edit";
    }

    @RequestMapping("doFindGridTreeObjects")
    @ResponseBody
    public JsonResult doFindGridTreeObjects() {
        List<Map<String, Object>> list = productTypeService.findGridTreeObjects();
        return new JsonResult(list);
    }

    @RequestMapping("doFindZtreeObjects")
    @ResponseBody
    public JsonResult doFindZtreeObjects() {
        List<Map<String, Object>> list = productTypeService.findZtreeNodes();
        return new JsonResult(list);
    }


    /**
     * 执行删除动作
     *
     * @param id 为页面上选中的某条记录的id值
     */
    @RequestMapping("doDeleteObject")
    @ResponseBody
    public JsonResult doDeleteObject(
            Integer id) {
        productTypeService.deleteObject(id);
        return new JsonResult();
        //this.state=1
        //this.message=ok
    }

    @RequestMapping("doSaveObject")
    @ResponseBody
    public JsonResult doSaveObject(ProductType entity) {
        productTypeService.saveObject(entity);
        return new JsonResult();
    }

    @RequestMapping("doFindObjectById")
    @ResponseBody
    public JsonResult doFindObjectById(Integer id) {

        Map<String, Object> type = productTypeService.findMapById(id);
        return new JsonResult(type);
    }

    /**
     * 执行更新操作
     */
    @RequestMapping("doUpdateObject")
    @ResponseBody
    public JsonResult doUpdateObject(
            ProductType entity) {
        System.out.println("Controller.id=" + entity.getId());
        productTypeService.updateObject(entity);
        return new JsonResult();
    }
}

