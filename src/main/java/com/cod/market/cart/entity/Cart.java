package com.cod.market.cart.entity;

import com.cod.market.base.entity.BaseEntity;
import com.cod.market.member.entity.Member;
import com.cod.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@Entity
@SuperBuilder
public class Cart extends BaseEntity {
    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;
}
