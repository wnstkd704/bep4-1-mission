package com.back.boundedContext.shared.market.event;

import com.back.boundedContext.shared.market.dto.MarketMemberDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MarketMemberCreatedEvent {
    private final MarketMemberDto member;
}