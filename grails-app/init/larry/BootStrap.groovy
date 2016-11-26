package larry
import larry.Role
import larry.User
import larry.Pregunta
import larry.Respuesta
import larry.Categoria

class BootStrap {

    def init = { servletContext ->
      Role admin = new Role("ROLE_ADMIN").save()
      User user1 = new User("admin", "pass").save()
      UserRole.create(user1, admin, true)

      Role user = new Role("ROLE_USER").save()
      User user2 = new User("user", "pass").save()
      UserRole.create(user2, user, true)

      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"1 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"2 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"3 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"4 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"5 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"6 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"7 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"8 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"9 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()
      new Pregunta(texto:"ed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ", status:"NO RESUELTA", tiutlo:"10 Lorem ipsum dolor sit amet, consectetur adipiscing elit").save()


    }
    def destroy = {
    }
}
