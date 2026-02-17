package br.com.joaolirarosas.coupon_outforce.coupon.application.api;

import br.com.joaolirarosas.coupon_outforce.coupon.application.api.request.CouponRequest;
import br.com.joaolirarosas.coupon_outforce.coupon.application.api.response.CouponResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/cupon")
public interface CouponApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CouponResponse createCoupon(@RequestBody @Valid CouponRequest couponRequest);

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    CouponResponse detailCoupon(@PathVariable UUID id);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteCoupon(@PathVariable UUID id);
}
