package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // För JUnit 5
class FoodServiceTest {

    // Klass vi vill testa
    FoodService foodService;

    @Mock
    FoodRepository mockRepository;

    @BeforeEach
    public void init() {
        foodService = new FoodService(mockRepository);
    }

    @Test
    void getFoods() {
        Food mockFood = new Food("1", "Pasta", true, true);

        when(mockRepository.findAll())
                .thenReturn(Arrays.asList(mockFood));

// ------------------------------------------------

        // Anropa våran metod
        List<Food> actualList = foodService.getFoods();

// ------------------------------------------------

        assertEquals(mockFood.getId(), actualList.get(0).getId());
        assertEquals(mockFood.getName(), actualList.get(0).getName());
        assertEquals(1, actualList.size());
        verify(mockRepository).findAll();
    }

    @Test
    void saveNewFood() {


    }

    @Test
    void getCookableFoods() {
    }
}





















