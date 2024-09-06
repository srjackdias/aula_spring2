package com.bibliosenaiTres.bibliosenaiTres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.bibliosenaiTres.bibliosenaiTres.entities.TimeFutebolEntity;
import com.bibliosenaiTres.bibliosenaiTres.repositories.TimeFutebolRepository;

@Service
public class TimeFutebolService {

    @Autowired
    TimeFutebolRepository timeFutebolRepository;

    public List<TimeFutebolEntity> getAllTimes() {

        return timeFutebolRepository.findAll();

    }

    public void findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
