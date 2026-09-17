package com.back.boundedContext.shared.post.event;

import com.back.boundedContext.shared.post.dto.PostCommentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PostCommentCreatedEvent {
    private final PostCommentDto postComment;
}