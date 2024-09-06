package com.rw.orderbuilder.Repository;

import com.rw.orderbuilder.Model.postgres.StatusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusModelRepository extends JpaRepository<StatusModel, Integer> {}
