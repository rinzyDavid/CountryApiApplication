package com.agpay.test.controller;

import com.agpay.test.controller.dto.Country;
import com.agpay.test.controller.dto.ResponseDto;
import com.agpay.test.data.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author David
 */
@RestController
@RequestMapping("api/v1")
public class CountryRestController {

    private final CountryService countryService;

    public CountryRestController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public ResponseDto fetchCountries(@RequestParam("prevPage") int prev,
                                      @RequestParam("nextPage") int next,
                                      @RequestParam("pageSize") int size)throws Exception{
        return ResponseDto.builder()
                .withData(countryService.fetchCountries(prev, next, size))
                .withStatus(HttpStatus.OK.value())
                .build();
    }

    @GetMapping("/countries/{search}")
    public ResponseDto searchCountry(@PathVariable("search")String searchStr){
        return ResponseDto.builder()
                .withData(countryService.searchCountry(searchStr))
                .withStatus(HttpStatus.OK.value())
                .build();
    }

    @PostMapping("/countries")
    public ResponseEntity<HttpStatus> addCountry(@RequestBody Country country)throws Exception{
        countryService.addCountry(country.getName());
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
