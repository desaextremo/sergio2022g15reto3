package com.g15.jpa.service;

import com.g15.jpa.entity.Category;
import com.g15.jpa.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desarrollo
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getCategory(){
        return categoryRepository.findAll();
    } 
}
