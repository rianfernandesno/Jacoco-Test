package com.example.dscommerce.services;

import com.example.dscommerce.Factory.CategoryFactory;
import com.example.dscommerce.dto.CategoryDTO;
import com.example.dscommerce.entities.Category;
import com.example.dscommerce.repositories.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith({SpringExtension.class})
public class CategoryServiceTests {

    @InjectMocks
    private CategoryService service;

    @Mock
    private CategoryRepository repository;

    private Category category;
    private List<Category> list;

    @BeforeEach
    void setUp() throws Exception{
        category = CategoryFactory.createCategory();

        list = new ArrayList<>();
        list.add(category);

        Mockito.when(repository.findAll()).thenReturn(list);
    }


    @Test
    public void findAllShouldReturnListCategoryDTO(){

        List<CategoryDTO> result = service.findAll();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(result.size(), list.size());
        Assertions.assertEquals(result.get(0).getId(), category.getId());
        Assertions.assertEquals(result.get(0).getName(), category.getName());

    }
}
