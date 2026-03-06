package com.ashcode.ashcode.contracts;

import java.util.List;

import com.ashcode.ashcode.dtos.project.FileContentResponse;
import com.ashcode.ashcode.dtos.project.FileNode;

public interface FileService {

    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);

}
