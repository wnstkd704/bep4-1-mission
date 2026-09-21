package com.back.boundedContext.shared.cash.event;

import com.back.boundedContext.shared.cash.dto.CashMemberDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CashMemberCreatedEvent {
    private final CashMemberDto member;
}