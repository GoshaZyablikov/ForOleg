package com.rw.orderbuilder.Service;

import com.rw.orderbuilder.Model.postgres.PersonnelModel;
import com.rw.orderbuilder.Repository.PersonnelModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelModelService {
    private final PersonnelModelRepository personnelModelRepository;

    @Autowired
    public PersonnelModelService(PersonnelModelRepository personnelModelRepository) {
        this.personnelModelRepository = personnelModelRepository;
    }

    public PersonnelModel save(PersonnelModel personnelModel) {
        return personnelModelRepository.save(personnelModel);
    }
}
