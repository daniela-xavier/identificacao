package com.identificacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

public interface IRepository extends JpaRepository<Cliente, Long> {

  //  Optional<Cliente> findByFilter(Cliente cliente);
}
