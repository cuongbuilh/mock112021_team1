package com.vti.mock.service;

import java.util.List;

public interface IImagesService {
    List getAll();
    List gets();
    void create();
    void update();
    void delete(int id);
}
