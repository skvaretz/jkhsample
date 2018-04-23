package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.entity.FlatEntity;
import ru.itpark.entity.IndicatorEntity;
import ru.itpark.entity.MeterEntity;
import ru.itpark.entity.ServicesEntity;
import ru.itpark.repository.IndicatorRepository;
import ru.itpark.repository.FlatRepository;
import ru.itpark.repository.MeterRepository;
import ru.itpark.repository.ServiceRepository;

import java.util.List;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@Service
public class IndicatorService {
    private static IndicatorRepository repository = null;
    private FlatRepository flatRepository;
    private MeterRepository meterRepository;
    private ServiceRepository serviceRepository;


    @Autowired
    public IndicatorService(IndicatorRepository repository) {
        this.repository = repository;
        this.flatRepository = flatRepository;
        this.meterRepository = meterRepository;
        this.serviceRepository = serviceRepository;
    }

    public static List<IndicatorEntity> findAll() {
        return repository.findAll();
    }



    public IndicatorEntity findOne(long id) {
        return repository.findOne(id);
    }




    public void save(IndicatorEntity indicator) {
        repository.save(indicator);
    }

    public void saveall(long id,  String prevDt, String prevValue, String curDt,  String curValue, long meter, long flat, long service) {
        IndicatorEntity indicatorEntity = repository.findOne(id);//eventRepository.getOne(registrationType.getEvent_id());
        MeterEntity meterEntity = meterRepository.findOne(meter);
        FlatEntity flatEntity   = flatRepository.findOne(flat);
        ServicesEntity servicesEntity = serviceRepository.findOne(service);

        IndicatorEntity indicatorEntityResult = new IndicatorEntity ( id, prevDt,  prevValue,  curDt,   curValue,  meter,  flat,  service);
        IndicatorRepository.saveall(indicatorEntityResult);
        ;
        // Long g = registrationResult.getId();
        //  return g;
    }

    public void delete(long id) {
        repository.delete(id);
    }


}
