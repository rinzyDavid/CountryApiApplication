package com.agpay.test.data.service;

import com.agpay.test.data.AppData;
import com.agpay.test.data.model.Page;
import org.springframework.stereotype.Service;

@Service
public class CountryService {


    public Page fetchCountries(int prev,int next, int size)throws Exception{
        return AppData.getCountries(prev, next, size);
    }

    public Page searchCountry(String country){
        return AppData.searchCountry(country);
    }

    public void addCountry(String country)throws Exception{
        AppData.addCountry(country);
    }
}
