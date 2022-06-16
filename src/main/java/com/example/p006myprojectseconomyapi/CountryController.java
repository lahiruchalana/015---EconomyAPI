package com.example.p006myprojectseconomyapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private CountryRepository countryRepository;

    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/all")
    public List<Country> getAll(){
        List<Country> countries = this.countryRepository.findAll();

        return countries;
    }

    @PutMapping
    public void insert(@RequestBody Country country){
        this.countryRepository.insert(country);
    }

    @PostMapping
    public void update(@RequestBody Country country){
        this.countryRepository.save(country);
    }

    @GetMapping("/value/{country_name}")
    public List<Country> getByCountry(@PathVariable("country_name") String country_name){
        List<Country> countries = this.countryRepository.findByCountry(country_name);

        return countries;
    }

}
