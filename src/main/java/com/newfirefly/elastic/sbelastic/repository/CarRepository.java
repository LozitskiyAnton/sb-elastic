package com.newfirefly.elastic.sbelastic.repository;

import com.newfirefly.elastic.sbelastic.model.CarModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CarRepository extends ElasticsearchRepository<CarModel, String> {

}
