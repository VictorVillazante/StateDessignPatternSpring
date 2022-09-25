package com.example.state.service;

import java.util.List;

import com.example.state.dto.PostDTO;

public interface PostManagementService {
    List<PostDTO>list();
    Boolean add(PostDTO post);
    
}
