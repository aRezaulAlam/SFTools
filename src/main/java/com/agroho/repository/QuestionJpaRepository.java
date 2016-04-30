package com.agroho.repository;

import com.agroho.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by USER on 4/22/2016.
 */
@Repository
public interface QuestionJpaRepository extends JpaRepository<Question,Long> {
}
