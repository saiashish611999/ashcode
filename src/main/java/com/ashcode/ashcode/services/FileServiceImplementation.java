package com.ashcode.ashcode.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.FileService;
import com.ashcode.ashcode.dtos.project.FileContentResponse;
import com.ashcode.ashcode.dtos.project.FileNode;

@Service
public class FileServiceImplementation implements FileService {

    @Override
    public List<FileNode> getFileTree(Long projectId, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFileTree'");
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFileContent'");
    }

}
