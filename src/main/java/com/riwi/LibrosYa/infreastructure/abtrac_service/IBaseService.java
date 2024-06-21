package com.riwi.LibrosYa.infreastructure.abtrac_service;

import org.springframework.data.domain.Page;

public interface IBaseService <RQ, RS, ID> {
    public Page<RS> getAll(int page, int size);
    public RS finById(ID id);
    public RS create(RQ request);
    public RS update (RQ request, ID id);
    public void delete (ID id);
}
