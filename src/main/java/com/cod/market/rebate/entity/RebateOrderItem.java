package com.cod.market.rebate.entity;


import com.cod.market.base.entity.BaseEntity;
import com.cod.market.member.entity.Member;
import com.cod.market.order.entity.Order;
import com.cod.market.order.entity.OrderItem;
import com.cod.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
//rebate >> 캐시백같은혜택
public class RebateOrderItem extends BaseEntity {
    @ManyToOne(fetch = LAZY)
    private Order order;
    @ManyToOne(fetch = LAZY)
    private OrderItem orderItem;
    @ManyToOne(fetch = LAZY)
    private Product product;

    private int price;
    private int payPrice;
    private boolean isPaid;
    private LocalDateTime payDate;
}
