package com.example.naverOpenApi.wishlist.repository;

import com.example.naverOpenApi.db.MemoryDbRepositoryAbstract;
import com.example.naverOpenApi.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}