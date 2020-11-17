package com.example.demo.repository;

import com.example.demo.model.ListMoto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ListMotoRepository extends JpaRepository<ListMoto,Long> {
     @Query(value = "select l from ListMoto l where l.categorite=1")
    List<ListMoto> findAllByidModernClassic();
    @Query(value = "select l from ListMoto l where l.categorite=2")
    List<ListMoto> findAllByidCruiser();
    @Query(value = "select l from ListMoto l where l.categorite=3")
    List<ListMoto> findAllByidRoadSters();
    @Query(value = "select l from ListMoto l where l.categorite=4")
    List<ListMoto> findAllByidAdventur();
    @Query(value = "select l from ListMoto l where l.categorite=5")
    List<ListMoto> findAllByidRoket();



}
