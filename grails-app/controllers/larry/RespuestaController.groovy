package larry


import grails.rest.*
import grails.converters.*

class RespuestaController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RespuestaController() {
        super(Respuesta)
    }
    @Override
    def index() {
        respond Respuesta.list()
    }
}
