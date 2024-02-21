package com.example.naveropenApi.wishlist.repository;

import com.example.naveropenApi.db.MemoryDbRepositoryAbstract;
import com.example.naveropenApi.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}
