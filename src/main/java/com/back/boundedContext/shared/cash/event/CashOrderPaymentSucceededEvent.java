package com.back.boundedContext.shared.cash.event;

import com.back.boundedContext.shared.market.dto.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CashOrderPaymentSucceededEvent {
    private final OrderDto order;
    private final long pgPaymentAmount;
}
