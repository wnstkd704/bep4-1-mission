package com.back.boundedContext.shared.post.event;

import com.back.boundedContext.shared.post.dto.PostDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostCreatedEvent {
    private final PostDto post;
}