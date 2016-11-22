package larry
import Role
import User

class BootStrap {

    def init = { servletContext ->
      Role admin = new Role("ROLE_ADMIN").save()
      User user1 = new User("admin", "pass").save()
      UserRole.create(user1, admin, true)

      Role user = new Role("ROLE_USER").save()
      User user2 = new User("user", "pass").save()
      UserRome.creat(user2, user, true)

    }
    def destroy = {
    }
}
