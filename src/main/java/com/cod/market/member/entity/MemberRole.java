package com.cod.market.member.entity;

import lombok.Getter;

@Getter

public enum MemberRole {
    ADMIN("ADMIN"),
    MEMBER("MEMBER");

    private String value;
    MemberRole(String value) {
        this.value = value;
    }
}
