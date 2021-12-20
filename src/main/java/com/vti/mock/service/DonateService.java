package com.vti.mock.service;

import com.vti.mock.form.donate.CreateDonateForm;
import com.vti.mock.form.donate.UpdateDonateForm;
import com.vti.mock.form.user.UpdateUserForm;
import com.vti.mock.model.Donate;
import com.vti.mock.repository.DonateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonateService implements IDonateService{
    @Autowired
    private DonateRepository donateRepository;

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public List gets() {
        return null;
    }

    @Override
    public Donate getById(int id) {
        Optional<Donate> optional = donateRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Donate create(CreateDonateForm form) {
        return null;
    }

    @Override
    public Donate update(int id, UpdateDonateForm form) {
        Donate donate = form.toDonate();
        donate.setId(id);
        donate = donateRepository.save(donate);
        return donate;
    }


    @Override
    public void delete(int id) {
        donateRepository.deleteById(id);
    }
}
