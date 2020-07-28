package com.it.deliver.dao;

import com.it.deliver.bean.RegraJuros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegraJurosDAO extends CrudRepository<RegraJuros,Long> {

    @Query("select r from RegraJuros r where r.dias <=3")
    public RegraJuros findByRegraJurosAteTresDias();
    @Query("select r from RegraJuros r where r.dias <3 and r.dias <= 5")
    public RegraJuros findByRegraJurosMaior3MenorIgual5();
    @Query("select r from RegraJuros r where r.dias > 5")
    public RegraJuros findByRegraJurosMaior5Dias();
}
