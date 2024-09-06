package com.rw.orderbuilder.Service;

import com.rw.orderbuilder.Model.postgres.StatusModel;
import com.rw.orderbuilder.Repository.StatusModelRepository;
import org.springframework.stereotype.Service;

@Service
public class StatusModelService {
    private final StatusModelRepository statusModelRepository;

    public StatusModelService(StatusModelRepository statusModelRepository) {
        this.statusModelRepository = statusModelRepository;
    }

    public StatusModel save(StatusModel statusModel) {
        return statusModelRepository.save(statusModel);
    }
}
