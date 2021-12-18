package com.vti.mock.service;

import java.util.List;

public interface IProgramService {
    List getAll();
    List gets();
    void create();
    void update();
    void delete(int id);
}
