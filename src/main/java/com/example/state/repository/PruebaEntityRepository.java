package com.example.state.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.state.dto.PruebaEntity;

import scala.Int;

public interface PruebaEntityRepository extends JpaRepository<PruebaEntity, Integer> {

}