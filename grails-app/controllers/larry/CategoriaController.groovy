package larry


import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import grails.converters.*

class CategoriaController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CategoriaController() {
        super(Categoria)
    }
    @Override
    def index() {
        respond Categoria.list()
    }
    @Secured(['ROLE_ADMIN'])
    def save(Categoria categoria){
      categoria.save(flush:true,failOnError:true)
    }
}
