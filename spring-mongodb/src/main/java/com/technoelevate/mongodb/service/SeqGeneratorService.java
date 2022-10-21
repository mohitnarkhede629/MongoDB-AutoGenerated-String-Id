package com.technoelevate.mongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.technoelevate.mongodb.entity.DbSequence;

@Service
public class SeqGeneratorService {


	@Autowired
	private MongoOperations mongoOperations;


	public int getSequenceNumber(String sequenceName) {

		Query query = new Query(Criteria.where("seqName").is(sequenceName));
		System.out.println(query.getFieldsObject());
		Update inc = new Update().inc("seqNo", 1);
		FindAndModifyOptions options = new FindAndModifyOptions();
		options.returnNew(true);
		DbSequence seqId = mongoOperations.findAndModify(query, inc, options, DbSequence.class);
		return seqId.getSeqNo();

	}

}
