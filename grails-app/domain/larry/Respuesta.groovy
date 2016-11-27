package larry


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Respuesta {
  String texto
  boolean res
  String username
  int idPreg
}
