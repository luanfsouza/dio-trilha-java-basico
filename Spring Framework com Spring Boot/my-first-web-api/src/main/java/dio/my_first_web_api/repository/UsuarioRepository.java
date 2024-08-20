package dio.my_first_web_api.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import dio.my_first_web_api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositorio");
        } else
            System.out.println("UPDATE - recebendo o usuário na camdada de repositorio");
        System.err.println(usuario);
        //return usuario;

    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para ser deletado\n", id);
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "valeria", "12345678"));
        usuarios.add(new Usuario(55, "maria", "12345678"));
        usuarios.add(new Usuario(105, "jjoacquim", "12345678"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o Id: %d do usuario.\n", id);
        return new Usuario(id, "novo usuario", "123");
    }

    public Usuario findByUsername(String username) {
        System.out.println("FIND/username - Recebendo o username: " + username);
        return new Usuario(10, username, "123");

    }

}
