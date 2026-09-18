package com.back.boundedContext.shared.member.event;

import com.back.boundedContext.shared.member.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberJoinedEvent {
    private final MemberDto member;
}