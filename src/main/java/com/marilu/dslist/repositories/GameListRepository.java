package com.marilu.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marilu.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
