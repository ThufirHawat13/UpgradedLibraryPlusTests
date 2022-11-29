package com.library.services;

import com.library.models.LibraryUser;
import com.library.repositories.LibraryUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibraryUserService {

  private final LibraryUserRepository libraryUserRepository;

  @Autowired
  public LibraryUserService(LibraryUserRepository libraryUserRepository) {
    this.libraryUserRepository = libraryUserRepository;
  }

  public LibraryUser findByUsername(String username) {
    Optional<LibraryUser> libraryUser = libraryUserRepository.findByUsername(username);

    return libraryUser.orElse(null);
  }

  public List<LibraryUser> showAll() {
    return libraryUserRepository.findAll();
  }
}
