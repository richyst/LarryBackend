package larry

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import grails.converters.*

class RespuestaController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RespuestaController() {
        super(Respuesta)
    }
    def index() {
        respond Respuesta.list()
    }
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    def save(Respuesta respuesta){
      respuesta.save(flush:true,failOnError:true)
    }
}
