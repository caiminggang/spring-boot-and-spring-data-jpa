package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by asus on 2017/7/10.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRespository girlRespository;
    @Transactional
    public void insertTwo(){
        Girl girlA=new Girl();
        girlA.setAge(10);
        girlA.setCupsize("A");
        girlRespository.save(girlA);

        Girl girlB=new Girl();
        girlB.setAge(10);
        girlB.setCupsize("A");
        girlRespository.save(girlB);
    }
}
