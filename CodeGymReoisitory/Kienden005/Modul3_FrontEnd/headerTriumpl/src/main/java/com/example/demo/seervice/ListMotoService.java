package com.example.demo.seervice;

import com.example.demo.model.ListMoto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ListMotoService extends Service<ListMoto> {
    List<ListMoto> findAllByidModernClassic();

    List<ListMoto> findAllByidCruiser();

    List<ListMoto> findAllByidRoadSters();

    List<ListMoto> findAllByidAdventur();

    List<ListMoto> findAllByidRoket();
    ListMoto findById(long id) ;

    Page<ListMoto> findAllListMoto(Pageable pageable);

    void save(ListMoto listMoto);
    void  delete(ListMoto listMoto) ;
}
