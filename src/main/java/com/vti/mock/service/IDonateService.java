package com.vti.mock.service;

import com.vti.mock.form.donate.CreateDonateForm;
import com.vti.mock.form.donate.UpdateDonateForm;
import com.vti.mock.form.user.UpdateUserForm;
import com.vti.mock.model.Donate;

import java.util.List;

public interface IDonateService {
    List<Donate> getAll();
    List<Donate> gets();
    Donate getById(int id);
    Donate create(CreateDonateForm form);
    Donate update(int id, UpdateDonateForm form);
    void delete(int id);
}
