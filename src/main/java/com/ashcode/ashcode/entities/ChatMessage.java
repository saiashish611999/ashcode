package com.ashcode.ashcode.entities;

import java.time.Instant;

import com.ashcode.ashcode.enums.MessageRole;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;

    ChatSession chatSession;

    String content;

    String toolCalls;

    Integer tokensUsed;

    Instant createdAt;

    MessageRole role;

}
