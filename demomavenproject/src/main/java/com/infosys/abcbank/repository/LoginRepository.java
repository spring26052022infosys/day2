package com.infosys.abcbank.repository;

import java.util.HashMap;
import java.util.Map;

import com.infosys.abcbank.dto.CustomerDTO;
// passing the username
// Searching that username in map
// username is acting as a key value
// with get method of map we are reading the value
public interface LoginRepository {
        public CustomerDTO validateUser(String userName);
         
}
