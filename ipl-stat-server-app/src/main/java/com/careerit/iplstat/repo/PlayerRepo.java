package com.careerit.iplstat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerit.iplstat.domain.Player;

public interface PlayerRepo extends JpaRepository<Player,Long>{

}
