package main.java.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import main.java.domain.Crowdfunding;

@Repository
@Transactional
public class CrowdfundingDao extends BaseDao<Crowdfunding>
{
    public List<Crowdfunding> findAll()
    {
        return find("from Crowdfunding c");
    }
}
