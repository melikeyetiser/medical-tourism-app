package com.demo.medicaltourismapp.database.repository;

import com.demo.medicaltourismapp.database.entity.DoctorEntity;
import com.demo.medicaltourismapp.util.dbutil.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends BaseRepository<DoctorEntity> {
}
