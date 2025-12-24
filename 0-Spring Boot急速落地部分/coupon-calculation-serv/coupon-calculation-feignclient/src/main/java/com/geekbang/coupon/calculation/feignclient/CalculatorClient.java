package com.geekbang.coupon.calculation.feignclient;

import com.geekbang.coupon.calculation.api.beans.ShoppingCart;
import com.geekbang.coupon.calculation.api.beans.SimulationOrder;
import com.geekbang.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name = "coupon-calculation-serv",path = "/calculator")
public interface CalculatorClient {

    // 优惠券结算
    @PostMapping("/checkout")
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart settlement);

    // 优惠券列表挨个试算
    // 给客户提示每个可用券的优惠额度，帮助挑选
    @PostMapping("/simulate")
    SimulationResponse simulate(@RequestBody SimulationOrder simulator);
}
