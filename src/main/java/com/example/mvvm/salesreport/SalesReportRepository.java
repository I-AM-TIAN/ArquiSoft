package com.example.mvvm.salesreport;

import com.example.mvvm.sale.Sale;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SalesReportRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Sale> findSalesByDate(String date) {
        String jpql = "SELECT s from Sale s WHERE s.date = :date";
        TypedQuery<Sale> query = entityManager.createQuery(jpql, Sale.class);
        query.setParameter("date", date);
        return query.getResultList();
    }

}
