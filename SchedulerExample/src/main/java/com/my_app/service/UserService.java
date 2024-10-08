package com.my_app.service;


import com.my_app.dto.UserDto;
import com.my_app.exception.ResourceNotFoundException;
import com.my_app.exception.UserAlreadyExistException;

public interface UserService {
    public UserDto createUser(UserDto userDto) throws UserAlreadyExistException;

//    public UserDto getUserById(Integer userId) throws ResourceNotFoundException;

    public UserDto updateUser(UserDto userDto , Integer userId);

   public void deleteUser(Integer userId) throws ResourceNotFoundException;

//    public List<UserDto> getUserByBrokerProfileId(Integer brokerProfileId);
}
