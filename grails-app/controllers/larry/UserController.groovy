package larry


import grails.rest.*
import grails.converters.*

class UserController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UserController() {
        super(User)
    }
    @Override
    def index() {
        respond User.list()
    }
}
