package com.example.demo.seervice.impl;

import com.example.demo.model.ListMoto;
import com.example.demo.repository.ListMotoRepository;
import com.example.demo.seervice.ListMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ListMotoServiceimpl implements ListMotoService {
 @Autowired
    ListMotoRepository listMotoRepository ;

    @Override
    public List<ListMoto> findAll() {
        return listMotoRepository.findAll();
    }

    @Override
    public List<ListMoto> findAllByidModernClassic() {
        return listMotoRepository.findAllByidModernClassic();
    }

    @Override
    public List<ListMoto> findAllByidCruiser() {
        return listMotoRepository.findAllByidCruiser();
    }

    @Override
    public List<ListMoto> findAllByidRoadSters() {
        return listMotoRepository.findAllByidRoadSters();
    }

    @Override
    public List<ListMoto> findAllByidAdventur() {
        return listMotoRepository.findAllByidAdventur();
    }

    @Override
    public List<ListMoto> findAllByidRoket() {
        return listMotoRepository.findAllByidRoket();
    }

    @Override
    public ListMoto findById(long id) {
        return listMotoRepository.findById(id).orElse(null);
    }


    @Override
    public Page<ListMoto> findAllListMoto(Pageable pageable) {
        return listMotoRepository.findAll(pageable);
    }

    @Override
    public void save(ListMoto listMoto) {
        listMotoRepository.save(listMoto) ;
    }

    @Override
    public void delete(ListMoto listMoto) {
        listMotoRepository.delete(listMoto);
    }


}
