package com.plantory.mapper;

import com.plantory.domain.Plant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PlantMapper {
    List<Plant> findAll();
    
    Plant findById(Long id);
    
    List<Plant> findByCategory(String category);
    
    List<Plant> findTopTen();
    
    List<Plant> findForBeginners();
    
    List<Plant> findByFilter(Map<String, Object> filterParams);
    
    int insert(Plant plant);
    
    int update(Plant plant);
    
    int delete(Long id);
    
    int updateStock(@Param("id") Long id, @Param("quantity") int quantity);
}