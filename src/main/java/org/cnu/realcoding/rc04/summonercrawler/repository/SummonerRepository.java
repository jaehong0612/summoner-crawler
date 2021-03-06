package org.cnu.realcoding.rc04.summonercrawler.repository;

import org.cnu.realcoding.rc04.summonercrawler.domain.SummonerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SummonerRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertSummonerDTO(SummonerDTO summonerDTO){
        mongoTemplate.insert(summonerDTO);
    }
}
