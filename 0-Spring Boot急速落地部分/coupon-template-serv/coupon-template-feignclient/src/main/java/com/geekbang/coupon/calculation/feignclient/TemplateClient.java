package com.geekbang.coupon.calculation.feignclient;

import com.geekbang.coupon.template.api.beans.CouponTemplateInfo;
import com.geekbang.coupon.template.api.beans.PagedCouponTemplateInfo;
import com.geekbang.coupon.template.api.beans.TemplateSearchParams;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;

/**
 * @author bujiatang
 */

@FeignClient(name = "coupon-template-serv",path = "/template")
public interface TemplateClient {

    // 优惠券结算
    // 创建优惠券
    @PostMapping("/addTemplate")
    CouponTemplateInfo addTemplate(CouponTemplateInfo request);

    @PostMapping("/cloneTemplate")
    CouponTemplateInfo cloneTemplate(Long templateId);

    // 读取优惠券
    @GetMapping("/getTemplate")
    CouponTemplateInfo getTemplate(@RequestParam("id") Long id);


    // 批量获取
    @GetMapping("/getBatch")
    Map<Long, CouponTemplateInfo> getTemplateInfoMap(Collection<Long> ids);

    // 搜索模板
    @PostMapping("/search")
    PagedCouponTemplateInfo search(TemplateSearchParams request);

    // 优惠券无效化
    @DeleteMapping("/deleteTemplate")
    void deleteTemplate(Long id);

}
