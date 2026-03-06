package com.ashcode.ashcode.dtos.project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modifiedAt,
        Long size,
        String type) {

}
