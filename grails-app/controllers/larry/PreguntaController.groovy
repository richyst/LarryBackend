package larry


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
}
