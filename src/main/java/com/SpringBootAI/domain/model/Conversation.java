package com.SpringBootAI.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conversation {
    private Long id;
    private UUID historyId;
    private String userMessage;
    private String assistantResponse;
    private LocalDateTime timestamp;
}