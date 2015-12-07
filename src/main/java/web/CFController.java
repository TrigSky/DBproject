package main.java.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.domain.Crowdfunding;
import main.java.service.CrowdfundingService;

@RestController
public class CFController
{
    @Autowired
    private CrowdfundingService crowdfundingService;

    @RequestMapping(value = "/cf/findAll")
    public List<Crowdfunding> findAll()
    {
        return crowdfundingService.findAllCF();
    }
}
