package larry


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
}
