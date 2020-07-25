package com.it.deliver.dao;

import com.it.deliver.bean.Conta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface ContaDAO extends CrudRepository<Conta, Integer> {

    @Query("select c from Conta c join fetch c.regraJuros as r where r.dias > 3 and r.dias <5 and c.id = :id")
    public Conta findByContaAtrazoMaior3Menor5Dias(@Param("id") Integer id);

    @Query("select c from Conta c join fetch c.regraJuros as r where r.dias <=3 and c.id = :id")
    public Conta findByContaAtrazoAte3Dias(@Param("id") Integer id);

    @Query("select c from Conta c join fetch c.regraJuros as r where r.dias > 5 and c.id = :id")
    public Conta findByContaAtrazoMaior5Dias(@Param("id") Integer id);

}
