package com.rw.orderbuilder.Repository;

import com.rw.orderbuilder.Model.postgres.PersonnelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelModelRepository extends JpaRepository<PersonnelModel, Integer> {}
