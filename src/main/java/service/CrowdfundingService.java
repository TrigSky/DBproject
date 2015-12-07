package main.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.dao.CrowdfundingDao;
import main.java.domain.Crowdfunding;

@Service
public class CrowdfundingService
{
    @Autowired
    private CrowdfundingDao crowdfundingDao;

    public List<Crowdfunding> findAllCF()
    {
        return crowdfundingDao.findAll();
    }
}
