package com.example.DATN_API.Reponsitories;

import com.example.DATN_API.Entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusReponsitory extends JpaRepository<StatusEntity, Integer> {
}
