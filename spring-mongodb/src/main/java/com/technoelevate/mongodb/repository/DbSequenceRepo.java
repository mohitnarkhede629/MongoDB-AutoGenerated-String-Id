package com.technoelevate.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.technoelevate.mongodb.entity.DbSequence;

@Repository
public interface DbSequenceRepo extends MongoRepository<DbSequence, String>{

}
