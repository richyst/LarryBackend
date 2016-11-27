package larry


import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import grails.converters.*

class PreguntaController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PreguntaController() {
        super(Pregunta)
    }

    @Override
    def index() {
        respond Pregunta.list()
    }
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    def save(Pregunta pregunta){
      pregunta.save(flush:true,failOnError:true)
    }
}
