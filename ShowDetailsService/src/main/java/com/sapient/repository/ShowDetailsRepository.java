package com.sapient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.sapient.entity.ShowDetails;

@Repository
public interface ShowDetailsRepository extends JpaRepository<ShowDetails, Long> {

}
