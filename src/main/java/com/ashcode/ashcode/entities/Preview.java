package com.ashcode.ashcode.entities;

import java.time.Instant;

import com.ashcode.ashcode.enums.PreviewStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    Long id;

    Project project;

    String nameSpace;

    String podName;

    String previewUrl;

    Instant startedAt;

    Instant terminatedAt;

    Instant createdAt;

    PreviewStatus status;

}
