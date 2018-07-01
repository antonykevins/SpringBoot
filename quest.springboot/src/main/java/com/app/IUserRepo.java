package com.app;

import org.springframework.data.repository.CrudRepository;
//Interface that extends CRUD repository (Create , Read , Update , Delete)
public interface IUserRepo  extends CrudRepository<User, String>  {

}
