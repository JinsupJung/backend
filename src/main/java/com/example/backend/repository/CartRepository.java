package com.example.backend.repository;

import com.example.backend.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findByMemberId(int memberId);

    Cart findByMemberIdAndItemId(int memberId, int itemId);

    void deleteByMemberId(int memberId);
    void deleteByMemberIdAndItemId(int memberId, int itemId);

    void delete(Cart cart);
}