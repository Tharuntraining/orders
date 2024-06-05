package com.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Orders;

@Repository
public interface UserOrdersDao extends JpaRepository<Orders, Integer> {

}
