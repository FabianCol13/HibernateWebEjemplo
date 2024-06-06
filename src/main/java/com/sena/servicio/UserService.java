package com.sena.servicio;

import com.sena.dao.UserDAO;
import com.sena.domain.User;
import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public List<User> ListarUsuarios() {
        return this.userDAO.listar();
    }

}
